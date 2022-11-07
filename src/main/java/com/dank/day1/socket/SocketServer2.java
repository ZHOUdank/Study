package com.dank.day1.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName: SocketServer
 * @author: zyk
 * @createTime 2022年10月13日 22:15:00
 * @Description: socket服务端
 */
public class SocketServer2 {
    public static void main(String[] args) {
        try {
            System.out.println("服务端已启动...");
            //SocketServer监听9898端口
            ServerSocket serverSocket = new ServerSocket(9898);
            //等待请求
            Socket socket = serverSocket.accept();
            //接受请求后使用Socket进行通信，创建BufferedReader用于读取数据
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = is.readLine();
            System.out.println("received from client:"+line);
            //创建PrintWriter用于发送数据
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            pw.println("this data is from server");
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
