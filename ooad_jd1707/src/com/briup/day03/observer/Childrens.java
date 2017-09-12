package com.briup.day03.observer;

import java.util.Iterator;
import java.util.Vector;

/**
 * 被观察者类:孩子类
 * @author Administrator
 *
 */
public abstract class Childrens implements Subject{
	
	private Vector<Observer> vector=new Vector<Observer>();
	
	//增加观察者
	@Override
	public void add(Observer observer) {
		vector.add(observer);
		
	}
	
	//删除观察者
	@Override
	public void delete(Observer observer) {
		vector.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> it=vector.iterator();
		while (it.hasNext()){
			Observer next=it.next();
			next.update();
		}
		
	}

	@Override
	public void operation() {
		
		
	}

}
