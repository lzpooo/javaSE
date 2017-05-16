package com.briup.ware;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wms {

	public void add (Ware ware) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				//1.2.  获取连接
				conn = ConnectionFactory.getConn();
				//3预处理sql
				String sql = "insert into t_ware(name,number,date,price) values(?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, ware.getName());
				pstmt.setInt(2, ware.getNumber());
				pstmt.setInt(3, ware.getDate());
				pstmt.setDouble(4, ware.getPrice());
				
				//4执行
				pstmt.executeUpdate();
			}finally{
				//6释放资源
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 通过id删除商品
	 */
	public void deleteById(long id) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "delete from t_ware where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 通过id查找商品
	 */
	public Ware findById(long id) {
		Ware ware = null;
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_ware where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				rs = pstmt.executeQuery();
				while(rs.next()){
					//long id = rs.getLong("id");
					String name = rs.getString("name");
					Integer number = rs.getInt("number");
					double price = rs.getDouble("price");
					Integer date = rs.getInt("date");
					ware = new Ware(id, name, number, date, price);
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ware;
	}

	/**
	 * 查找所有商品
	 */
	public List<Ware> findAll() {
		List<Ware> list = new ArrayList<Ware>();
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_ware";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					Long id= rs.getLong("id");
					String name = rs.getString("name");
					Integer number = rs.getInt("number");
					double price = rs.getDouble("price");
					Integer date = rs.getInt("date");
					Ware ware = new Ware(id, name, number, date, price);
					
				
					list.add(ware);
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 修改商品信息
	 */
	public void update(Ware ware) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "update t_ware set name=?,number=?,date=?,price=? where id =?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, ware.getName());
				pstmt.setInt(2, ware.getNumber());
				pstmt.setInt(3, ware.getDate());
				pstmt.setDouble(4, ware.getPrice());
				pstmt.setLong(5, ware.getId());
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 菜单
	public void menu() {
		System.out.println("*********超市商品管理系统*********");
		System.out.println("* 1. 查看所有商品信息");
		System.out.println("* 2. 录入商品信息");
		System.out.println("* 3. 删除商品信息");
		System.out.println("* 4. 更新商品信息");
		System.out.println("* 5. 查询商品信息");
		System.out.println("* help. 帮助");
		System.out.println("* exit. 退出");
		System.out.println("**********************************");
	}

	public static void main(String[] args) {
		Wms sms = new Wms();
		sms.menu();
		// 扫描标准输入，等待用户的输入
		Scanner sc = new Scanner(System.in);
		while (true) {
			try{
				System.out.print("请输入功能编号：");
				// 阻塞，直到用户输入回车，将回车前所有用户输入返回
				String line = sc.nextLine();
				switch (line) {
				case "1":
					System.out.println("以下是所有商品的信息：");
					List<Ware> arr = sms.findAll();
					for (Ware stu : arr) {
						System.out.println(stu);
					}
					System.out.println("共计 " + arr.size() + " 件");
					break;
				case "2":
					while (true) {
						System.out.println("请输入商品信息【name#number#date#price】或者输入【break】返回上一级");
						String stuStr = sc.nextLine();
						if (stuStr.equals("break")) {
							break;
						}
						// 1001#terry#12
						String[] stuArr = stuStr.split("#");
						String name = stuArr[0];
						int number =Integer.parseInt(stuArr[1]);
						int date = Integer.parseInt(stuArr[2]);
						double price = Double.parseDouble(stuArr[3]);
						
						Ware stu = new Ware(null, name, number, date, price);
						sms.add(stu);
						System.out.println("保存成功！");
					}

					break;
				case "3":
					while (true) {
						System.out.println("请输入要删除商品的id或者break返回上一级：");
						String idStr = sc.nextLine();
						if (idStr.equals("break")) {
							break;
						}
						long id = Long.parseLong(idStr);
						Ware stu = sms.findById(id);
						if (stu == null) {
							System.out.println("您要删除的商品不存在！");
							continue; // 结束当前循环，继续下一次循环
						}
						sms.deleteById(id);
						System.out.println("删除成功！");
					}
					break;
				case "4":
					while (true) {
						System.out.println("请输入要更改商品的id或者break返回上一级：");
						String idStr = sc.nextLine();
						if (idStr.equals("break")) {
							break;
						}
						long id = Long.parseLong(idStr);
						Ware stu = sms.findById(id);
						if (stu == null) {
							System.out.println("您要更改的商品不存在！");
							continue; // 结束当前循环，继续下一次循环
						}
						System.out.println("原有商品信息为：");
						System.out.println(stu);
						System.out.println("请输入要修改的信息【name#number#date#price】");
						String stuStr = sc.nextLine();
						String[] stuArr = stuStr.split("#");
						String name = stuArr[0];
						int number =Integer.parseInt(stuArr[1]);
						int date = Integer.parseInt(stuArr[2]);
						double price = Double.parseDouble(stuArr[3]);
						Ware ware = new Ware(id, name, number, date, price);
						sms.update(ware);
						System.out.println("修改成功");
					}
					break;
				case "5":
					while (true) {
						System.out.println("请输入要查询商品的id或者break返回上一级：");
						String idStr = sc.nextLine();
						if (idStr.equals("break")) {
							break;
						}
						long id = Long.parseLong(idStr);
						Ware stu = sms.findById(id);
						if (stu == null) {
							System.out.println("您要查询的商品不存在！");
							continue; // 结束当前循环，继续下一次循环
						}
						System.out.println(stu);
					}
					break;
				case "help":
					sms.menu();
					break;
				case "exit":
					System.out.println("bye bye!欢迎下次再访问！");
					sc.close();
					System.exit(0);
				default:
					System.out.println("输入错误！");
				}
			}catch(Exception e){
				System.out.println("输入错误！"+e.getMessage());
				continue;
			}
		}
	}
}

