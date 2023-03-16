package com.dank.day1.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName: SocketServer
 * @author: zyk
 * @createTime 2022年10月13日 22:15:00
 * @Description: socket服务端
 */
public class SocketServer {
    public static void main(String[] args) {
        try {
            System.out.println("服务端已启动...");
            //SocketServer监听9898端口
            ServerSocket serverSocket = new ServerSocket(9898);
            //等待请求
            Socket socket = serverSocket.accept();
            //接受请求后使用Socket进行通信，创建BufferedReader用于读取数据
            InputStreamReader in = new InputStreamReader(socket.getInputStream());
            BufferedReader is = new BufferedReader(in);
            String line = is.readLine();
            System.out.println("received from client:"+line);
            //创建PrintWriter用于发送数据
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            pw.println("this data is from server-----");
            pw.println("在连接中。。。");
            //依次关闭资源
            pw.flush();
            pw.close();
            is.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
