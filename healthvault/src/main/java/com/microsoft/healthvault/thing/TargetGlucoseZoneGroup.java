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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:g="urn:com.microsoft.wc.thing.diabetic-profile" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                     A grouping of glucose zones.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:g="urn:com.microsoft.wc.thing.diabetic-profile" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                     This allows for customized groupings of glucose
 *                     zones based on different values. Glucose
 *                     zones are often used to optimize
 *                     management events for different purposes. By grouping 
 *                     glucose zones into named groups it is easier
 *                     to identify the zones to use for a particular 
 *                     management event.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TargetGlucoseZoneGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetGlucoseZoneGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="target-glucose-zone" type="{urn:com.microsoft.wc.thing.diabetic-profile}TargetGlucoseZone" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetGlucoseZoneGroup", namespace = "urn:com.microsoft.wc.thing.diabetic-profile", propOrder = {
    "targetGlucoseZone"
})
public class TargetGlucoseZoneGroup {

    @XmlElement(name = "target-glucose-zone")
    protected List<TargetGlucoseZone> targetGlucoseZone;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the targetGlucoseZone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetGlucoseZone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetGlucoseZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetGlucoseZone }
     * 
     * 
     */
    public List<TargetGlucoseZone> getTargetGlucoseZone() {
        if (targetGlucoseZone == null) {
            targetGlucoseZone = new ArrayList<TargetGlucoseZone>();
        }
        return this.targetGlucoseZone;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
