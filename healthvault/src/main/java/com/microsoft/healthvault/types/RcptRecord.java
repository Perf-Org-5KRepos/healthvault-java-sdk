//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.31 at 11:08:18 AM PDT 
//


package com.microsoft.healthvault.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"&gt;
 *                     Specifies that this message should be sent to custodians
 *                     of the health record specified in the request envelope.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.types"&gt;
 *                     The message will be sent to the email addresses of all
 *                     the record custodians. The validated attribute determines
 *                     whether the email addresses of the custodians must be
 *                     validated. Any custodians not validated will be skipped.
 *                     If the validated attribute is true and no custodians
 *                     with validated email address are found, an error will
 *                     be returned.
 *                 &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for RcptRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RcptRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="validated" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RcptRecord", namespace = "urn:com.microsoft.wc.types")
public class RcptRecord {

    @XmlAttribute(name = "validated", required = true)
    protected boolean validated;

    /**
     * Gets the value of the validated property.
     * 
     */
    public boolean isValidated() {
        return validated;
    }

    /**
     * Sets the value of the validated property.
     * 
     */
    public void setValidated(boolean value) {
        this.validated = value;
    }

}
