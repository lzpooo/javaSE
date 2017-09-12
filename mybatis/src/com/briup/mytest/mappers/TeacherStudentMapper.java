package com.briup.mytest.mappers;

import java.util.List;

import com.briup.mytest.pojo.Student;

public interface TeacherStudentMapper {
	List<Student> findAllStudentTeacher();
}
