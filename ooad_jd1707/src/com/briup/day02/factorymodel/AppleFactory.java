package com.briup.day02.factorymodel;
/**
 * 苹果工厂
 * @author LZP
 *
 */
public class AppleFactory implements Factory{

	@Override
	public Fruit provider() {
		// TODO Auto-generated method stub
		return new Apple();
	}
	
	

	
}
