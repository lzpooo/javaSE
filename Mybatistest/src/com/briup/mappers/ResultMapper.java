package com.briup.mappers;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

import org.apache.ibatis.annotations.Select;

import com.briup.pojo.Student;
/**
 * 映射接口
 */
public interface ResultMapper {
public List<Student> findAllStudents();
public SortedSet<Student> findStudent_Set();
public Map<String, Object> 
	findStudentById_Map(Integer i);

public List<Map<String, Object>> 
findStudent_ListMap();

public List<String>
findAllName_list();
	


}




