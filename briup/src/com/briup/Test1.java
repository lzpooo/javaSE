package com.briup;

public class Test1 {

	private String name;
	private int age;
	private double price;
	
//	public Test1(){
//		
//	}
//	public String getName(){
//		return name;
//	}
//	public  void setName(String name){
//		this.name = name;
//		System.out.println(name);
//		name = "tom";
//		System.out.print(name);
//	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1();
		t.age=15;
		t.name="george";
		t.price=500000.0;
		System.out.println("name:"+t.name+"\nage:"+t.age+"\nprice:"+t.price);
				
	}

}
