package com.briup;

import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={11,22,55,66,44,33,99,77,88,64};
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++){
			for(int j=a.length;j>=0;j--){
				if(j==9){
					b[j]=a[i];
					
				}
				 if(b[j]<=a[i]){
					int c=a[i];
					a[i]=b[j];
					b[j]=c;				
				}
			}
		}
		System.out.println(Arrays.toString(b));
		
	}

}
