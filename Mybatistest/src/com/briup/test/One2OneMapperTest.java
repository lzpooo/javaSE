package com.briup.test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.mappers.One2OneMapper;
import com.briup.mappers.ResultMapper;
import com.briup.pojo.Address;
import com.briup.pojo.Student;
import com.briup.utils.MyBatisSqlSessionFactory;

public class One2OneMapperTest {
	@Test
	public void test_selectStudentWithAddress(){
		SqlSession sqlSession=null;
		try {
		sqlSession=
	MyBatisSqlSessionFactory.openSession();
		
		One2OneMapper mapper=
				sqlSession.getMapper
		(One2OneMapper.class);
		
		Student stu=mapper
		.selectStudentWithAddress(1);
		System.out.println(stu);
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null)
				sqlSession.close();
		}
	}
	
	@Test
	public void test_findStudentById_1(){
		SqlSession sqlSession=null;
		try {
			sqlSession=
					MyBatisSqlSessionFactory.openSession();
			
			One2OneMapper mapper=
					sqlSession.getMapper
					(One2OneMapper.class);
			
			Student stu=mapper
					.findStudentById_1(1);
			System.out.println(stu);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null)
				sqlSession.close();
		}
	}
	
	@Test
public void test_insertAddress(){
SqlSession sqlSession=null;
try {
	sqlSession=
MyBatisSqlSessionFactory.openSession();
	
	One2OneMapper mapper=
			sqlSession.getMapper
			(One2OneMapper.class);
	Address address=
	new Address("解放路", "北京", "中国");
	mapper.insertAddress(address);
	sqlSession.commit();
} catch (Exception e) {
	e.printStackTrace();
}finally{
	if(sqlSession!=null)
		sqlSession.close();
}
	}

}








