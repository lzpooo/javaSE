package com.briup.exercise50;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算100-200之间的素数个数，并将每个素数打印出来
 * @author Administrator
 *
 */
public class SuSuTest {
	public static void main(String[] args) {
		double x=12.5;
		long y=Math.round(x);
		int c=Math.round(y);
		System.out.println(y+" "+c);
		List<Integer> list=new ArrayList<Integer>();
		f1:for(int i = 100;i<201;i++){
			for (int j=2;j<=i/2;j++){
				if(i%j==0){
					continue f1;
				}
				else if(j==i/2){
					break;
				}
				else{
					continue ;
				}
			}
			System.out.print(i+"  ");
			list.add(i);
			
		}
		System.out.println();
		System.out.println(list.size());
	}
}
