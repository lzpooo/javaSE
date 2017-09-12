package com.briup;



public class Test2 {
	
	static void increment(int i){++i;}
	static void changeName(Student s){
		s.setName("Larry");
	}
	static void changeStudent(Student s){
		s = new Student("Mary","famale",20);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		System.out.println("before increment"+i);
		increment(i);
		System.out.println("after increment"+i);
		
		Student s=new Student("zhao","male",18);
		System.out.println("before changeName()"+s);
		changeName(s);
		System.out.println("after changeName()"+s);
		
		s=new Student("zhao","male",18);
		System.out.println("before changeName()"+s);
		
		changeStudent(s);
		System.out.println("after changeName(0"+s);
	}	
}
class Student{
	private String name;
	private String genderString;
	private int age;
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", genderString=" + genderString
				+ ", age=" + age + "]";
	}
	public Student(String name, String genderString, int age) {
		
		this.name = name;
		this.genderString = genderString;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenderString() {
		return genderString;
	}
	public void setGenderString(String genderString) {
		this.genderString = genderString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
