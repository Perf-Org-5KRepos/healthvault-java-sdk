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
 * <p>Java class for task-schedule-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="task-schedule-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Zoned"/>
 *     &lt;enumeration value="Local"/>
 *     &lt;enumeration value="Unscheduled"/>
 *     &lt;enumeration value="Anytime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "task-schedule-type", namespace = "urn:com.microsoft.wc.thing.task")
@XmlEnum
public enum TaskScheduleType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.task"&gt;
     *                             Task is scheduled at an absolute time independent of the local timezone.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.task"&gt;
     *                             An example would be a task to take medication every 4 hours.
     *                         &lt;/remarks&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Zoned")
    ZONED("Zoned"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.task"&gt;
     *                             Task is scheduled at a relative time in the local timezone.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.task"&gt;
     *                             An example would be a task to go running at 7am every morning.
     *                         &lt;/remarks&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Local")
    LOCAL("Local"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.task"&gt;
     *                             Task is unscheduled.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Unscheduled")
    UNSCHEDULED("Unscheduled"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.task"&gt;
     *                             Task can occur at any time.
     *                         &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Anytime")
    ANYTIME("Anytime");
    private final String value;

    TaskScheduleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskScheduleType fromValue(String v) {
        for (TaskScheduleType c: TaskScheduleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}