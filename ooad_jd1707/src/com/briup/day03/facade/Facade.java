package com.briup.day03.facade;

public class Facade {
	private ModelA a;
	
	private ModelB b;
	
	private ModelC c;
	
	public Facade(){
		a=new ModelA();
		b=new ModelB();
		c=new ModelC();
	}
	
	public void modelA(){
		a.modelA();
	}
	
	public void modelB(){
		b.modelB();
	}
	
	public void modelC(){
		c.modelC();
	}
}
