package com.briup;

import java.util.Arrays;

public class Index {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a[]={2,3,5,7,11,13,17,19};
		System.out.println(Arrays.toString(a));
		int b[]=a;
		
		for(int i=0;i<a.length;i++){
			if(i%2==0){
				b[i]=i;
			}
		}
		System.out.println(Arrays.toString(b));
	}

	@Override
	public String toString() {
		return "Index [getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
