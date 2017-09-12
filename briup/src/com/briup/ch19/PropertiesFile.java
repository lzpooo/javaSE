package com.briup.ch19;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;


public class PropertiesFile {
	public static void main(String[] args) {
		getValues("name");
		getValues("gender");
		getValues("age");
		
		
	}
	
	@SuppressWarnings("deprecation")
	public static void getValues(String s){
		DataInputStream dis=null;
		@SuppressWarnings("unused")
		DataOutputStream dos=null;
		try {
			dis=new DataInputStream(new FileInputStream("E:\\资源\\advance Java\\day19\\exercise\\exercise2\\message"));
			String line=null;
			while((line=dis.readLine())!=null){
				String[] string=line.split("=");
				//String s1=string[0];
				//String s2=string[1];
				//Map map=new HashMap();
				//map.put(s1,s2);
				if(s.equals(string[0])){
					System.out.println(string[1]);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			try {
				if(dis!=null){
					dis.close();
				}
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				
			}
		}
	}
}
