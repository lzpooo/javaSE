package com.ch05;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
      public static void main(String[] args) throws UnknownHostException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("请输入你的名称：");
    	String name = br.readLine();
    	if(name.equals("")){
    		return ;
    	}
    
		   //创建服务端，指定端口
    	  Socket client = new Socket("172.16.4.102" , 10086);
    	  new Thread(new Send(client , name)).start();
    	  new Thread(new Recevie(client,name)).start();
    	 
    	  
	}
}

/**
 * 用来发送数据
 * @author lugela
 *
 */
class Send implements Runnable {
	//用来控制台输入流
	private BufferedReader console;
	//输出流
	private DataOutputStream dos;
	//线程标识体
	private boolean flag = true;
	
	//客户端名称
	private String name;
	
	public Send(){
	     console = new BufferedReader(new InputStreamReader(System.in));
		
	}
	
	public Send(Socket client,String name){
		this();
		System.out.println("客户端开始连接...");
		System.out.println("请稍等..........\n");
	
		try {
			dos = new DataOutputStream(client.getOutputStream());
			this.name = name;
			send(name);
		} catch (IOException e) {
			flag = false;
			FileUtil.close(dos,console);
			
		}
	}
	//从控制台接受数据
	private String getManage(){
		try {
		
			String str = console.readLine();
			 // System.out.print(this.name+"说:");
			
			return str;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	//发送数据
	public void send(String msg){
		//String msg = getManage();
		
		if(msg!=null && !msg.equals("") &&! msg.equals(this.name)){
			try {  
				dos.writeUTF(this.name+"说:"+msg);
				dos.flush();
			} catch (IOException e) {
				flag = false;
				FileUtil.close(dos,console);
			}
		}else{
			//发送的不是名字的时候
			try {  
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
				flag = false;
				FileUtil.close(dos,console);
			}
		}
	}
	
	
	
	@Override
	public void run() {
		
		while(flag){
			send(getManage());
		}
	}
	
	
}


/**
 * 客户端用来接收数据
 * @author lugela
 *
 */

class Recevie implements Runnable{
	private DataInputStream dis;
	private boolean flag = true;
	@SuppressWarnings("unused")
	private String name;
	
	
	 public Recevie() {
		
	}
	public Recevie( Socket client ,String name){
		try {
			dis = new DataInputStream(client.getInputStream());
			this.name = name;
			
		} catch (IOException e) {
			flag = false;
			FileUtil.close(dis);
		}
	}
	
	public void recevie(){
	   
		try {
			String msg = dis.readUTF();
			System.out.println(msg);
		} catch (IOException e) {
			flag = false;
			FileUtil.close(dis);
		}
	}
	@Override
	public void run() {

       while(flag){
    	   recevie();
       }
		
	}
	
	
}


/**
 * 自定义关闭流的方法关闭流的方法
 * @author lugela
 *
 */
class FileUtil{
	
	public  static void  close(Closeable ...c){
		for(Closeable temp : c){
			if(null!=temp){
				try {
					temp.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
