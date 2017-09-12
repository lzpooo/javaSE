package com.briup.ch19;
import java.io.*;
public class InOutStream {
	public static void main(String[] args){
		
		InputStream in=System.in;		
		try{
			byte[] buf=new byte[84];
			int i=0;
			while((i=in.read(buf))!=-1){
			 System.out.println("i:"+i);
			}
		}catch(IOException e){
			
		}finally{
			if(in!=null){
			   try{
				in.close();
			     }catch(IOException e){}
			}
		}
	}
}
