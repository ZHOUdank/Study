package com.dank.day1.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @ClassName: SockerClient
 * @author: zyk
 * @createTime 2022年10月13日 22:15:00
 * @Description: socket 客户端
 */
public class SocketClient {
    public static void main(String[] args) {
        String msg = "来自客户端的消息";
        char c = 'c';
        try {
            Socket socket = new Socket("127.0.0.1",9898);
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            BufferedReader is  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //发送数据
            pw.println(msg+c);

            pw.println("还发送送了甚多内容，比如我这个");
            pw.flush();
            //接收数据
            String line = is.readLine();
            System.out.println("来自服务端的消息："+line);
            //关闭资源
            pw.close();
            is.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
