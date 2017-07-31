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
import com.microsoft.healthvault.types.dates.Time;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:sjam="urn:com.microsoft.wc.thing.sjam" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                     A time and duration of an awakening during a period of 
 *                     sleep.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:sjam="urn:com.microsoft.wc.thing.sjam" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                     An awakening covers those times during a sleep session
 *                     in which the person awoke and then went back to sleep.
 *                     For example, if a person wakes up during a night's 
 *                     sleep to use the restroom and then returns to sleep. It
 *                     does not include awakenings that result in the person 
 *                     remaining awake for active periods.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for Awakening complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Awakening">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="when" type="{urn:com.microsoft.wc.dates}time"/>
 *         &lt;element name="minutes" type="{urn:com.microsoft.wc.thing.types}nonNegativeInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Awakening", namespace = "urn:com.microsoft.wc.thing.sjam", propOrder = {
    "when",
    "minutes"
})
public class Awakening {

    @XmlElement(required = true)
    protected Time when;
    protected int minutes;

    /**
     * Gets the value of the when property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setWhen(Time value) {
        this.when = value;
    }

    /**
     * Gets the value of the minutes property.
     * 
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Sets the value of the minutes property.
     * 
     */
    public void setMinutes(int value) {
        this.minutes = value;
    }

}