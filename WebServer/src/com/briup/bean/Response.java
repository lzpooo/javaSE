package com.briup.bean;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @version 1.0
 * @author LZP
 * 将处理结果响应给客户端
 * 
 * */

public class Response {
	private BufferedWriter bw=null;
	private OutputStream os=null;
	private FileInputStream fis =null;
	private BufferedInputStream bis =null;
	private BufferedOutputStream bos=null;
	private Socket s=null;
	
	//显示处理结果
	public Response(Socket s){
		this.s=s;
	}
	public void result(String[] s1,String[] s2,String[] s3){
		if(s1[1].equals("lzp")&&s2[1].equals("123")){
			login(s3);
			System.out.println("登陆成功！");
			loginSuccessed(s1,s2);
		}else {
			login(s3);
			System.out.println("登陆失败！");
			loginFailed();
		}
	}
	//打开登录界面
	public void login(String[] s1) {
		try {
			
			fis = new FileInputStream("src" + s1[1]);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(os);
			byte[] buf = new byte[1024];
			while ((bis.read(buf) != -1)) {
				bos.write(buf);
				bos.flush();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(bos!=null){
					bos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//显示登录成功
	public void loginSuccessed(String[] s1,String[] s2) {
		try {
			bw = new BufferedWriter(new OutputStreamWriter(os));
			bw.write(s1[1]);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(bw!=null){
					bw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//显示登录失败
	public void loginFailed() {
		try {
			bw = new BufferedWriter(new OutputStreamWriter(os));
			bw.write("用户名或密码错误！");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(bw!=null){
					bw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//显示error界面
	public void error() {
		try {
			fis = new FileInputStream("src\\Error.html");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(os);
			byte[] buf = new byte[1024];
			while ((bis.read(buf) != -1)) {
				bos.write(buf);
				bos.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(bos!=null){
					bos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
