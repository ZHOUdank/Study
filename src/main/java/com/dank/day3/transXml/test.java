package com.dank.day3.transXml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: test
 * @author: zyk
 * @createTime 2023年11月11日 14:39:00
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        TelAlarm telAlarm = new TelAlarm();
        ActionName actionName = new ActionName();
        actionName.setName("actionResult");

        List<Param> params = Arrays.asList(
                createParam("alarmUnitSN", "故障单元编码"),
                createParam("alarmUnitType", "故障单元类型"),
                createParam("alarmUnitName", "故障单元名称")
        );

        actionName.setParams(params);
        telAlarm.setActionName(actionName);

        try {
            // 创建JAXB上下文
            JAXBContext context = JAXBContext.newInstance(TelAlarm.class);
            // 根据上下文创建Marshaller对象，用于将bean编组(转换)为xml
            Marshaller marshaller = context.createMarshaller();
            // 设置编码方式
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            // 将bean编组为xml
            StringWriter writer = new StringWriter();
            marshaller.marshal(telAlarm,writer); // 输出到控制台
            String xmlString = writer.toString();
            System.out.println(xmlString);


        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static Param createParam(String name, String value) {
        Param param = new Param();
        param.setName(name);
        param.setValue(value);
        return param;
    }
    public static String tarns(AlarmInfo alarmInfo){
        TelAlarm telAlarm = new TelAlarm();
        ActionName actionName = new ActionName();
        actionName.setName("actionResult");

        List<Param> params = Arrays.asList(
                createParam("alarmUnitSN", "故障单元编码"),
                createParam("alarmUnitType", "故障单元类型"),
                createParam("alarmUnitName", "故障单元名称")
        );

        actionName.setParams(params);
        telAlarm.setActionName(actionName);
        String xmlString = "";

        try {
            // 创建JAXB上下文
            JAXBContext context = JAXBContext.newInstance(TelAlarm.class);
            // 根据上下文创建Marshaller对象，用于将bean编组(转换)为xml
            Marshaller marshaller = context.createMarshaller();
            // 设置编码方式
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            // 将bean编组为xml
            StringWriter writer = new StringWriter();
            marshaller.marshal(telAlarm,writer); // 输出到控制台
            xmlString = writer.toString();
            System.out.println(xmlString);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return xmlString;
    }


}
