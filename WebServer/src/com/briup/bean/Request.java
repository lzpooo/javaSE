package com.briup.bean;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author LZP
 * 接收请求，解析处理
 * 
 * */

public class Request {
	
	private OutputStream os=null;
	private BufferedReader br=null;
	
	private File file=null;
	private FileInputStream fis=null;
	private BufferedInputStream bis=null;
	private BufferedOutputStream bos=null;
	
	private Socket s=null;
	
	
	
	public Request(Socket s){
		this.s=s;
		
	}
	public String[] acceptServer  (Socket s,String[] s1)throws Exception{
		
		//读取服务器端发送过来的数据包
		os=s.getOutputStream();
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println("***************************");
		String str=br.readLine();
		System.out.println(str);
		s1=str.split(" ");
		System.out.println(s1[0]+s1[1]+s1[2]);
		return s1;
	}
	//处理GET请求
	public void readGet(String[] s1){
		file=new File("src"+s1[1]);
		if(file.exists()){
			try {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				bos = new BufferedOutputStream(os);
				byte[] buf1 = new byte[1024];
				while ((bis.read(buf1)) != -1) {
					bos.write(buf1);
					bos.flush();
				}
				
			} catch (Exception e) {
				
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
		else{
			
		}
	}
	//处理POST请求
	public char[] readPost(char[] c1)throws Exception{
		
		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);
		bos = new BufferedOutputStream(os);
		byte[] buf1 = new byte[1024];
		while ((bis.read(buf1)) != -1) {
			bos.write(buf1);
			bos.flush();
		}
		if(bos!=null){
			bos.close();
		}
		c1 = new char[1024];
		br.read(c1);
		
		return c1;
	}
	//拆分客户端发送的用户信息
	public String[][] getSplit(char[] c1,String[] s5,String[] s6,String[] s7,String[] s9,String[][] string1){
		List<String> list = new ArrayList<String>();
		String[] sss = String.valueOf(c1).split("\r\n");
		for (String ssss : sss) {
			list.add(ssss);
		}
		String str2 = (list.get(0));
		System.out.println(str2);
		String str3 = (list.get(list.size() - 1)).trim();
		System.out.println(str3);
		s5 = str3.split("&");
		s9 = str2.split(" ");
		if(s9.length==3){
			System.out.println(s9[1]);
		}else{
			
			
		}
		s6 = s5[0].split("=");
		s7 = s5[1].split("=");
		
		if(s6.length==2){
			System.out.println(s6[0]+" "+s6[1]+" "+s7[0]+" "+s7[1] );
			
			
		}else{
			System.out.println("登陆失败！");
			
		}
		string1[0]=s5;
		string1[1]=s6;
		string1[2]=s7;
		string1[3]=s9;
		return string1;
		
	}
}
