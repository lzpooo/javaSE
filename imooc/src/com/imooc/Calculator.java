package com.imooc;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.println("请输入第一个数：");
		int x = in.nextInt();
		Scanner in1=new Scanner(System.in);
		System.out.println("请输入第二个数：");
		int y = in1.nextInt();
		System.out.println("请输入要执行到操作序号：");
		System.out.println( "1:加  2:减  3:乘  4：除");
		int z = in.nextInt();
		int n;
		
					
			if (z == 1){
				n = x +y ;
				System.out.println(x +"+"+ y +"="+ n);
				
			}
			
			else if (z == 2){
				n = x-y;
				System.out.println(x +"-"+ y +"="+ n );
			}
            else if (z == 3){
				n=x*y;
				System.out.println(x +"*"+ y +"="+ n );
			}
			else if (z == 4){
				if(y == 0){
					System.out.println("除数不能为0！请重新输入");
				}
				else{
				n=x/y;
				System.out.println(x +"/"+ y +"="+n );
				}
			}
			else {
				System.out.println("请输入正确的序号！");
				
			
		}
		
		
	}
	

}
