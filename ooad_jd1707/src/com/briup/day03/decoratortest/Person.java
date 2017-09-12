package com.briup.day03.decoratortest;

public class Person implements Action {

	@Override
	public void say(String name) {
		System.out.println("hello "+name);

	}

}
