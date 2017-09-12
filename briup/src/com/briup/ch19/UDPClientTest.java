package com.briup.ch19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class UDPClientTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		DatagramSocket ds1=null;
		//创建客户端
		try {
			
			ds1=new DatagramSocket();
			//创建要给服务器发的包
			byte[] buf1=new byte[1024];
			buf1=new Date().toGMTString().getBytes();
			InetAddress address=InetAddress.getByName("127.0.0.1");
			DatagramPacket dp1=new DatagramPacket(buf1, buf1.length, address, 10002);
			System.out.println("正在发送数据包给服务器");
			
			//发送数据包给服务器
			ds1.send(dp1);
			//创建接收服务器端发送过来的包
			dp1=new DatagramPacket(buf1,buf1.length);
			//接收数据包
			ds1.receive(dp1);
			String str=new String(buf1);
			System.out.println("Client:"+str);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if (ds1!=null) {
				ds1.close();
			}
		}
	}
}
