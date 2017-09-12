package com.briup.day02.factorytest;

public class Test {
	public static void main(String[] args) {
		CommonFactory factory = new CommonFactory();
		Car c=factory.privider("CarA");
		c.deal();
	}
}
