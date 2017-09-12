package com.briup.day03.observer;
/**
 * 观察者模式训练
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Subject sub=new Children();
		sub.add(new Father());
		sub.add(new Mother());
		sub.operation();
		
	}
}
