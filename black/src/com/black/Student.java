package com.black;

import java.util.*;

public class Student {
	private Integer id;
	private String name;
	private Double score;

	public Student() {

	}

	public Student(Integer id, String name, Double score) {
		this.id= id;
		this.name= name;
		this.score = score;
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "jack", 8.0);
		Student s2 = new Student(3, "tom", 23.0);
		Student s3 = new Student(3, "mack", 67.0);
		Student s4 = new Student(4, "go", 90.0);
		Student s5 = new Student(5, "sadsdsasdas", 39.0);
		Student s6 = new Student(1, "sad", 59.0);
		Student s7 = new Student(2, "sad1", 89.0);
		Student s8 = new Student(3, "sad2", 58.0);
		Student s9 = new Student(4, "tom", 9.0);

		Set<Student> set = new TreeSet<Student>(new MyComparator());
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		set.add(s7);
		set.add(s8);
		set.add(s9);
		set.add(new Student(8, "tom", 12.0));
		for (Student student : set) {
			System.out.println(student);
		}

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id= id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name= name;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score
				+ "]";
	}

}

class MyComparator implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		if (o1.getName().equals("tom")) {
			return -1;
		}
		if (o2.getName().equals("tom")) {
			return 1;
		}
		if (o1.getScore() > o2.getScore()) {
			return -1;
		} else {
			return 1;
		}
	}
}
