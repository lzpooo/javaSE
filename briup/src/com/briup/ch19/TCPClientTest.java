package com.briup.ch19;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.net.Socket;

public class TCPClientTest {
	public static void main(String[] args) {
		Socket s1=null;
		BufferedReader br=null;
		try {
			s1=new Socket("127.0.0.1",44001);
			InputStream is=s1.getInputStream();
			br=new BufferedReader(new InputStreamReader(is));
			String line=br.readLine();
			System.out.println("client:"+line);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			try {
				if(s1!=null){
					s1.close();
				} 
				if(br!=null){
					br.close();
				}
			}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			
		}
	}
}
