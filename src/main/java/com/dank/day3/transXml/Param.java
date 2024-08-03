package com.dank.day3.transXml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * @ClassName: Param
 * @author: zyk
 * @createTime 2023年11月11日 15:32:00
 * @Description:
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Param {
    @XmlAttribute(name = "name")
    private String name;
    @XmlValue
    private String value;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Param [name=" + name + ", value=" + value + "]";
    }
}
