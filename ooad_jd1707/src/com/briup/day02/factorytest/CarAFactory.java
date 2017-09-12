package com.briup.day02.factorytest;

public class CarAFactory implements Factory {

	@Override
	public Car privider() {
		
		return new CarA();
	}

	

}
