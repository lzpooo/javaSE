package com.briup.day03.observer;

public class Father implements Observer{

	@Override
	public void update() {
		System.out.println("父亲收到了！");
		
	}

}
