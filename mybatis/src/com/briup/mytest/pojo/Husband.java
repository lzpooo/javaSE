package com.briup.mytest.pojo;

/**
 * 丈夫类
 * 
 * @author LZP 
 * 
 * 2017年9月10日
 */
public class Husband {
	private Integer husId;
	private String husName;
	private Integer husAge;

	public Husband(Integer id, String name, Integer age) {
		this.husId = id;
		this.husName = name;
		this.husAge = age;
	}

	public Husband() {
	}

	public Husband(String name, Integer age) {
		this.husName = name;
		this.husAge = age;
	}

	public Integer getId() {
		return husId;
	}

	public void setId(Integer id) {
		this.husId = id;
	}

	public String getName() {
		return husName;
	}

	public void setName(String name) {
		this.husName = name;
	}

	public Integer getAge() {
		return husAge;
	}

	public void setAge(Integer age) {
		this.husAge = age;
	}

	@Override
	public String toString() {
		return "Husband [id=" + husId + ", name=" + husName + ", age=" + husAge + "]";
	}

}
