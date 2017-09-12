package com.briup.ch19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;
/**
 * @author LZP
 * @version JDK1.7.0
 * 文件切割与合并
 * 
 *
 * */

public class SplitFile {
	public static void main(String[] args) throws Exception {
		split();
		System.out.println("________________________");
		merge();
	}

	public static void merge() throws IOException {
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		int count = 0;
		while (count < 6) {
			v.add(new FileInputStream("E:\\split" + (count++) + ".txt"));
		}
		Enumeration<FileInputStream> et = v.elements();
		// 返回枚举类型的数据
		SequenceInputStream sis=new SequenceInputStream(et);
		//创建一个合并输入流
		FileOutputStream fos=new FileOutputStream("E:\\a.txt");
		byte[] buf=new byte[1024*10];
		int len=0;
		while((len=sis.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		fos.close();
		sis.close();
	}

	public static void split() throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		fis = new FileInputStream("E:\\HTML.txt");
		byte[] buf = new byte[1024];
		int len = 0;
		int count = 0;
		//利用循环将文件切割为多个1024k大小的文件
		while ((len = fis.read(buf)) != -1) {
			fos = new FileOutputStream("E:\\split" + (count++) + ".txt");
			fos.write(buf, 0, len);
			fos.close();
		}
		fis.close();
	}
}
