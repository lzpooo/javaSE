package com.briup.day02.buildexercise;

public class WomanPersonBuilder implements PersonBuilder {
	
	private Person womanPerson;
	
	public WomanPersonBuilder() {
		
		womanPerson=new Person();
	}
	
	@Override
	public void BuilderHead() {
		womanPerson.setHead(new HeadTwo());

	}

	@Override
	public void BuilderBody() {
		womanPerson.setBody(new BodyTwo());

	}

	@Override
	public void BuilderLegs() {
		womanPerson.setLegs(new LegsTwo());

	}

	@Override
	public Person getPerson() {
		
		return womanPerson;
	}

}
