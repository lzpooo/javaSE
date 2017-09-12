package com.briup.ch14;
import java.util.*;

import com.briup.ch14.Student;
public class StuMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1, "sad", 59);
		Student s2=new Student(2, "sad1", 89);
		Student s3=new Student(3, "sad2", 58);
		Student s4=new Student(4, "tom", 9);
		Student s5=new Student(5, "sadsdsasdas", 39);
		Set<Student> set1=new TreeSet<Student>(new MyComparator());
		set1.add(s1);
		set1.add(s2);
		set1.add(s3);
		set1.add(s4);
		set1.add(s5);
		for (Student student : set1) {
			System.out.println(student.toString());
			
		}
	}

}
class MyComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getName().equals("tom")){
			return -1;
		}
		if(o1.getScore()>o2.getScore()){
			return -1;
		}
		else{
			return 1;
		}
	}
}

