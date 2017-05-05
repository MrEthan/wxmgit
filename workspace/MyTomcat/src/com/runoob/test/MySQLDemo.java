
package com.runoob.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDemo {
	//JDBC 驱动名及数据库URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB";
	
	//数据库用户名与密码
	static final String USER = "root";
	static final String PASS = "123456";
	
	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		
		try{
			//注册JDBC驱动
			Class.forName("com.mysql.jdbc.Driver");
			//打开链接
			System.out.println("连接数据库...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			//执行查询
			System.out.println("实例化Statement对...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT id, name, url FROM websites";
			ResultSet rs = stmt.executeQuery(sql);
			
			//展开结果数据集
			while(rs.next()){
				//通过字段检查
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String url = rs.getString("url");
				//输出数据
				System.out.println(id + "-" + name + "-" + url +";\n");
			}
			//完成后关闭
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se){
			//处理JDBC错误
			se.printStackTrace();
		}catch(Exception  e){
			// 处理 Class.forName 错误
            e.printStackTrace();
		}finally{
			//关闭资源
			try{
				if(stmt != null)
					stmt.close();
			}catch(SQLException se2){
				//do nothing
			}
			try{
				if(conn != null) 
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("GoodBye!");
	}
}
