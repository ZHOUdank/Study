package com.dank.day1.test;
import lombok.extern.slf4j.Slf4j;
/**
 * @ClassName: test1
 * @author: zyk
 * @createTime 2022年11月08日 00:16:00
 * @Description: 关于日志
 */
@Slf4j
public class Test1 {
    public static void main(String[] args) {
        int a = 6;
        System.out.println("这里是输出");
        log.info("ddjijijd");
        System.out.println(a/0);
    }
}


