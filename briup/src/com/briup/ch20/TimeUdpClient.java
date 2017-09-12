package com.briup.ch20;
import java.net.*;


public class TimeUdpClient{
	public static void main(String[] args){
		DatagramSocket ds = null;
		DatagramPacket dp = null;
		byte[] buffer = new byte[1024];
		InetAddress serverAddress = null;
		int serverPort = Integer.parseInt(args[1]);
		String time = null;
		try{
			//1.
			ds = new DatagramSocket();
			//2.
			serverAddress = InetAddress.getByName(args[0]);
			dp = new DatagramPacket(buffer,buffer.length,serverAddress,serverPort);	
			//3.
			ds.send(dp);
			//4.
			dp = new DatagramPacket(buffer,buffer.length);	
			//5.
			ds.receive(dp);
			time = new String(buffer);
			System.out.println("time:" + time);
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
