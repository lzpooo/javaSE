package com.briup.mytest.pojo;

/**
 * 妻子类
 * 
 * @author LZP 
 * 
 * 2017年9月10日
 */
public class Wife {
	private Integer id;
	private String name;
	private Integer age;
	private Husband husband;

	public Wife(String name, Integer age, Integer id, Husband husband) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.husband = husband;
	}

	public Wife(String name, Integer age, Husband husband) {
		this.name = name;
		this.age = age;
		this.husband = husband;
	}

	public Wife() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Husband getHusband() {
		return husband;
	}

	public void setHusband(Husband husband) {
		this.husband = husband;
	}

	@Override
	public String toString() {
		return "Wife [name=" + name + ", age=" + age + ", id=" + id
				+ ", husband=" + husband + "]";
	}

}
