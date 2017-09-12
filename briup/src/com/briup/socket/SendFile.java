package com.briup.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SendFile {

	public static void server(String pathName){
		File file =new File(pathName);
		BufferedWriter bw=null;
		OutputStream out=null;
		ServerSocket ss=null;
		Socket socket=null;
		
		BufferedReader br=null;
		try {
			ss= new ServerSocket(8888);//创建服务器协议，端口8888
			System.out.println("等待连接。。。");
			socket= ss.accept();
			System.out.println("已连接。。。");
			out=socket.getOutputStream();
			bw=new BufferedWriter(new OutputStreamWriter(out));
			br=new BufferedReader(new FileReader(file));
			System.out.println("---------");
			String string="";
			while((string=br.readLine())!=null){
				//System.out.println(string);//控制台测试文件内容
				bw.write(string+"\r\n");
				bw.flush();
				
			}
			System.out.println("发送成功，请查看文件"+pathName);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(ss!=null)ss.close();
					if(socket!=null)socket.close();
					if(bw!=null)bw.close();
					if(br!=null)br.close();
					if(out!=null)out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		server("D:\\8.txt");
	}
}
