package com.dank.day4;

/**
 * @ClassName: Test
 * @author: zyk
 * @createTime 2024年03月01日 17:52:00
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);
    }

}
