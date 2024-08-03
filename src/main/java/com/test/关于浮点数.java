package com.test;

import java.math.BigDecimal;

public class 关于浮点数 {
    public static void main(String[] args) {
        float a = 0.1F;
        float b = 0.2F;
        double A = 0.2d;
        double B = 0.4D;
        BigDecimal AA = new BigDecimal("0.11");
        BigDecimal BB = new BigDecimal("0.222");



        System.out.println(0.1+0.2);
        System.out.println(A+B);
        System.out.println(AA.add(BB));
    }
}
