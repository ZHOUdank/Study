package com.dank.day1.test;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.zip.CRC32;

/**
 * @ClassName: CRC
 * @author: zyk
 * @createTime 2022年12月10日 08:25:00
 * @Description:
 */
public class CRC {

    public static void main(String[] args) {
        String str = "Hello, World!";

        String s = toHexString(str);
        System.out.println(s);
        System.out.println(s.toString());
        // 使用UTF-8编码将字符串转换为字节数组
        byte[] data = str.getBytes(StandardCharsets.UTF_8);
        int len = data.length;
        //System.out.println(data);
        //System.out.println(Arrays.toString(data));
        int crc = 0;
        for (byte b : data) {
            crc = crc ^ (b & 0xFF);
        }
        //System.out.println(crc);
    }

    // 计算16位CRC值
    // message：数据指针
    // len：数据长度
    // return：16位CRC值
    public static int getCRC(byte[] message, int len) {
        int CRCFull = 0xFFFF;
        int CRCLSB;
        for (int i = 0; i < len; i++) {
            CRCFull = (CRCFull ^ message[i]) & 0xFFFF;
            for (int j = 0; j < 8; j++) {
                CRCLSB = CRCFull & 0x0001;
                CRCFull = ((CRCFull >> 1) & 0x7FFF) & 0xFFFF;
                if (CRCLSB == 1) {
                    CRCFull = (CRCFull ^ 0xA001) & 0xFFFF;
                }
            }
        }
        return CRCFull;
    }

    /**
     * @title: toHexString
     * @author: zyk
     * @updateTime: 2022/12/10 11:48
     * @description: 将字符串转为16进制的字节数组并以每两位进行分割
    */
    public static String toHexString(String str) {
        // 将字符串转换为字节数组
        byte[] data = str.getBytes(StandardCharsets.UTF_8);

        // 创建16进制字符数组
        char[] hexArray = "0123456789ABCDEF".toCharArray();
        char[] hexChars = new char[data.length * 2];

        // 将字节数组转换为16进制字符数组
        for (int i = 0; i < data.length; i++) {
            int v = data[i] & 0xFF;
            hexChars[i * 2] = hexArray[v >>> 4];
            hexChars[i * 2 + 1] = hexArray[v & 0x0F];
        }

        // 将16进制字符数组分割成每两位一组
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hexChars.length; i += 2) {
            sb.append(hexChars[i]);
            sb.append(hexChars[i + 1]);
            sb.append(' ');
        }

        // 返回结果
        return sb.toString();
    }

    public static String toHex(String str) {
        // 将字符串转换为字节数组
        byte[] data = str.getBytes(StandardCharsets.UTF_8);

        // 创建16进制字符数组
        char[] hexArray = "0123456789ABCDEF".toCharArray();
        char[] hexChars = new char[data.length * 5];

        // 将字节数组转换为16进制字符数组
        for (int i = 0; i < data.length; i++) {
            int v = data[i] & 0xFF;
            hexChars[i * 5] = '0';
            hexChars[i * 5 + 1] = 'x';
            hexChars[i * 5 + 2] = hexArray[v >>> 4];
            hexChars[i * 5 + 3] = hexArray[v & 0x0F];
            hexChars[i * 5 + 4] = ' ';
        }

        // 返回结果

        return new String(hexChars);
    }

    public String toHexString(byte[] data) {
        // 创建16进制字符数组
        char[] hexArray = "0123456789ABCDEF".toCharArray();
        char[] hexChars = new char[data.length * 5];

        // 将字节数组转换为16进制字符数组
        for (int i = 0; i < data.length; i++) {
            int v = data[i] & 0xFF;
            hexChars[i * 5] = '0';
            hexChars[i * 5 + 1] = 'x';
            hexChars[i * 5 + 2] = hexArray[v >>> 4];
            hexChars[i * 5 + 3] = hexArray[v & 0x0F];
            hexChars[i * 5 + 4] = ' ';
        }

        // 返回结果
        // 输出：0x48 0x65 0x6C 0x6C 0x6F 0x2C 0x20 0x57 0x6F 0x72 0x6C 0x64 0x21
        return new String(hexChars);
    }



}


