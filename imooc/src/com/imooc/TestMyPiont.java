package com.imooc;

public class TestMyPiont {
	public static void main(String[] args){
		//定义两个类型为MyPoint的变量，变量名为：start 和 end
		MyPiont start = new MyPiont();
		MyPiont end = new MyPiont();

		//分别给两个变量赋值
		start.x = 10;
		start.y = 10;
		end.x = 20;
		end.y = 30;

		//打印输出这两个变量
		System.out.println("Start point is " + start);
		System.out.println("End point is "+end);

		//声明一个新变量
		MyPiont stray = new MyPiont();
		stray = (MyPiont)end;

		//打印输出stray和end
		System.out.println("Stray point is "+stray);
		System.out.println("End point is "+end);

		//将新值赋值给stray
		stray.x = 62;
		stray.y = 34;

		//打印输出stray end start
		
		System.out.println("End point is "+end);
		System.out.println("Stray point is "+stray);
		System.out.println("Start point is "+start);




	}
}
