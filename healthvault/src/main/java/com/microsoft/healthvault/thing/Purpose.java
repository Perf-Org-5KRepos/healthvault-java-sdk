//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.31 at 11:08:18 AM PDT 
//


package com.microsoft.healthvault.thing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for purpose.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="purpose">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Control"/>
 *     &lt;enumeration value="Rescue"/>
 *     &lt;enumeration value="Combination"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "purpose", namespace = "urn:com.microsoft.wc.thing.inhaler")
@XmlEnum
public enum Purpose {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:inhaler="urn:com.microsoft.wc.thing.inhaler" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
     *                             To control the onset of attacks.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Control")
    CONTROL("Control"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:inhaler="urn:com.microsoft.wc.thing.inhaler" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
     *                             To rescue during an attack.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Rescue")
    RESCUE("Rescue"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:inhaler="urn:com.microsoft.wc.thing.inhaler" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
     *                             A combination of control and rescue.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Combination")
    COMBINATION("Combination");
    private final String value;

    Purpose(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Purpose fromValue(String v) {
        for (Purpose c: Purpose.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
