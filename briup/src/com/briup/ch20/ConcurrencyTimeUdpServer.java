package com.briup.ch20;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class ConcurrencyTimeUdpServer{
	public static void main(String[] args){
		DatagramSocket ds =  null;
		int port = Integer.parseInt(args[0]);
		DatagramPacket dp = null;
		byte[] buffer = new byte[1024];
		try{
			//1.
			ds = new DatagramSocket(port);
			while(true){
				//2.
				dp = new DatagramPacket(buffer,buffer.length);
				//3.
				ds.receive(dp);
				new MyThread(ds,dp).start();
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
	
class MyThread extends Thread{
	DatagramSocket ds =  null;
	DatagramPacket dp = null;
	byte[] buffer = new byte[1024];
	String time = null;
	InetAddress clientAddress = null;
	int clientPort;	
	
	public MyThread(DatagramSocket ds, DatagramPacket dp){
		this.ds=ds;
		this.dp=dp;
	}

	@Override
	public void run() {
		
		System.out.println(getName()+" Server Connection");
		try {
			//4.
			time = new Date().toString();
			buffer = time.getBytes();
			clientAddress = dp.getAddress();
			clientPort = dp.getPort();
			dp = new DatagramPacket(buffer,buffer.length,clientAddress,clientPort);
			//5.
			ds.send(dp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}