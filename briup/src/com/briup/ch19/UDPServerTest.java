package com.briup.ch19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServerTest {
	public static void main(String[] args) {
		//创建服务器端
		DatagramSocket ds=null;
		try {
			ds=new DatagramSocket(10002);
			//创建接收客户端发送过来的数据包
			byte[] buf=new byte[1024];
			DatagramPacket dp=new DatagramPacket(buf, buf.length);
			System.out.println("等待客户端发送数据包：");
			//接收数据包
			ds.receive(dp);
			System.out.println("接收了新的数据包："+new String(buf));
			//接收客户端的IP、port
			InetAddress add=dp.getAddress();
			String host=add.getHostAddress();
			int port =dp.getPort();
			System.out.println("IP:"+host+"  port:"+port);
			//发送给客户端的数据包
			buf="HelloWorld".getBytes();
			dp=new DatagramPacket(buf, buf.length, add, port);
			//发送数据包
			ds.send(dp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			ds.close();
		}
		
	}
}
