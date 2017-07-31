//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.31 at 11:08:18 AM PDT 
//


package com.microsoft.healthvault.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.types.dates.ApproxDateTime;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;wrapper-class-name xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;DurationValue&lt;/wrapper-class-name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;
 *                     A pair of approximate date-times used to create a
 *                     range.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;
 *                     This type derives uses two approximate date-times to
 *                     provide a duration range.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for duration-value complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="duration-value">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="start-date" type="{urn:com.microsoft.wc.dates}approx-date-time"/>
 *         &lt;element name="end-date" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "duration-value", namespace = "urn:com.microsoft.wc.thing.types", propOrder = {
    "startDate",
    "endDate"
})
public class DurationValue {

    @XmlElement(name = "start-date", required = true)
    protected ApproxDateTime startDate;
    @XmlElement(name = "end-date")
    protected ApproxDateTime endDate;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApproxDateTime }
     *     
     */
    public ApproxDateTime getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproxDateTime }
     *     
     */
    public void setStartDate(ApproxDateTime value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApproxDateTime }
     *     
     */
    public ApproxDateTime getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproxDateTime }
     *     
     */
    public void setEndDate(ApproxDateTime value) {
        this.endDate = value;
    }

}
