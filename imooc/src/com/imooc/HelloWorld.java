package com.imooc;
import java.util.Arrays;
public class HelloWorld {	
	int age;
	String name;
	double stature;
	public static void main(String[] args) {
		
	
	HelloWorld hello = new HelloWorld();
	hello.age = 10;
	hello.name = "我是谁";
	hello.stature = 165;
	HelloWorld hello1 = new HelloWorld();
	hello1.age = 11;
	hello1.name = "我是谁";
	hello1.stature = 165;
	if (hello.equals(hello1)){
		System.out.println("两个对象是相同的！");
	}
	else{
		System.out.println("两个对象是不同的！");
	}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(stature);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HelloWorld other = (HelloWorld) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(stature) != Double
				.doubleToLongBits(other.stature))
			return false;
		return true;
	}
}
