package com.dank.day2;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName: Str
 * @author: zyk
 * @createTime 2022年11月08日 01:01:00
 * @Description: 字符串截取
 */
@Slf4j
public class Str {
    public static void main(String[] args) {
        String s = "asdasdasd";
        log.info("截取字符串");
        System.out.println(s.substring(2,4));
    }
}
