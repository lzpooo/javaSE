package com.briup.jdbc.day_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTest {
	private static Connection connection;
	private static Statement statement;
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:XE", "jd1707", "jd1707");
			statement = connection.createStatement();
			String sql=
					"create table t_student(id number not null,name varchar2(20) not null,age number default 0,primary key (id));";
			boolean b = statement.execute(sql);
			if(b){
				System.out.println("创建成功！");
			}else
				System.out.println("创建失败！");
			
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
}
