package com.briup.day02.singlemodel;

public class SingletonTest {
	public static void main(String[] args) {
		for(int i = 0 ; i<10;i++){
			new MyThread().start();
			
		}
	}
}
