package com.briup.day02.buildexercise;

public interface Body {

}

class BodyOne implements Body {
	public BodyOne(){
		System.out.print("+bodyone");
	}
}

class BodyTwo implements Body {
	public BodyTwo(){
		System.out.print("+bodytwo");
	}
}
