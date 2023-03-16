package com.dank.day1.test;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName: test2
 * @author: zyk
 * @createTime 2022年12月10日 04:29:00
 * @Description:
 */
public class test2 {
    public static void main(String[] args) throws Exception {
        // 要发送的字符串
        String message = "Hello, World!";
        String str = "早上好";

        // 将字符串转换为字节数组
        byte[] bytes = str.getBytes();

        // 将每个字节转换为十六进制数字
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }

        String hex = Integer.toHexString(str.hashCode());

        // 打印结果
        //System.out.println(hex);
        // 打印结果、
        // System.out.println(sb.toString()); // 48656c6c6f2c20576f726c6421

        String str1 = "我爱中航软件";

        // 使用 Charset 类将字符串编码为 GB2312
        Charset charset = Charset.forName("GB2312");
        ByteBuffer buffer = charset.encode(str1);

        // 将字节数组转换为十六进制数字的字符串表示形式
        StringBuilder sb1 = new StringBuilder();
        while (buffer.hasRemaining()) {
            sb1.append(String.format("%02x ", buffer.get()));
        }
        System.out.println("sb1:" + sb1.toString());


        Socket socket = new Socket("localhost", 8888);
        try (
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            // 将字符串转换为字节并发送

            out.println(sb1);


            // 读取服务器的响应
            String response = in.readLine();
            System.out.println("Response from server: " + response);
        }
    }


    public String toHexString(String str) {
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


    public static byte[] Hex(String s){
        String str = "Hello, World!";

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

        // 输出：48656C6C6F2C20576F726C6421
        System.out.println(new String(hexChars));

        return data;

    }


}



