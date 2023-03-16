package com.dank.day1.test;
import java.io.*;
import java.net.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * @ClassName: test3
 * @author: zyk
 * @createTime 2022年12月10日 04:38:00
 * @Description: 用于测试socket通信的服务端
 */
public class test3 {
        public static void main(String[] args) throws Exception {
            ServerSocket serverSocket = new ServerSocket(8888);

            Socket clientSocket = serverSocket.accept();
            try (
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            ) {
                // 读取客户端发送的字节
                String message = in.readLine();

                // 将字节转换为字符串并打印
                String messageString = new String(message.getBytes());
                System.out.println("Message from client: " + messageString);

                // 向客户端发送响应
                out.println("Received message: " + messageString);
            }
        }
    }
