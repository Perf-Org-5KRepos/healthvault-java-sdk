//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.core.subscription;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonPrivileged complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonPrivileged">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com.microsoft.wc.subscription}Common">
 *       &lt;sequence>
 *         &lt;element name="requires-msh-pairing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="delivery-priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonPrivileged", namespace = "urn:com.microsoft.wc.subscription", propOrder = {
    "requiresMshPairing",
    "deliveryPriority"
})
public class CommonPrivileged
    extends Common
{

    @XmlElement(name = "requires-msh-pairing")
    protected Boolean requiresMshPairing;
    @XmlElement(name = "delivery-priority")
    protected Integer deliveryPriority;

    /**
     * Gets the value of the requiresMshPairing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresMshPairing() {
        return requiresMshPairing;
    }

    /**
     * Sets the value of the requiresMshPairing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresMshPairing(Boolean value) {
        this.requiresMshPairing = value;
    }

    /**
     * Gets the value of the deliveryPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeliveryPriority() {
        return deliveryPriority;
    }

    /**
     * Sets the value of the deliveryPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeliveryPriority(Integer value) {
        this.deliveryPriority = value;
    }

}