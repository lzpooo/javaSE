package com.briup.jdbc.day_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 测试jdbc连接数据库的步骤
 * 
 * @author Administrator
 *
 */
public class SimpleJDBC1 {
	private static ResultSet resultSet;
	private static Statement statement;
	private static Connection connection;

	public static void main(String[] args) {
		// 注册、加载驱动
		/**
		 * 1.使用类加载器(反射)
		 * 
		 */
		try {
			// 加载驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.建立连接
			/**
			 * 第一个参数：指定数据库的url标识 第二个参数：指定数据库中的用户名 第三个参数：指定数据库中的密码
			 */
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:XE", "jd1707", "jd1707");
			// 3.创建执行sql语句的statement对象
			statement = connection.createStatement();
			// 4.执行sql语句
			//String sql = "select * from s_dept";
			String sql1="insert into s_dept values(1,'play',1)";
			// 接收返回数据的结果集
			//executeQuery()专门用来执行select语句，有resultset结果集
			//executeUpdate()专门用来执行insert、update、delete语句，返回int类型结果
			//execute()判断当前语句是否有结果集返回，返回一个Boolean
			//3种执行方式，都会执行sql语句
			//resultSet = statement.executeQuery(sql);
			int update = statement.executeUpdate(sql1);
			System.out.println("插入："+update+"条数据！");
			
			// 5.处理结果集
			
			// .next判断是否有下一行数据，并返回一个boolean			
			/*while (resultSet.next()) {
				// 获取想要的数据
				// getXxx()是根据想要的类型来获取数据库对象
				System.out.println("id:" + resultSet.getInt("id") + "   "
						+ "name:" + resultSet.getString("name") + "   "
						+ "region_id:" + resultSet.getInt("region_id"));
			}*/

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			// 6.关闭资源,先开的后关
			try {
				if (resultSet != null ) 
					resultSet.close();
				
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
