/*
 *  Copyright (c) Microsoft Corporation
 *
 *	All rights reserved. 
 *
 *	MIT License
 *	Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 *  and associated documentation files (the ""Software""), to deal in the Software without
 *  restriction, including without limitation the rights to use, copy, modify, merge, publish,
 *  distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom
 *  the Software is furnished to do so, subject to the following conditions:
 *
 *	The above copyright notice and this permission notice shall be included in all copies or
 *  substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 *  BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *  NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.microsoft.hsg.android.simplexml;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.microsoft.hsg.Authenticator;
import com.microsoft.hsg.Connection;
import com.microsoft.hsg.HVAccessor;
import com.microsoft.hsg.HVSystemException;
import com.microsoft.hsg.Request;
import com.microsoft.hsg.Response;
import com.microsoft.hsg.SimpleSendStrategy;

// TODO: Auto-generated Javadoc
/**
 * The Class SodaAuthenticator.
 */
public class SodaAuthenticator implements Authenticator {
    
    /** The app id. */
    private String appId;
    
    /** The authentication secret. */
    private byte[] authenticationSecret;
    
    /** The shared secret. */
    private byte[] sharedSecret;
    
    /** The session token. */
    private String sessionToken;
    
    /** The accessor. */
    private HVAccessor accessor;
    
    /**
     * Instantiates a new application authenticator.
     * 
     * @param appId the app id
     * @param authenticationSecret the authentication secret
     */
    public SodaAuthenticator(
            String appId,
            byte[] authenticationSecret)
    {
        this.appId = appId;
        this.authenticationSecret = authenticationSecret;
        accessor = new HVAccessor();
        accessor.setSendStrategy(new SimpleSendStrategy());
    }
    
    /**
     * Gets the session token.
     * 
     * @return the session token
     */
    public String getSessionToken()
    {
        return sessionToken;
    }

    /**
     * Gets the app id.
     * 
     * @return the app id
     */
    public String getAppId()
    {
        return appId;
    }

    /**
     * Sets the app id.
     * 
     * @param appId the new app id
     */
    public void setAppId(String appId)
    {
        this.appId = appId;
    }
    
    /* (non-Javadoc)
     * @see com.microsoft.hsg.Authenticator#authenticate(com.microsoft.hsg.Connection, boolean)
     */
    public synchronized void authenticate(Connection connection, boolean force)
    {    
        if( !force &&
            sharedSecret != null &&
            sessionToken != null  )
        {
            connection.setSharedSecret(sharedSecret);
            connection.setSessionToken(sessionToken);
        }
        else
        {
            authenticate(connection);
        }
    }
    
    /**
     * Authenticate.
     * 
     * @param connection the connection
     */
    private  void authenticate(Connection connection)
    {    
        connection.setSharedSecret(null);
        connection.setSessionToken(null);
        Request castRequest = createAuthenticatedSessionTokenRequest(sharedSecret);
        accessor.send(castRequest, connection);
        Response response = accessor.getResponse();
        
        try
        {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(false);
            XmlPullParser parser= factory.newPullParser();    
            parser.setInput(response.getInputStream(), "utf8");
            
            XmlUtils.nextStartTag(parser, "response");
            XmlUtils.nextStartTag(parser, "status");
            XmlUtils.skipSubTree(parser);
            XmlUtils.nextStartTag(parser, "wc:info");
            
            
            //parser.require( XmlPullParser.START_TAG, PARENT_NAMESPACE, PARENT_NAME);
            while( parser.nextTag() != XmlPullParser.END_DOCUMENT ) {
              if ("shared-secret".equals(parser.getName())) {
                 sharedSecret = Base64.decodeBase64(parser.nextText().getBytes("UTF-8"));
                 break;
              }
              if ("token".equals(parser.getName())) {
                  sessionToken = parser.nextText();
              }
            }
        }
        catch(Exception e)
        {
            throw new HVSystemException("Failed to get token", e);
        }
        
        if (sessionToken == null)
        {
            throw new HVSystemException( "Application session token not found");
        }
        
        connection.setSessionToken(sessionToken);
        connection.setSharedSecret(sharedSecret);
    
    }
    
    /**
     * Creates the authenticated session token request.
     * 
     * @param sharedSecret the shared secret
     * 
     * @return the request
     */
    private Request createAuthenticatedSessionTokenRequest(
            byte[] sharedSecret) 
    {
        try 
        {
            StringBuilder contentBuilder = new StringBuilder();
            contentBuilder.append("<content><app-id>");
            contentBuilder.append(appId);
            contentBuilder.append("</app-id><hmac>HMACSHA256</hmac><signing-time>");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            contentBuilder.append(sdf.format(
                Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime()));
            contentBuilder.append("</signing-time></content>");
            String content = contentBuilder.toString();
              
            StringBuilder infoBuilder = new StringBuilder();
            infoBuilder.append("<info><auth-info><app-id>");
            infoBuilder.append(appId);
            infoBuilder.append("</app-id><credential><appserver2><hmacSig algName=\"HMACSHA256\">");
            infoBuilder.append(new String(Base64.encodeBase64(signContent(content.getBytes("UTF-8")))));
            infoBuilder.append("</hmacSig>");
            infoBuilder.append(content);
            infoBuilder.append("</appserver2></credential></auth-info></info>");
            
            //TODO: create CASTRequest extends Request to include specific details
            Request castRequest = new Request();
            castRequest.setMethodName("CreateAuthenticatedSessionToken");
            castRequest.setMethodVersion("2");
            castRequest.setInfo(infoBuilder.toString());
            
            return castRequest;
        }
        catch(Exception e)
        {
            throw new HVSystemException("Could not build CAST request", e);
        }
    }
    
    /**
     * Sign content.
     * 
     * @param content the content
     * 
     * @return the byte[]
     */
    private byte[] signContent(byte[] content) 
    {
        try {
            SecretKeySpec sks = new SecretKeySpec(authenticationSecret, "HmacSHA256");
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(sks);
                     
            return mac.doFinal(content);
        } catch (Exception e) {
            throw new HVSystemException("Could not sign request", e);
        }
    }
}
