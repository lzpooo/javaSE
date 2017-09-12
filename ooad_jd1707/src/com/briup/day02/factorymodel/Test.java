package com.briup.day02.factorymodel;

public class Test {
	public static void main(String[] args) {
		MoreFactory moreFactory = new MoreFactory();
		//Fruit fruit = factory.privider("apple");
		//fruit.sell();
		moreFactory.providerApple();
		moreFactory.providerPeach();
		//链式编程
		MoreFactory.providerApple().sell();
		
	}
}
