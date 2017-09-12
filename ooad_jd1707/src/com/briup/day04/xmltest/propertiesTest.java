package com.briup.day04.xmltest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 配置文件测试
 * @author Administrator
 *
 */
public class propertiesTest {
	public static void main(String[] args) {
		Properties p = new Properties();
		try {
			p.load(new FileInputStream("src/com/briup/day04/xmltest/student.properties"));
			String string = (String)p.get("name");
			System.out.println(string);
			System.out.println("_____________________________");
			
			//StringBuffer测试
			String s1="hello";
			String s2=" world";
			StringBuilder sb=new StringBuilder();
			sb.append(s1);
			sb.append(s2);
			System.out.println(sb.toString());
			System.out.println("-----------------------------------");
			
			int sum=0;
			for (int i = 0; i < 10; i++) {
				sum+=i;
			}
			System.out.println(sum);
			System.out.println("---------------------");
			final String s11="hello";
			final String s21="world";
			String s3=s11+s21;
			String s4="helloworld";
			System.out.println(s3==s4);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
