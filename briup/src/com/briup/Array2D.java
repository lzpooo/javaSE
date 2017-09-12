package com.briup;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[][] twoD=new int[4][];
		int[] a= {11,55,66,44};
		twoD[0]=a;
		int[] b={89,65,82,43,94};
		int[] c={64,75,48,79,64,85};
		int[] d={87,64,91,73,95,82,67};
		twoD[1]=b;
		twoD[2]=c;
		twoD[3]=d;
		int[] oneD={88,55,66,77};
		
		
		for(int i=0;i<twoD.length;i++){
			for(int j =0;j<twoD[i].length;j++){
				twoD[i][j]=(int)(Math.random()*100);
				System.out.print(twoD[i][j]+" ");
			}
			System.out.println();
		}
		twoD[0]=oneD;
		System.out.println(Arrays.toString(oneD));
		for(int m=0;m<twoD.length;m++){
			for(int n =0;n<twoD[m].length;n++){
				System.out.print(twoD[m][n]+" ");
			}
			System.out.println();
		}
		

	}
}
