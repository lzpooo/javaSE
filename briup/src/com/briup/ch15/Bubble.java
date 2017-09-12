package com.briup.ch15;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={11,82,94,37,54,69,42,78,64,55};
		int b=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					b=a[j];
					a[j]=a[i];
					a[i]=b;
				}
				
			}
			System.out.print(a[i]+"  ");
			
		}
		System.out.println();
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length-i-1;j++){
				if(a[j]<a[j+1]){
					b=a[j];
					a[j]=a[j+1];
					a[j+1]=b;
					
				}
			}
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		System.out.println("_________________________________");
		//插入排序
		int[] a1={55,84,24,15,65,75,64,88};
		for (int i = 1; i < a1.length; i++) {
			b=a1[i];
			int j = i-1;
			for (; j>=0&&b<a1[j]; j--) {
				a1[j+1]=a1[j];
			}
			a1[j+1]=b;
			
		}
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i]+"  ");
		}
		System.out.println();
		
		
		
		
		
		int j;
		for (int i = 0; i < a1.length; i++) {
			j=i;
			b=a1[i];
			while(j > 0 && b<a1[j-1]){
				a1[j]=a1[j-1];
				j--;
			}
			a1[j]=b;
			System.out.print(a1[j]+"  ");
		}
	}

}
