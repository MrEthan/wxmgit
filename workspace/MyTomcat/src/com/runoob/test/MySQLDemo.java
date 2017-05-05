
package com.runoob.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDemo {
	//JDBC �����������ݿ�URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB";
	
	//���ݿ��û���������
	static final String USER = "root";
	static final String PASS = "123456";
	
	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		
		try{
			//ע��JDBC����
			Class.forName("com.mysql.jdbc.Driver");
			//������
			System.out.println("�������ݿ�...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			//ִ�в�ѯ
			System.out.println("ʵ����Statement��...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT id, name, url FROM websites";
			ResultSet rs = stmt.executeQuery(sql);
			
			//չ��������ݼ�
			while(rs.next()){
				//ͨ���ֶμ��
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String url = rs.getString("url");
				//�������
				System.out.println(id + "-" + name + "-" + url +";\n");
			}
			//��ɺ�ر�
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se){
			//����JDBC����
			se.printStackTrace();
		}catch(Exception  e){
			// ���� Class.forName ����
            e.printStackTrace();
		}finally{
			//�ر���Դ
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
