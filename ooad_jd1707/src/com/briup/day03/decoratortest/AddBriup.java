package com.briup.day03.decoratortest;

public class AddBriup extends Decorator {

	public AddBriup(Action action) {
		super(action);
		
	}
	public void say(String name){
		System.out.println("a");
		super.say(name);
		add();
	}
	private void add() {
		System.out.println("briup_");
		
	}
}
