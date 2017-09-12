package com.briup.jdbc.day_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.briup.jdbc.day_01.DriverFactory;

/**
 * 使用PreparedStatement测试sql注入
 * @author Administrator
 *
 */
public class StudentPs {
	private static Connection connection;
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	public static void main(String[] args) throws SQLException {
		//获取连接对象
		connection=DriverFactory.getConnection();
		
		//模拟前台传入数据
		Student stu=new Student();
		stu.setName("rose");
		stu.setPassword("333");
		
		//1.对象创建时就需要传入sql语句，起预编译的功能
		String sql="select * from student where name=? and password=?";
		//创建PreparedStatement对象
		ps=connection.prepareStatement(sql);
		
		//完善sql语句
		/*
		 * 第一个参数：sql语句中的第几个？占位符，index从1开始
		 * 第二个参数：要传入的值，要与set方法的数据类型匹配
		 */
		ps.setString(1, stu.getName());
		ps.setString(2, stu.getPassword());
		
		//执行sql语句
		rs=ps.executeQuery();
		
		//处理结果集
		while(rs.next()){
			System.out.println("id:"+rs.getInt("id")+"  name:"+rs.getString("name")+"  password:"+
		rs.getString("password")+"  age:"+rs.getInt("age")+"  gender:"+rs.getString("gender"));
		}

		//关闭资源
		DriverFactory.getClose(connection, ps, rs);
	}
	
	
	
}
