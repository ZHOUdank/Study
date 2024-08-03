package com.test;

public class 关于比较 {
    //关于==和equals之间的区别
    public static void main(String[] args) {
        String str1 = "hello";
        String str11 = "hello";
        int a = 10;
        int aa = 10;
        String str2 = new String("hello");
        String str22 = new String("hello");

        System.out.println(str1==str11); //true
        System.out.println(str1.equals(str2)); //true、

        System.out.println(a==aa); //true
        //System.out.println(a.equals(aa)); //这里报错是因为int为基本类型，不能用equals比较，equals主要是比较引用类型

        System.out.println(str2==str22); //false  这里false是因为比较的是内存地址是否相同
        System.out.println(str2.equals(str22)); //true




    }
}
