package com.ch05;

public class ChooseSort {
	public static void main(String[] args){
		int a[]={22,66,88,55,44,99,77,33,11,64};
		
		int c;
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]){
					c=a[j];
					a[j]=a[i];
					a[i]=c;
				}
				
			}
			System.out.print(a[i]+" ");
		}
	}
}
