package com.briup.jdbc.day_01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC进行增删改查
 * 
 * @author Administrator
 *
 */
public class SimpleJDBC2 {
	private static Connection connection;
	private static ResultSet resultSet;
	private static Statement statement;

	public static void main(String[] args) {
		// 直接返回连接对象
		connection = DriverFactory.getConnection();
		// 创建statement对象
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String Isql = "insert into t_user values(1,'tom',1000)";
		String Ssql = "select * from t_user";
		//String Usql = "update t_user set name='jack'";
		//String Dsql = "delete t_user";
		sqlyuju(Isql);
		sqlyuju(Ssql);
		
		//插入
		//insert(Isql);		
		//查询
		//select(Ssql);
		
		//修改
		//update(Usql);		
		//查询		
		//select(Ssql);
		
		// 删除
		//delete(Dsql);		
		// 查询
		//select(Ssql);

	}

	/*// 插入
	public static void insert(String sql) {
		try {
			
			// 执行sql语句，插入
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
	}*/

	/*// 查询
	public static void select(String sql) {
		try {
			
			// 执行sql语句,查询
			resultSet = statement.executeQuery(sql);
			// 处理结果集
			while (resultSet.next()) {
				System.out.println("id:" + resultSet.getInt(1) + "   "
						+ "name:" + resultSet.getString(2) + "   " + "salary:"
						+ resultSet.getInt(3));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}*/

	/*// 修改
	public static void update(String sql) {
		try {
			
			// 执行sql语句，修改
			int i = statement.executeUpdate(sql);
			System.out.println("修改：" + i + "条数据！");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}*/

	/*// 删除
	public static void delete(String sql) {

		try {
			
			// 执行sql语句，删除
			int i = statement.executeUpdate(sql);
			System.out.println("删除：" + i + "条数据！");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}*/
	
	//封装后的增删改查方法
	public static void sqlyuju(String sql) {
		try {
			if(sql.substring(0,3).equals("sel")){
				// 执行sql语句,查询
				resultSet = statement.executeQuery(sql);
				// 处理结果集
				while (resultSet.next()) {
					System.out.println("id:" + resultSet.getInt(1) + "   "
							+ "name:" + resultSet.getString(2) + "   " + "salary:"
							+ resultSet.getInt(3));
				}
			}else if(sql.substring(0,3).equals("upd")){
				// 执行sql语句，修改
				int i = statement.executeUpdate(sql);
				System.out.println("修改：" + i + "条数据！");
			}else if(sql.substring(0,3).equals("del")){
				// 执行sql语句，删除
				int i = statement.executeUpdate(sql);
				System.out.println("删除：" + i + "条数据！");
			}else if(sql.substring(0,3).equals("ins")){
				// 执行sql语句，插入
				int i = statement.executeUpdate(sql);
				System.out.println("插入：" + i + "条数据！");
			}else
				System.out.println("请输入正确的sql语句！");
			

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
