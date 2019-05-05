package com.loginsystem.dao.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loginsystem.dao.RegisterDao;
import com.loginsystem.entity.User;

public class RegisterDaoImpl implements RegisterDao {


	@Override
	public int addUserDao(String username, String password) {
		
		//声明JDBC对象
		Connection conn = null;
		PreparedStatement ps = null;
		int rs = 0;
		User user = null;
		try {
//			System.out.println("获取到的username为："+username);
//			System.out.println("获取到的password为："+password);
			//加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//获取连接对象
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginsystem?serverTimezone=GMT%2B8", "root", "password");
			//创建SQL语句
			String sql = "INSERT INTO user (uid,username,password) VALUES (100,?,?) ";

			//创建SQL语句对象
			ps = conn.prepareStatement(sql);
			//给SQL语句中的占位符赋值
			ps.setString(1, username);
			ps.setString(2, password);
			//执行
			rs = ps.executeUpdate(sql);
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			//关闭资源
			if( ps!=null ){
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if( conn!=null ){
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}		
		
		return rs;
	}
	

}
