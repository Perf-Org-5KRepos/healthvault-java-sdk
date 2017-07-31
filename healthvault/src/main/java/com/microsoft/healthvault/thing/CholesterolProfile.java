//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.31 at 11:08:18 AM PDT 
//


package com.microsoft.healthvault.thing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.healthvault.types.ConcentrationValue;
import com.microsoft.healthvault.types.dates.DateTime;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:a="urn:com.microsoft.wc.thing.cholesterol-profile" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         Defines cholesterol reading in the blood.
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
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}date-time"/>
 *         &lt;element name="ldl" type="{urn:com.microsoft.wc.thing.types}concentration-value" minOccurs="0"/>
 *         &lt;element name="hdl" type="{urn:com.microsoft.wc.thing.types}concentration-value" minOccurs="0"/>
 *         &lt;element name="total-cholesterol" type="{urn:com.microsoft.wc.thing.types}concentration-value" minOccurs="0"/>
 *         &lt;element name="triglyceride" type="{urn:com.microsoft.wc.thing.types}concentration-value" minOccurs="0"/>
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
    "ldl",
    "hdl",
    "totalCholesterol",
    "triglyceride"
})
@XmlRootElement(name = "cholesterol-profile", namespace = "urn:com.microsoft.wc.thing.cholesterol-profile")
public class CholesterolProfile {

    @XmlElement(required = true)
    protected DateTime when;
    protected ConcentrationValue ldl;
    protected ConcentrationValue hdl;
    @XmlElement(name = "total-cholesterol")
    protected ConcentrationValue totalCholesterol;
    protected ConcentrationValue triglyceride;

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
     * Gets the value of the ldl property.
     * 
     * @return
     *     possible object is
     *     {@link ConcentrationValue }
     *     
     */
    public ConcentrationValue getLdl() {
        return ldl;
    }

    /**
     * Sets the value of the ldl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcentrationValue }
     *     
     */
    public void setLdl(ConcentrationValue value) {
        this.ldl = value;
    }

    /**
     * Gets the value of the hdl property.
     * 
     * @return
     *     possible object is
     *     {@link ConcentrationValue }
     *     
     */
    public ConcentrationValue getHdl() {
        return hdl;
    }

    /**
     * Sets the value of the hdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcentrationValue }
     *     
     */
    public void setHdl(ConcentrationValue value) {
        this.hdl = value;
    }

    /**
     * Gets the value of the totalCholesterol property.
     * 
     * @return
     *     possible object is
     *     {@link ConcentrationValue }
     *     
     */
    public ConcentrationValue getTotalCholesterol() {
        return totalCholesterol;
    }

    /**
     * Sets the value of the totalCholesterol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcentrationValue }
     *     
     */
    public void setTotalCholesterol(ConcentrationValue value) {
        this.totalCholesterol = value;
    }

    /**
     * Gets the value of the triglyceride property.
     * 
     * @return
     *     possible object is
     *     {@link ConcentrationValue }
     *     
     */
    public ConcentrationValue getTriglyceride() {
        return triglyceride;
    }

    /**
     * Sets the value of the triglyceride property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcentrationValue }
     *     
     */
    public void setTriglyceride(ConcentrationValue value) {
        this.triglyceride = value;
    }

}