package com.imooc;
import java.util.*;
public class Text2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("请输入你的年龄：");
			Scanner input = new Scanner(System.in);
			System.out.println("十年后你"+(input.nextInt()+10)+"岁！");
		}
		catch(InputMismatchException e){
			System.out.println("你应该输入整数！");
		}
		System.out.println("程序结束啦！");
	}

}
