package com.black;

public class Person {
	private String name;
	private int age;
	private char gender;

	public Person(int age) {
		this.age = age;
	}

	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void show() {
		System.out.println(this.name);
		;
	}

	public void speak() {
		System.out.println("name:" + this.name + "  age:" + this.age
				+ "  gender:" + this.gender);
		this.show();
	}

	public void compareAge(Person p) {

		if (this.age==p.age){
			System.out.println("年龄相同！");
		}
		else {
			System.out.println("年龄不同");
		}
	}

	public static void main(String[] args) {

		Person p1 = new Person(18);
		Person p2 = new Person(18);
		p1.compareAge(p2);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
