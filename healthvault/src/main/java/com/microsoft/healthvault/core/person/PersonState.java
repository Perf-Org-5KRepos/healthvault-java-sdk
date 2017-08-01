//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.01 at 11:25:08 AM PDT 
//


package com.microsoft.healthvault.core.person;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Suspended"/>
 *     &lt;enumeration value="Deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonState", namespace = "urn:com.microsoft.wc.person")
@XmlEnum
public enum PersonState {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.person" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
     *                             Active state.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.person" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
     *                             Suspended state.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.person" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
     *                             Deleted state.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    PersonState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonState fromValue(String v) {
        for (PersonState c: PersonState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}