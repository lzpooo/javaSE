package com.briup;

public class Person {
	private String name;
	private int age;

	public Person() {
		System.out.println("1");
	}
	
	public Person(String name){
		this();
		this.name=name;
		System.out.println("2");
	}
	public Person(String name,int age){
		this(name);
		this.age=age;
		System.out.println("3");
	}
	public void show(){
		System.out.println("name:"+this.name+"  age:"+this.age);
	}
	
}
