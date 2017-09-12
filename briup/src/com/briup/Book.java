package com.briup;

import javax.tools.ForwardingFileObject;

public class Book {
	int isbn;
	String name;
	double price;
	String author;
	//throws后面可以跟多个异常，用逗号隔开 
	//返回的String类型可以使用变量去接收
	public String isRead(int day)throws NullPointerException,IndexOutOfBoundsException{
		System.out.println(name+"被借阅"+day+"天!");
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book();
		b1.name="《Java从入门到放弃》";
		b1.isRead(5);
	}
	

}
