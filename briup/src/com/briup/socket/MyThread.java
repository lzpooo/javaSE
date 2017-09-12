package com.briup.socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread {
	private Socket s;
	OutputStream os = null;
	BufferedWriter bw = null;
	FileInputStream fis = null;
	// InputStreamReader isr=null;
	BufferedOutputStream bos = null;
	String str = null;
	BufferedInputStream bis = null;
	File file = null;
	BufferedReader br = null;
	String[] string = null;
	String[] s5 = null;
	String[] s6 = null;
	String[] s7 = null;
	String[] s9 = null;

	public MyThread(Socket s) {
		this.s = s;
	}

	public void login() {
		try {
			
			fis = new FileInputStream("src" + s9[1]);
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
	}

	public void loginSuccessed() {
		try {
			bw = new BufferedWriter(new OutputStreamWriter(os));
			bw.write(s6[1]);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void loginFailed() {
		try {
			bw = new BufferedWriter(new OutputStreamWriter(os));
			bw.write("用户名或密码错误！");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

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
	}
	/*
	public void receiveGet() {
		try {
			str = br.readLine();
			System.out.println(str);
			string = str.split(" ");
			System.out.println(string[0] + " " + string[1]);
			file = new File("src" + string[1]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	*/
	
	public void ReceivePost() {
		try {
			byte[] buf1 = new byte[1024];
			while ((bis.read(buf1)) != -1) {
				bos.write(buf1);
				bos.flush();
			}

			char[] s1 = new char[1024];
			br.read(s1);
			//System.out.println(s1);
			List<String> list = new ArrayList<String>();
			String[] sss = String.valueOf(s1).split("\r\n");
			for (String ssss : sss) {
				list.add(ssss);
			}
			String s8 = (list.get(0));
			System.out.println(s8);
			String s4 = (list.get(list.size() - 1)).trim();
			System.out.println(s4);
			s5 = s4.split("&");
			s9 = s8.split(" ");
			s6 = s5[0].split("=");
			s7 = s5[1].split("=");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void run() {
		System.out.println(getName() + " accept client socket");

		try {
			os = s.getOutputStream();
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println("*********************************************");
			//br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// 获取GET行并判断
			str = br.readLine();
			System.out.println(str);
			string = str.split(" ");
			System.out.println(string[0] + " " + string[1]);
			file = new File("src\\" + string[1]);
			//receiveGet();
			if (file.exists()) {
				fis = new FileInputStream(file);
				// isr=new InputStreamReader(fis);
				bis = new BufferedInputStream(fis);
				// 封装输入、输出流
				// osw=new OutputStream(os);
				bos = new BufferedOutputStream(os);
				// bw=new BufferedWriter(new OutputStreamWriter(os));
				// 读写数据
				// 获取Host最后一行
				
				ReceivePost();
				
				if (s6.length < 2 || s7.length < 2) {
					login();
					System.out.println("登陆失败！");
					loginFailed();
					
				} else {

					//System.out.println(s6[0] + " " + s6[1] + " " + s7[0] + " "+ s7[1]);
					if (s6[1].equals("lzp") && s7[1].equals("123")) {
						login();
						System.out.println("登陆成功！");
						loginSuccessed();
					} else {
						login();
						System.out.println("登陆失败！");
						loginFailed();
					}
				}

			} else {
				error();
				// fis = new FileInputStream("D:\\res\\error.txt");
				// bis = new BufferedInputStream(fis);
				// bos = new BufferedOutputStream(os);
				// byte[] buf = new byte[1024];
				// while ((bis.read(buf) != -1)) {
				// bos.write(buf);
				// bos.flush();
				// }
				// bw = new BufferedWriter(new OutputStreamWriter(os));
				// bw.write("file not found");
				// bw.flush();
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				if (os != null) {
					os.close();
				}
				if (bw != null) {
					bw.close();
				}
				if (s != null) {
					s.close();
				}
				if (fis != null)
					fis.close();
				if (bos != null)
					bos.close();
				if (bis != null) {
					bis.close();
				}

				// if(isr!=null)isr.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}