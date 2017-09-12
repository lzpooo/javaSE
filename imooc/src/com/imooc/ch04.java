package com.imooc;
import java.util.*;
public class ch04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("请输入第一个正整数：");
		int m= in.nextInt();
		System.out.println("请输入第二个正整数：");
		int n= in.nextInt();
		int r=m;
		if (r%n == 0){
			System.out.println("最大公约数为："+n);
			System.out.println("最小公倍数为："+m);
		}
			
		else{
		while(r%n !=0){
			r=r%n;
			if(n%r!=0){
				r=n%r;
				
			}
			else {
				break;
			}
		}
		
		System.out.println("最大公约数为："+r);
		System.out.println("最小公倍数为："+(m*n)/r);
		}
		
	}

}
