package com.black;

class ClassA{
	static {
		System.out.println("In ClassA Static");
}
	public ClassA(){
		System.out.println("ClassA()");
	}
}
class ClassB{
	static {
		System.out.println("In ClassB Static");
	}
	public ClassB(){
		System.out.println("ClassB()");
	}
}
class ClassC extends ClassB{
	static{
		System.out.println("In ClassC Static");
	}
	public ClassC(){
		System.out.println("ClassC()");
	}
}
class MyClass {
	static ClassA ca = new ClassA();//定义了一个类型为ClassA的静态变量
	ClassC cc = new ClassC();//定义了一个类型为ClassC的变量
	static{
		System.out.println("In Static MyClass");
	}
	public MyClass(){
		System.out.println("MyClass()");
	}
}
public class Test1{
	public static void main(String args[]){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		System.out.println(mc1.cc == mc2.cc);
		System.out.println(mc1.ca == mc2.ca);
	}
}
