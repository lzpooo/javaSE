package com.briup.ware;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://127.0.0.1:3306/ware";
	private static String user = "root";//sa
	private static String passwd = "root";
	/**
	 * 获取连接
	 * @throws Exception 
	 * */
	public static Connection getConn() throws Exception{
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, passwd);
		return conn;
	}
	
	/**
	 * 释放资源
	 * @throws SQLException 
	 * */
	public static void close(ResultSet rs ,
			PreparedStatement pstmt,Connection conn) throws SQLException{
		if(rs!=null){
			rs.close();
		}
		if(pstmt!=null){
			pstmt.close();
		}
		if(conn!=null){
			conn.close();
		}
	}
}