package com.briup.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.briup.pojo.Student;
/**
 * 映射接口
 */
public interface StudentMapper {
//@Select("select * from students")
List<Student> findAllStudents(); 
Student findStudentById(Integer id); 
void insertStudent(Student student);

public void deleteStudent(Integer id);

public void updateStudent(Student stu);

public void insertPhone(Student stu);

public void insertWithId(Student stu);
}




