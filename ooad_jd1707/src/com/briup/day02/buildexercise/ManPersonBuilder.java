package com.briup.day02.buildexercise;

public class ManPersonBuilder implements PersonBuilder {
	
	private Person manPerson;
	
	public ManPersonBuilder() {
		manPerson=new Person();
	}
	
	@Override
	public void BuilderHead() {
		manPerson.setHead(new HeadOne());
		
	}

	@Override
	public void BuilderBody() {
		manPerson.setBody(new BodyOne());
		
	}

	@Override
	public void BuilderLegs() {
		manPerson.setLegs(new LegsOne());
		
	}

	@Override
	public Person getPerson() {
		return manPerson;
		
	}
	
}
