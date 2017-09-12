package com.briup.mybatis.day_01;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.mybatis.mappers.StudentMapper;
import com.briup.mybatis.pojo.PhoneNumber;
import com.briup.mybatis.pojo.Student;
import com.briup.mybatis.utils.MyBatisSqlSessionFactory;

/**
 * 使用工厂类测试
 * 
 * @author LZP 2017年9月7日
 */
public class StudentMapperTest1 {
	// 测试自定义类型
	@Test
	public void insertPhone() {
		try {
			// 获取sqlsession对象
			SqlSession sqlSession = MyBatisSqlSessionFactory.openSession(true);
			// 获取接口的实现类对象
			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			PhoneNumber phone = new PhoneNumber("1223", "456", "789");
			Student stu = new Student(7, "georasge", "sajudfgas", new Date(),
					phone);
			mapper.insertPhone(stu);
			List<Student> list = mapper.findAllStudents();
			for (Student s : list) {
				System.out.println(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void insertWithIdTest(){
		try {
			SqlSession session = null;
			session=MyBatisSqlSessionFactory.openSession();
			StudentMapper mapper =session.getMapper(StudentMapper.class);
			PhoneNumber phone=new PhoneNumber("111","222","333");
			Student stu =new Student("tom","123@qq.com",new Date(),phone);
			mapper.insertWithId(stu);
			//session.insert("com.briup.mybatis.mappers.StudentMapper", stu);
			session.commit();
			System.out.println(stu);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
