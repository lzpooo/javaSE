package com.imooc;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		
		int m=1;
		for(int a=3;a<=1000;a++){
		
		//System.out.println(a);
			for(int i=2;i<a;i++){
				if (a%i==0){
					m=m+i;
				//System.out.println(m);
				}
				else{
					continue ;
				}
				
			}
			if(a==m){
				System.out.println(a);
				
			}
			
			m=1;
		}
	}

}
