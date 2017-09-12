package com.briup.day03.observer;

public class Children extends Childrens{
	
	public void operation(){
		System.out.println("孩子生病了！");
		notifyObservers();
	}
}
