package com.dank.day3.transXml;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: TelAlarm
 * @author: zyk
 * @createTime 2023年11月11日 14:28:00
 * @Description:
 */

@XmlRootElement(name = "Tel_Alarm")
@XmlAccessorType(XmlAccessType.FIELD)
public class TelAlarm {

    @XmlElement(name = "actionName")
    private ActionName actionName;


    public ActionName getActionName() {
        return actionName;
    }

    public void setActionName(ActionName actionName) {
        this.actionName = actionName;
    }

    @Override
    public String toString() {
        return "TelAlarm [actionName=" + actionName + "]";
    }
}
