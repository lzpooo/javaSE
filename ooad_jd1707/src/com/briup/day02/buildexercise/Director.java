package com.briup.day02.buildexercise;

public class Director {
	private PersonBuilder builder;

	public Director(PersonBuilder builder) {
		this.builder = builder;

	}

	// 指导builder如何建造人
	public void construct() {
		builder.BuilderHead();
		builder.BuilderBody();
		builder.BuilderLegs();
	}
}
