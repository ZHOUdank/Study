package com.dank.day1.study;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: MethodStudy
 * @author: zyk
 * @createTime 2022年10月12日 22:48:00
 * @Description: 一些方法的学习使用
 */
public class MethodStudy {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date = sdf.format(new Date());
        System.out.println(date);

        SimpleDateFormat formatter = new SimpleDateFormat ("yyyy年MM月dd日 HH:mm:ss ");
        //获取当前时间
        Date curDate = new Date(System.currentTimeMillis());
        String str = formatter.format(curDate);
        Date date1 = new Date();
        System.out.println("______"+str+"-----"+date1);

        int i = 1234;
        boolean b = true;
        boolean c = false;
        String ss = String.format("%04x" , i);
        String ss1 = String.format("%b" , b , c);
        System.out.println("ss:"+ss);
        System.out.println("b:"+b+"---"+"c:"+c);
        Student s = new Student("zyk",18);
        String student = String.format(String.valueOf(s));
        System.out.println(student);
        //%固定，
        // 0代表用0填充，
        // 8代表一共有8位，
        // o代表八进制，
        // 0，8，o都可以用其他来替换
        System.out.printf("%08o", 71);
    }


}


