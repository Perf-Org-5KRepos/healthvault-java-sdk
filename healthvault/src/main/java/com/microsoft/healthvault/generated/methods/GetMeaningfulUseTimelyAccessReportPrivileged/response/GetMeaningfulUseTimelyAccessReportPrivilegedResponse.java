//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 12:00:41 PM PDT 
//


package com.microsoft.healthvault.generated.methods.GetMeaningfulUseTimelyAccessReportPrivileged.response;

import java.util.Date;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import com.microsoft.healthvault.generated.core.meaningfuluse.DataTextFormat;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.GetMeaningfulUseTimelyAccessReportPrivileged" xmlns:wc-meaningfulUse="urn:com.microsoft.wc.MeaningfulUse" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         Contains the response of the GetMeaningfulUseTimelyAccessReportPrivileged method request.
 *                     &lt;/summary&gt;
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
 *         &lt;element name="text-data" type="{urn:com.microsoft.wc.MeaningfulUse}DataTextFormat" minOccurs="0"/>
 *         &lt;element name="cursor" type="{urn:com.microsoft.wc.types}stringnz" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Root(name="")
@Order(elements = {
    "textData",
    "cursor"
})
public class GetMeaningfulUseTimelyAccessReportPrivilegedResponse {

    @Element(name = "text-data")
    protected DataTextFormat textData;
    protected String cursor;

    /**
     * Gets the value of the textData property.
     * 
     * @return
     *     possible object is
     *     {@link DataTextFormat }
     *     
     */
    public DataTextFormat getTextData() {
        return textData;
    }

    /**
     * Sets the value of the textData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTextFormat }
     *     
     */
    public void setTextData(DataTextFormat value) {
        this.textData = value;
    }

    /**
     * Gets the value of the cursor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCursor() {
        return cursor;
    }

    /**
     * Sets the value of the cursor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCursor(String value) {
        this.cursor = value;
    }

}