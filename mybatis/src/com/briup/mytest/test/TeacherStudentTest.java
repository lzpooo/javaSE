package com.briup.mytest.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.mybatis.utils.MyBatisSqlSessionFactory;
import com.briup.mytest.mappers.TeacherStudentMapper;
import com.briup.mytest.pojo.Student;

public class TeacherStudentTest {
	@Test
	public void findAllStudentTeacherTest(){
		SqlSession sqlSession=null;
		try {
			sqlSession=MyBatisSqlSessionFactory.openSession();
			TeacherStudentMapper mapper = sqlSession.getMapper(TeacherStudentMapper.class);
			List<Student> list = mapper.findAllStudentTeacher();
			for (Student s:list) { 
				System.out.println(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
