//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.31 at 11:08:18 AM PDT 
//


package com.microsoft.healthvault.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;wrapper-class-name xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;WeightValue&lt;/wrapper-class-name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;
 *                     A weight measurement.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;
 *                     A weight measurement consists of the value in kilograms,
 *                     which is the base unit of measurement for weight, and
 *                     an optional display value. The display value is used to
 *                     store the weight measurement in the user's preference of
 *                     weight units. This avoids rounding errors when
 *                     converting to and back from kilograms.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for weight-value complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="weight-value">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kg" type="{urn:com.microsoft.wc.thing.types}nonNegativeDouble"/>
 *         &lt;element name="display" type="{urn:com.microsoft.wc.thing.types}display-value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weight-value", namespace = "urn:com.microsoft.wc.thing.types", propOrder = {
    "kg",
    "display"
})
public class WeightValue {

    protected double kg;
    protected DisplayValue display;

    /**
     * Gets the value of the kg property.
     * 
     */
    public double getKg() {
        return kg;
    }

    /**
     * Sets the value of the kg property.
     * 
     */
    public void setKg(double value) {
        this.kg = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayValue }
     *     
     */
    public DisplayValue getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayValue }
     *     
     */
    public void setDisplay(DisplayValue value) {
        this.display = value;
    }

}
