package com.briup.ch20;
import java.net.*;

import java.util.Date;

public class TimeUdpServer{
	public static void main(String[] args){
		DatagramSocket ds =  null;
		int port = Integer.parseInt(args[0]);
		DatagramPacket dp = null;
		byte[] buffer = new byte[1024];
		String time = null;
		InetAddress clientAddress = null;
		int clientPort;	
		try{
			//1.
			ds = new DatagramSocket(port);
			//2.
			dp = new DatagramPacket(buffer,buffer.length);
			while(true){
				//3.
				ds.receive(dp);
				//4.
				time = new Date().toString();
				buffer = time.getBytes();
				clientAddress = dp.getAddress();
				clientPort = dp.getPort();
				dp = new DatagramPacket(buffer,buffer.length,clientAddress,clientPort);
				//5.
				ds.send(dp);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//6.
			try{
				if(ds != null)
					ds.close();
			}catch(Exception e){}
		}
	}
}
