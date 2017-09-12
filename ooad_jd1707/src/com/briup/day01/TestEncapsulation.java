package com.briup.day01;
/**
 * 测试封装特性，接口回调
 * @author LZP
 *2017.8.18
 *
 */
public class TestEncapsulation {
	
	public static void main(String[] args) {
		Student s=new Student();
		//接口回调MVP
		s.doWork(new Work() {
			
			@Override
			public void doWork() {
				System.out.println("吃饭");
				
			}
		});
		
		Math.random();
		
		
	}
}
