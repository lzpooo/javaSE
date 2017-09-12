package com.briup.jdbc.day_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 练习2
 * @author Administrator
 *
 */
public class JDBCExercise2 {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static String[] sql=new String[10];
	private static int a=10;
	private static List<Student> list;
	private static Student stu;
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:XE", "jd1707", "jd1707");
			String sele="select * from t_student";
			String sele1="select * from student";
			String upda="update t_student set name='zhangsan' where id=2";
			String dele="delete from t_student where id=5";
//			insert();
//			select(sele);
			update(upda);
//			select(sele);
			update(dele);
//			select(sele);
			findAll(sele);
			for(Student s:list){
				System.out.println(s.toString());
			}
			saveAll(list);
			select(sele1);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				if(statement != null)
					statement.close();
				
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
		// 插入
		public static void insert() {
			try {
				// 创建statement对象
				statement = connection.createStatement();
				// 执行sql语句，删除
				for (int i = 0; i < 10 ; i++) {
					sql[i]="insert into t_student values (" + (i+1) +",'tom',"+(a+i)+")";
					//System.out.println(sql[i]);
					int j = statement.executeUpdate(sql[i]);
					System.out.println("插入"+j+"条数据！");
				}

			} catch (SQLException e) {
				
				try {
					//如果插入报错，回滚整个事务
					connection.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
		// 查询
		public static void select(String sql) {
			try {
				// 创建statement对象
				statement = connection.createStatement();
				// 执行sql语句,查询
				resultSet = statement.executeQuery(sql);
				// 处理结果集
				while (resultSet.next()) {
					System.out.println("id:" + resultSet.getInt(1) + "   "
							+ "name:" + resultSet.getString(2) + "   " + "age:"
							+ resultSet.getInt(3));
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		// 修改
		public static void update(String sql) {
			try {
				// 创建statement对象
				statement = connection.createStatement();
				// 执行sql语句，删除
				int i = statement.executeUpdate(sql);
				System.out.println("修改：" + i + "条数据！");

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		//将查询结果封装成student对象并返回
		public static List<Student> findAll(String s){
			list=new ArrayList<>();
			try {
				// 创建statement对象
				statement = connection.createStatement();
				// 执行sql语句,查询
				resultSet = statement.executeQuery(s);
				// 处理结果集
				while (resultSet.next()) {
					stu=new Student();
					stu.setId(resultSet.getInt(1));
					stu.setName(resultSet.getString(2));
					stu.setAge(resultSet.getInt(3));
					//System.out.println(stu.toString());
					list.add(stu);
				}
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
			return list;
		}
		//将集合中所有数据插入到数据库表中
		public static void saveAll(List<Student> list){
			String[] str1=null;
			String[] str2=null;
			String[] str3=null;
			String[] str4=null;
			String[] str5=null;
			String[] str6=null;
			//System.out.println(list.get(1));
			for(Student s:list){
				String s1=String.valueOf(s);
				//System.out.println(s1);
				str1=s1.split("\\[");
				str2=str1[1].split("\\]");
				str3=str2[0].split(",");
				str4=str3[0].split("=");
				str5=str3[1].split("=");
				str6=str3[2].split("=");
				String str7="insert into student values("+str4[1]+",'"+str5[1]+"',"+str6[1]+")";
				insert1(str7);
				
			}
			
			
		}
		// 插入1
		public static void insert1(String sql) {
			try {
				// 创建statement对象
				Statement statement = connection.createStatement();
				// 执行sql语句，删除
				int i = statement.executeUpdate(sql);
				System.out.println("插入：" + i + "条数据！");

			} catch (SQLException e) {
				
				try {
					//如果插入报错，回滚整个事务
					connection.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
		
		
}
