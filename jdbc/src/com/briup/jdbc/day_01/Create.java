package com.briup.jdbc.day_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 使用PreparedStatement接口创建一个数据库表
 * @author Administrator
 *
 */
public class Create {
	private static Connection connection;
	private static ResultSet resultSet;
	private static Statement statement;

	public static void main(String[] args) {
		// 直接返回连接对象
		connection = DriverFactory.getConnection();

		String str="create table lzp(id number not null,name varchar2(20) not null,age number default 0,primary key(id))";
		try {
			PreparedStatement statement1 = connection.prepareStatement(str);
			statement1.execute();
		} catch (SQLException e) {
			e.printStackTrace();
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
	
	
}
