package com.dank.day3.transXml;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @ClassName: ActionName
 * @author: zyk
 * @createTime 2023年11月11日 14:29:00
 * @Description:
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ActionName {

    @XmlAttribute(name = "name")
    private String name;

    //@XmlElementWrapper(name = "params")
    @XmlElement(name = "param")
    private List<Param> params;


    public List<Param> getParams() {
        return params;
    }

    public void setParams(List<Param> params) {
        this.params = params;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
