package com.black;

 class Test3 {
	private String name="zs";
	
	public Test3(){
		printName();
	}
	public void printName(){
		System.out.println("我是你爸爸爸");
		System.out.println(name);
	}
	
}
public class Testttttttttt extends Test3{
	private String name1="ls";
	public Testttttttttt(){
		printName();
	}
	public void printName(){
		System.out.println("hahah");
		System.out.println(name1);
	}
	public static void main(String[] args) {
		new Testttttttttt();
	}
}
