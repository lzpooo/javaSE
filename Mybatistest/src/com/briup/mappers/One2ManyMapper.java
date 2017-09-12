package com.briup.mappers;

import com.briup.pojo.Address;
import com.briup.pojo.Student;
import com.briup.pojo.Tutor;

/**
 * 映射接口
 */
public interface One2ManyMapper {
	public Tutor SelectAlltoTutor(Integer i);
	public Tutor findTutor(Integer i);

}




