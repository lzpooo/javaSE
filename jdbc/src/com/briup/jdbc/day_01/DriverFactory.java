package com.briup.jdbc.day_01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 封装jdbc前两步
 * 
 * @author Administrator
 *
 */
public class DriverFactory {
	private static Properties pro;
	private static String driver;
	private static String url;
	private static String name;
	private static String pwd;
	private static Connection connection;

	static {
		File file = new File("src/com/briup/jdbc/day_01/jdbc.properties");
		// 测试路径是否存在
		// System.out.println(file.exists());
		try {

			pro = new Properties();
			pro.load(new FileInputStream(file));
			driver = pro.getProperty("driver");
			url = pro.getProperty("url");
			name = pro.getProperty("user");
			pwd = pro.getProperty("password");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		try {
			// 1.获取驱动
			Class.forName(driver);
			// 2.获取连接对象
			connection = DriverManager.getConnection(url, name, pwd);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return connection;
	}

	// 关闭资源
	public static void getClose(Connection connection, Statement st,
			ResultSet rs) {

		try {

			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (connection != null)
				connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 测试是否获取connection对象的main方法
	 */
	/*
	 * public static void main(String[] args) { Connection con = new
	 * DriverFactory().getConnection(); System.out.println(con); }
	 */
}
