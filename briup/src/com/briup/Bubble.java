package com.briup;

import java.util.Arrays;

public class Bubble {
	public static void main(String[] args) {
		int[] a= {98,45,65,91,88,77,64,59,38,19};
		
		for(int i=0;i<a.length-1;i++){
			//int b=i;
			
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>=a[j+1]){
					int b=a[j];
					a[j]=a[j+1];
					a[j+1]=b;
				}
			}
			
			
		}System.out.println(Arrays.toString(a));
	}

}
