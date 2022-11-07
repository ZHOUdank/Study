package com.dank.day1.study;

/**
 * @ClassName: ClassLoad
 * @author: zyk
 * @createTime 2022年11月08日 00:01:00
 * @Description: 类的加载机制
 */
public class ClassLoad {
    public static ClassLoad classLoad1 = new ClassLoad();
    public static ClassLoad classLoad2 = new ClassLoad();

    {
        System.out.println("构造块");
    }
    static {
        System.out.println("静态块");
    }



    public static void main(String[] args) {
        ClassLoad classLoad = new ClassLoad();
    }
}



