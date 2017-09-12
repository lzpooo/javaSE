package ch13;

import java.lang.reflect.Modifier;

import ch10.Student;

public class RefTest {
	public static void getPack(Class c){
		Package p=c.getPackage();
		System.out.println(p.getName());
		int mod=c.getModifiers();
		System.out.println(Modifier.toString(mod));
		Class sc=c.getSuperclass();
		System.out.println(sc.getName());
		//Class[]
	}
	
	public static void main(String[] args) {
		Class c=Student.class;
		//System.out.println(c);
		
		//System.out.println(getPack(c));
		
	//Class c2=String.getClass();
	//System.out.println(c2);
	//Class c3=Class.forName("com.briup.ch10.Student");
	}
}
