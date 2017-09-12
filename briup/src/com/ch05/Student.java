package com.ch05;

class Student implements Person{
	public int sID=0001;
	public String speciality="beautiful";

	public String name;
	public char sex;
	public String birthday;
	
	public void showS(){
		System.out.println("sID:"+sID+"  speciality:"+speciality);
	}
	
	public void setData(String name,char sex,String birthday){
		this.name=name;
		this.sex=sex;
		this.birthday=birthday;
	}

	public void getData(){
		
		
	}
	public void showP(){
		System.out.println("name:"+this.name+"  sex:"+this.sex+"  birthday:"+this.birthday);
	}
	public static void main(String[] args) {
		Student student=new Student();
		student.showS();
		student.showP();
		System.out.println(string);
	}
}
