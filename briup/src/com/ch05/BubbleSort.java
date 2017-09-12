package com.ch05;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={55,66,44,88,22,77,99,11,33,28};
		int c;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1]){
					c=a[j];
					a[j]=a[j+1];
					a[j+1]=c;
				}
			}
			
		}
		System.out.print(Arrays.toString(a));
	}

}
