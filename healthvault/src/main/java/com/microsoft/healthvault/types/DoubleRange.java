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


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;
 *                     A pair of doubles used to create a
 *                     range.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for double-range complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="double-range">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minimum-range" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maximum-range" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "double-range", namespace = "urn:com.microsoft.wc.thing.types", propOrder = {
    "minimumRange",
    "maximumRange"
})
public class DoubleRange {

    @XmlElement(name = "minimum-range")
    protected double minimumRange;
    @XmlElement(name = "maximum-range")
    protected double maximumRange;

    /**
     * Gets the value of the minimumRange property.
     * 
     */
    public double getMinimumRange() {
        return minimumRange;
    }

    /**
     * Sets the value of the minimumRange property.
     * 
     */
    public void setMinimumRange(double value) {
        this.minimumRange = value;
    }

    /**
     * Gets the value of the maximumRange property.
     * 
     */
    public double getMaximumRange() {
        return maximumRange;
    }

    /**
     * Sets the value of the maximumRange property.
     * 
     */
    public void setMaximumRange(double value) {
        this.maximumRange = value;
    }

}