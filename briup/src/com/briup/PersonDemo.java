package com.briup;

import org.omg.CORBA.PUBLIC_MEMBER;

public class PersonDemo {
	public static void main(String[] args) {
		Person person=new Person("name",15);
		Person person2=new Person("kjh",88);
		person.show();
		person2.show();
		
	}
}
