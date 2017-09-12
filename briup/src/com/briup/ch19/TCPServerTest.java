package com.briup.ch19;

import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerTest {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		BufferedWriter bw = null;
		try {
			ss = new ServerSocket(44001);
			// 2、等待客户端发送过来的socket
			System.out.println("等待客户端发送过来socket");
			s = ss.accept();

			// 3、获取输出流
			OutputStream os = s.getOutputStream();
			// 4、包装输出流
			bw = new BufferedWriter(new OutputStreamWriter(os));
			// 5、写数据
			bw.write("hello world");
			bw.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 6.关闭资源
				if (s != null)
					s.close();
				if (ss != null)
					ss.close();
				if (bw != null)
					bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	}
}
