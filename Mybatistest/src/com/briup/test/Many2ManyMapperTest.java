package com.briup.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.many2many.Course;
import com.briup.many2many.Student;
import com.briup.mappers.Many2ManyMapper;
import com.briup.utils.MyBatisSqlSessionFactory;

public class Many2ManyMapperTest {
	@Test
	public void test_insertStudent(){
		
SqlSession session = null;
try {
	session =
MyBatisSqlSessionFactory.openSession();
	
	Many2ManyMapper mapper =
	session.getMapper(Many2ManyMapper.class);
		
	mapper.insertStudent(new Student("张三","男","计算机","大四"));
	
	session.commit();
	
} catch (Exception e) {
	e.printStackTrace();
	session.rollback();
}finally {
	if(session!=null)session.close();
}

	}
	
	@Test
	public void test_insertCourse(){
		
		SqlSession session = null;
		try {
			session = MyBatisSqlSessionFactory.openSession();
			
			Many2ManyMapper mapper = session.getMapper(Many2ManyMapper.class);
				
			mapper.insertCourse(new Course("001","corejava"));
			mapper.insertCourse(new Course("002","oracle"));
			
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			if(session!=null)session.close();
		}
		
	}
	
	@Test
	public void test_studentSelectCourse(){
		
		SqlSession session = null;
		try {
			session = MyBatisSqlSessionFactory.openSession();
			
			Many2ManyMapper mapper =
					session.getMapper(Many2ManyMapper.class);
				
			Student student = 
				mapper.getStudentById(42);
			Course course =
				mapper.getCourseById(44);
			
			mapper.
		studentSelectCourse(student, course);
			
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			if(session!=null)session.close();
		}
		
	}
	
	@Test
	public void test_getStudentByIdOnCondition(){
		
		SqlSession session = null;
		try {
			session = MyBatisSqlSessionFactory.openSession();
			
			Many2ManyMapper mapper =
					session.getMapper(Many2ManyMapper.class);
			
			List<Student> list = 
		mapper.getStudentByIdOnCondition(100);
			
			for(Student s:list){
				System.out.println(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
	}
	
	@Test
	public void test_getStudentByIdWithCourses(){
		
		SqlSession session = null;
		try {
			session = MyBatisSqlSessionFactory.openSession();
			
			Many2ManyMapper mapper = session.getMapper(Many2ManyMapper.class);
			
			Student student = 
	mapper.getStudentByIdWithCourses(42);
			
			System.out.println(student);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)session.close();
		}
		
	}
	
}








