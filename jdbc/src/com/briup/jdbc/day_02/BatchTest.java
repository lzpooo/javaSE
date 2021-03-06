package com.briup.jdbc.day_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.briup.jdbc.day_01.DriverFactory;

/**
 * 测试jdbc批处理
 * @author Administrator
 *
 */
public class BatchTest {
	private static Connection connection;
	@SuppressWarnings("unused")
	private static Statement st;
	private static PreparedStatement ps;
	@SuppressWarnings("unused")
	private static ResultSet rs;
	
	public static void main(String[] args) throws SQLException {
		connection=DriverFactory.getConnection();
		/*
		//使用statement进行批处理
		//适用于结构不同的sql语句
		st=connection.createStatement();
		String sql1="insert into batch values(1,'tom')";
		String sql2="update batch set id=2";
		//String sql3="select * from batch";
		
		//将sql语句添加到缓存中
		st.addBatch(sql1);
		st.addBatch(sql2);
		//st.addBatch(sql3);
		//执行缓存中的内容(批处理)
		st.executeBatch();
		*/
		
		//使用PreparedStatement进行批处理
		//适用于结构相同的sql语句
		String sql="insert into batch values(?,?)";
		ps=connection.prepareStatement(sql);
		for(int i = 0; i<50000;i++){
			ps.setInt(1, i);
			ps.setString(2, "x"+i);
			ps.addBatch();
			if(i%5000==0){
				System.out.println(i);
				ps.executeBatch();
				//清空缓存
				ps.clearBatch();
			}
		}
		ps.executeBatch();
		
		
		
	}
	
	
	
	
}
