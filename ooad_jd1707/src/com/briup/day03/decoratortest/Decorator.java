package com.briup.day03.decoratortest;

public abstract class Decorator implements Action {
	private Action action;
	
	public Decorator(Action action) {
		this.action=action;
	}
	
	@Override
	public void say(String name) {
		this.action.say(name);

	}

}
