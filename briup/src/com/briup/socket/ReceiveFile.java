package com.briup.socket;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveFile {

	public static  void client(String pathName){
		File file =new File(pathName);
		BufferedWriter bw=null;
		OutputStream out=null;
		InputStream in =null;
 		ServerSocket ss=null;
		Socket socket=null;
		BufferedReader br=null;
		try {
			//"172.16.4.61"王宁IP
			socket=new Socket("172.16.4.42",8888);//连接服务器ip及端口			
			in=socket.getInputStream();
			bw=new BufferedWriter(new FileWriter(file));
			br=new BufferedReader(new InputStreamReader(in));
			System.out.println("---------");
			String string="";
			while((string=br.readLine())!=null){
				//System.out.println(string);//控制台测试文件内容
				bw.write(string+"\r\n");
				bw.flush();
				
			}
			System.out.println("文件接收成功，请查看"+pathName);
			
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
					e.printStackTrace();
				}
			
			
		}
	}
	public static void main(String[] args) {
		client("E:b.txt");
	}
}
