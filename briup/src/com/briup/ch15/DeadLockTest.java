package com.briup.ch15;

public class DeadLockTest extends Thread{
	private Object obj1;
	private Object obj2;
	public DeadLockTest(Object obj1,Object obj2){
		this.obj1=obj1;
		this.obj2=obj2;
	}
	
	public void run(){
		String name=getName();
		
		if("thread-0".equals(name)){
			while(true){
			synchronized (obj1) {
				synchronized (obj2) {
					System.out.println("name="+name);
				}
			}
		}
		}
		else {
			while(true){
			synchronized (obj2) {
				synchronized (obj1) {
					System.out.println(name+"**");
				}
			}
		}
		}
	}
	
	public static void main(String[] args) {
		Object obj1=new Object();
		Object obj2=new Object();
		DeadLockTest th1=new DeadLockTest(obj1,obj2);
		th1.start();
	}
}
