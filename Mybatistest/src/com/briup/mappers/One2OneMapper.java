package com.briup.mappers;

import com.briup.pojo.Address;
import com.briup.pojo.Student;

/**
 * 映射接口
 */
public interface One2OneMapper {
	public Student selectStudentWithAddress(Integer id);

	public Student findStudentById_1(Integer id);
	
	public void insertAddress(Address address);
	
}




