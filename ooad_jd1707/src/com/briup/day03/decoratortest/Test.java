package com.briup.day03.decoratortest;
/**
 * 装饰模式
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		//Action a=new AddDate(new AddBriup(new Person()));
		Action a=new AddDate(new AddBriup(new Person()));
		a.say("LZP");

	}

}
