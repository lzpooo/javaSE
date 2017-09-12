package com.briup.ch19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/** 客户端 */
public class Client {
	private Socket socket;
	private String name;
	public Client( String ip,int port,String name) {
		try {
			this.name = name;
			System.out.println("客户端开始连接...");
			System.out.println("请稍等..........\n");
			socket = new Socket("172.16.4.63", 8898);
			//socket =new Socket("192.168.14.122",8899);
			//socket = new Socket("192.168.170.83", 8899);
			System.out.println("客户端连接成功！");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void start() {
		
		try {
			// 创建线程，负责交互
			GetMessageFromServerHandler fsh = new GetMessageFromServerHandler();
			Thread t = new Thread(fsh);
			t.start();

			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
			PrintWriter pw = new PrintWriter(osw, true);

			
			//pw.print("你好，服务器！");
			System.out.println("(Client:)请输入：");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String message = null;
			while (true) {
				message = sc.nextLine();
				
				pw.println(name+"："+message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		String ip = "127.0.0.1";
		int port = 8899;
		if ( args.length==2 ) {
			ip = args[0];
			port = Integer.parseInt(args[1]);
		}
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name = null;
		while (true) {
			System.out.println("(Client:)请输入姓名：");
			name = sc.nextLine();
			if ( !name.trim().equals( "" )) {
				break;				
			}	
		}
		
		Client client = new Client( ip,port,name);
		client.start();
	}

	class GetMessageFromServerHandler implements Runnable {
		@Override
		public void run() {
		
			// 通过Socket连接对象取得输入流，
			try {
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
				String message = null;
				while (true){
					message = br.readLine();
					if (message==null) 
						break;
						System.out.println( message );		
				}
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
	}
}
