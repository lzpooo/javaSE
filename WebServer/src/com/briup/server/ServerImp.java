package com.briup.server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.briup.bean.Request;
import com.briup.bean.Response;

/**
 * @version 1.0
 * @author LZP
 * 
 * */
public class ServerImp implements IServer {

	ServerSocket ss = null;
	Socket s = null;
	OutputStream os = null;
	BufferedWriter bw = null;
	

	@Override
	public void init() {
		try {
			// 创建服务器端
			ss = new ServerSocket(10086);
			System.out.println("server accept:");
			// 等待客户端发送链接
			receive();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (ss != null) {
				try {
					ss.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}

	}

	@Override
	public void receive() {
		try {
			System.out.println("等待");
			while(true){
				s=ss.accept();
				new MyThread(s).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ServerImp si = new ServerImp();
		si.init();
	}
	
}
class MyThread extends Thread{
	String[] s1=null;
	private Socket s;
	char[] c1=null;
	String[] s5=null;
	String[] s6=null;
	String[] s7=null;
	String[] s9=null;
	String[][] string1=null;
	
	public MyThread(Socket s) {
		this.s = s;
	}
	public void run() {
		System.out.println(getName() + " accept client socket");
		Request r=new Request(s);
		
		try {
			String[] s11=r.acceptServer(s,s1);
			//System.out.println(r.acceptServer(s,s1));
			Response re=new Response(s);
			if(s11[1].equals("/")||s11[1].equals("/favicon.ico")){
				re.error();
			}
			else if(s11[0].equals("GET")){
				r.readGet(s11);
				
			}else if(s11[0].equals("POST")){
				
				char[] c11=r.readPost(c1);
				String[][] string11=r.getSplit(c11,s5,s6,s7,s9,string1);
				if(string11[0].length<2||string11[1].length<2){
					re.login(string11[3]);
					re.loginFailed();
				}else{
					re.result(string11[1],string11[2],string11[3]);
				}
				
			}else{
				re.error();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
