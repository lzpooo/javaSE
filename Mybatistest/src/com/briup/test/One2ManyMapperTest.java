package com.briup.test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.mappers.One2ManyMapper;
import com.briup.mappers.One2OneMapper;
import com.briup.mappers.ResultMapper;
import com.briup.pojo.Address;
import com.briup.pojo.Student;
import com.briup.pojo.Tutor;
import com.briup.utils.MyBatisSqlSessionFactory;

public class One2ManyMapperTest {
	@Test
	public void test_SelectAlltoTutor(){
		SqlSession sqlSession=null;
		try {
		sqlSession=
	MyBatisSqlSessionFactory.openSession();
		
		One2ManyMapper mapper=
				sqlSession.getMapper
		(One2ManyMapper.class);
		
		Tutor tutor =
		mapper.SelectAlltoTutor(1);
		
		System.out.println(tutor);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null)
				sqlSession.close();
		}
	}
	@Test
	public void test_findTutor(){
		SqlSession sqlSession=null;
		try {
			sqlSession=
					MyBatisSqlSessionFactory.openSession();
			
			One2ManyMapper mapper=
					sqlSession.getMapper
					(One2ManyMapper.class);
			
			Tutor tutor =
					mapper.findTutor(1);
			
			System.out.println(tutor);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null)
				sqlSession.close();
		}
	}

}








