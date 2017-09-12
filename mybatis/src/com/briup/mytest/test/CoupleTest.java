package com.briup.mytest.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.mybatis.utils.MyBatisSqlSessionFactory;
import com.briup.mytest.mappers.CoupleMapper;
import com.briup.mytest.pojo.Wife;

/**
 * 测试夫妻类一对一映射
 * @author LZP
 * 2017年9月10日
 */
public class CoupleTest {
	@Test
	public void findWifeByIdTest(){
		SqlSession sqlSession=null;
		try {
			sqlSession=MyBatisSqlSessionFactory.openSession();
			CoupleMapper mapper = sqlSession.getMapper(CoupleMapper.class);
			Wife wife = mapper.findWifeById(1);
			System.out.println(wife);
			
			
		} catch (Exception e) {
			e.fillInStackTrace();
		}
	}
	
	
	
	
	
	
	
	
}
