package com.briup.day03.facade;
/**
 * 门面模式
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Facade f = new Facade();
		f.modelA();
		f.modelB();
		f.modelC();
		f.modelB();
	}
}
