package com.briup.test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.mappers.ResultMapper;
import com.briup.pojo.Student;
import com.briup.utils.MyBatisSqlSessionFactory;

public class ResultMapperTest {
	@Test
	public void test_findAllStudents(){
		SqlSession sqlSession=null;
		try {
		sqlSession=
	MyBatisSqlSessionFactory.openSession();
		
		ResultMapper mapper=
				sqlSession.getMapper
		(ResultMapper.class);
		
		List<Student> list 
		= mapper.findAllStudents();
		
		for(Student stu:list){
			System.out.println(stu);
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null)
				sqlSession.close();
		}
	}
	
	@Test
	public void test_findStudent_Set(){
		SqlSession sqlSession=null;
		try {
		sqlSession=
	MyBatisSqlSessionFactory.openSession();
		
		ResultMapper mapper=
				sqlSession.getMapper
		(ResultMapper.class);
		
		SortedSet<Student> list 
		= mapper.findStudent_Set();
		
		for(Student stu:list){
			System.out.println(stu);
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null)
				sqlSession.close();
		}
	}

	
	@Test
	public void test_findStudentById_Map(){
		SqlSession sqlSession=null;
		try {
		sqlSession=
	MyBatisSqlSessionFactory.openSession();
		
		ResultMapper mapper=
				sqlSession.getMapper
		(ResultMapper.class);
		
		 Map<String, Object> map =
		mapper.findStudentById_Map(1);
		
		for(String key:map.keySet()){
		System.out.println
		(key+" : "+map.get(key));
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null)
				sqlSession.close();
		}
	}
	
	@Test
	public void test_findStudent_ListMap(){
		SqlSession sqlSession=null;
		try {
			sqlSession=
					MyBatisSqlSessionFactory.openSession();
			
			ResultMapper mapper=
					sqlSession.getMapper
					(ResultMapper.class);
			
			List<Map<String, Object>> list =
					mapper.findStudent_ListMap();
			
	for(Map<String, Object> map:list){
		for(String key:map.keySet()){
			System.out.println
			(key+" : "+map.get(key));
		}
System.out.println("------------");
	}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null)
				sqlSession.close();
		}
	}
	@Test
	public void test_findAllName_list(){
		SqlSession sqlSession=null;
		try {
			sqlSession=
					MyBatisSqlSessionFactory.openSession();
			
			ResultMapper mapper=
					sqlSession.getMapper
					(ResultMapper.class);
			
			List<String> list =
					mapper.findAllName_list();

			for(String l:list){
				System.out.println(l);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null)
				sqlSession.close();
		}
	}

}








