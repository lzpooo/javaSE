package com.briup.day02.singlemodel;

public class Singleton {
	private static Singleton s;
	private Singleton() {}
	public static Singleton getInstance(){
		if(s == null){
			s = new Singleton();
			
		}
		return s;
	}
//	@Override
//	public String toString() {
//		return "Singleton [getClass()=" + getClass() + ", hashCode()="
//				+ hashCode() + ", toString()=" + super.toString() + "]";
//	}
	
	
}
class MyThread extends Thread{
	Singleton s1=null;
	public void run(){
		System.out.println(getName()+"开始执行！");
		
		s1=Singleton.getInstance();
		System.out.println(s1);
		
	}
	
	
}
