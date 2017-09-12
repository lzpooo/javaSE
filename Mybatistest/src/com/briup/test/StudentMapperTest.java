package com.briup.test;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.briup.mappers.StudentMapper;
import com.briup.pojo.PhoneNumber;
import com.briup.pojo.Student;
import com.briup.utils.MyBatisSqlSessionFactory;

public class StudentMapperTest {
	
@Test
public void testInsert(){
	
try {
	//加载配置文件
	InputStream inputStream =
Resources.getResourceAsStream
("mybatis-config.xml"); 
	
	//创建SqlSessionFactory工厂类对象
	SqlSessionFactory sqlSessionFactory =
		new SqlSessionFactoryBuilder()
	.build(inputStream);
	//通过工厂类对象，创建SqlSession
	//用来动态生成映射接口的实现类
	SqlSession sqlSession =
	sqlSessionFactory.openSession();
	
	//执行操作
	
	//创建接口的实现类对象
	StudentMapper studentMapper = 
			sqlSession.getMapper
			(StudentMapper.class);
	
	
	Student s = new Student
(3,"tom3","123@briup.com",new Date());
	
	studentMapper.insertStudent(s);
	
	sqlSession.commit();
} catch (Exception e) {
	e.printStackTrace();
}
	
}

@Test
public void test(){
	Object o=new Student
	(1,"tom","123@briup.com",new Date());
	
	String fName="name";
	
	Class<? extends Object> c 
		= o.getClass();
	
	String methodName="get"+
		fName.substring(0,1).toUpperCase()
		+fName.substring(1,fName.length());
	
	System.out.println(methodName);
	
	try {
		//获取到对应的方法
		Method method 
		= c.getMethod(methodName);
		
		Object v = method.invoke(o);
		System.out.println(v);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

@Test
public void testfindStudentById(){
try {
	//获取sqlsession对象
SqlSession sqlSession =
MyBatisSqlSessionFactory.openSession();
	
	//执行操作
	
	//创建接口的实现类对象
	/*StudentMapper studentMapper = 
			sqlSession.getMapper
			(StudentMapper.class);
	
	Student stu=
studentMapper.findStudentById(3);
*/
	Student stu=sqlSession.selectOne
("com.briup.mappers.StudentMapper.findStudentById",4);

	System.out.println(stu);
	
} catch (Exception e) {
	e.printStackTrace();
}
	
}

@Test
public void testdeleteStudent(){
	
try {
	org.apache.ibatis.logging.LogFactory.useStdOutLogging();
	//获取sqlsession对象
SqlSession sqlSession =
MyBatisSqlSessionFactory.openSession();
	
	//执行操作
	
	//创建接口的实现类对象
	StudentMapper studentMapper = 
			sqlSession.getMapper
			(StudentMapper.class);
	
	studentMapper.deleteStudent(2);
	
	sqlSession.commit();
} catch (Exception e) {
	e.printStackTrace();
}
	
}

@Test
public void testUpdateStudent(){
	
try {
	//获取sqlsession对象
SqlSession sqlSession =
MyBatisSqlSessionFactory.openSession();
	
	//执行操作
	//创建接口的实现类对象
	StudentMapper studentMapper = 
			sqlSession.getMapper
			(StudentMapper.class);
Student stu=new Student
(1,"张三","111@briup.com",null);
	studentMapper.updateStudent(stu);
	
	sqlSession.commit();
} catch (Exception e) {
	e.printStackTrace();
}
	

}

//测试自定义类型
@Test
public void testInsertPhone(){
	try {
	//获取sqlsession对象
	SqlSession sqlSession=
MyBatisSqlSessionFactory.
openSession(true);
	
	//获取接口的实现类对象
	StudentMapper mapper = 
	sqlSession.getMapper
	(StudentMapper.class);

PhoneNumber phone=
new PhoneNumber("110", "119", "120");

Student stu=
new Student(4,"rose","123@briup.com",new Date(),phone);
	
	mapper.insertPhone(stu);
} catch (Exception e) {
	e.printStackTrace();
}
	
}

@Test
public void findAllStudent(){
	try {
		SqlSession sqlSession=
				MyBatisSqlSessionFactory.
				openSession();
					
		StudentMapper mapper = 
		sqlSession.getMapper
		(StudentMapper.class);

				
		List<Student> list = mapper.findAllStudents();
		for(Student s:list){
			System.out.println(s);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}


@Test
public void test_insertWithId(){
	try {
SqlSession session=null;
session=
MyBatisSqlSessionFactory.openSession();
		
 StudentMapper mapper =
session.getMapper(StudentMapper.class);

 PhoneNumber phone=
	new PhoneNumber("111","222","333");
 Student stu=
new Student(
		"tom", 
		"123@qq.com", 
		new Date(),
		phone);
 
 mapper.insertWithId(stu);
 session.commit();
 System.out.println(stu);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}








