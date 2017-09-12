package com.briup;

public class YangHui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[10][];
		for (int i=0;i<arr.length;i++){
     		arr[i]=new int[i+1];
     		for(int k=arr.length;k>i;k--){
     			System.out.print("  ");
     		}
			for(int j=0;j<arr[i].length;j++){
				if(j==0 || j==i){
					arr[i][j]=1;
					
				}
				else{
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
					
				}
				if(arr[i][j]<10)
				{
					System.out.print(arr[i][j]+"  ");
				}
				else{
					System.out.print(arr[i][j]+"  ");
				}
				
				
			}
			System.out.println();
		}
		
	}

}
