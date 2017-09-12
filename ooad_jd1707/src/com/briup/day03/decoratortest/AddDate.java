package com.briup.day03.decoratortest;

import java.util.Date;

public class AddDate extends Decorator {

	public AddDate(Action action) {
		super(action);
		
	}
	public void say(String name){
		addDate1();
		super.say(name);
		System.out.println("s");
		
	}
	private void addDate1() {
		System.out.println("　　"+new Date());
		
	}
	

}
