package com.briup.day02.buildexercise;

public class Test {
	public static void main(String[] args) {
		Person manPerson=null;
		PersonBuilder manPersonBuilder=new ManPersonBuilder();
		Director director=new Director(manPersonBuilder);
		director.construct();
		manPerson=manPersonBuilder.getPerson();
		System.out.println(manPerson);
	}
}
