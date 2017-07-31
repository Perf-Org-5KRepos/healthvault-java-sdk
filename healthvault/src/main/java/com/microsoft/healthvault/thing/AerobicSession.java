//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.31 at 11:08:18 AM PDT 
//


package com.microsoft.healthvault.thing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.types.AerobicLapSession;
import com.microsoft.healthvault.types.AerobicSessionSamples;
import com.microsoft.healthvault.types.dates.DateTime;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:a="urn:com.microsoft.wc.thing.aerobic" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         A single session of aerobic exercise.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:a="urn:com.microsoft.wc.thing.aerobic" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Note: Please use the new exercise type instead of this type.
 *                         &lt;br/&gt;
 *                         An aerobic session is a single instance of exercise like
 *                         running, biking, etc.&lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         &lt;element name="session" type="{urn:com.microsoft.wc.thing.types}aerobic-session"/>
 *         &lt;element name="session-samples" type="{urn:com.microsoft.wc.thing.types}aerobic-session-samples" minOccurs="0"/>
 *         &lt;element name="lap-session" type="{urn:com.microsoft.wc.thing.types}aerobic-lap-session" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "when",
    "session",
    "sessionSamples",
    "lapSession"
})
@XmlRootElement(name = "aerobic-session", namespace = "urn:com.microsoft.wc.thing.aerobic")
public class AerobicSession {

    @XmlElement(required = true)
    protected DateTime when;
    @XmlElement(required = true)
    protected com.microsoft.healthvault.types.AerobicSession session;
    @XmlElement(name = "session-samples")
    protected AerobicSessionSamples sessionSamples;
    @XmlElement(name = "lap-session")
    protected List<AerobicLapSession> lapSession;

    /**
     * Gets the value of the when property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setWhen(DateTime value) {
        this.when = value;
    }

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link com.microsoft.healthvault.types.AerobicSession }
     *     
     */
    public com.microsoft.healthvault.types.AerobicSession getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.microsoft.healthvault.types.AerobicSession }
     *     
     */
    public void setSession(com.microsoft.healthvault.types.AerobicSession value) {
        this.session = value;
    }

    /**
     * Gets the value of the sessionSamples property.
     * 
     * @return
     *     possible object is
     *     {@link AerobicSessionSamples }
     *     
     */
    public AerobicSessionSamples getSessionSamples() {
        return sessionSamples;
    }

    /**
     * Sets the value of the sessionSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerobicSessionSamples }
     *     
     */
    public void setSessionSamples(AerobicSessionSamples value) {
        this.sessionSamples = value;
    }

    /**
     * Gets the value of the lapSession property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lapSession property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLapSession().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerobicLapSession }
     * 
     * 
     */
    public List<AerobicLapSession> getLapSession() {
        if (lapSession == null) {
            lapSession = new ArrayList<AerobicLapSession>();
        }
        return this.lapSession;
    }

}
