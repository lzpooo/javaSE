package com.briup.ch19;

import java.io.*;

public class Copy {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("E:\\HTML.txt");
			fos=new FileOutputStream("E:\\test.txt");
			byte[] b=new byte[10240];
			int len=0;
			while ((len=fis.read(b))!=-1){
				fos.write(b);
			}
			System.out.println(len);
			fos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				if(fis!=null){
					fis.close();
				}
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
}
