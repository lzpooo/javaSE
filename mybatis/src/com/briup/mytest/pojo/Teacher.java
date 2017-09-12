package com.briup.mytest.pojo;

import java.util.List;

/**
 * 
 * @author LZP 2017年9月11日
 */
public class Teacher {
	private Integer teacherId;
	private String teacherName;
	private Integer teacherAge;
	private List<Student> studentList;

	public Teacher(Integer teacherId, String teacherName, Integer teacherAge,
			List<Student> studentList) {
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherAge = teacherAge;
		this.studentList = studentList;
	}
	
	public Teacher(Integer teacherId, String teacherName, Integer teacherAge) {
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherAge = teacherAge;
	}

	public Teacher(String teacherName, Integer teacherAge,
			List<Student> studentList) {
		this.teacherName = teacherName;
		this.teacherAge = teacherAge;
		this.studentList = studentList;
	}

	public Teacher() {
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Integer getTeacherAge() {
		return teacherAge;
	}

	public void setTeacherAge(Integer teacherAge) {
		this.teacherAge = teacherAge;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName="
				+ teacherName + ", teacherAge=" + teacherAge + ", studentList="
				+ studentList + "]";
	}

}
