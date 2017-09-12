package com.imooc;
import java.util.*;
public class Test1 {
	public static void main(String[] args){	
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		int i =in.nextInt();
		System.out.print(i+"=");
		for (int n=2;n<=i/2;n++){
			while (i != n){
				if(i%n ==0){
					System.out.print(n+"*");
					i=i/n;
				}
				else{
					break;
				}
			}
		}
		System.out.print(i);
		
		
		
		
	}
}
