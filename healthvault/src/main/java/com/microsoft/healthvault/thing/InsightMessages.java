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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsightMessages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsightMessages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="short" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsightMessages", namespace = "urn:com.microsoft.wc.thing.insight", propOrder = {
    "regular",
    "_short"
})
public class InsightMessages {

    protected String regular;
    @XmlElement(name = "short")
    protected String _short;

    /**
     * Gets the value of the regular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegular() {
        return regular;
    }

    /**
     * Sets the value of the regular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegular(String value) {
        this.regular = value;
    }

    /**
     * Gets the value of the short property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShort() {
        return _short;
    }

    /**
     * Sets the value of the short property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShort(String value) {
        this._short = value;
    }

}
