package com.loginsystem.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.loginsystem.dao.LoginDao;
import com.loginsystem.entity.User;

public class LoginDaoImpl implements LoginDao {

	@Override
	//使用jdbc访问数据库
	public User checkUserDao(String username, String password) {
		
		//声明JDBC对象
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = null;
		try {
//			System.out.println("获取到的username为："+username);
//			System.out.println("获取到的password为："+password);
			//加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//获取连接对象
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginsystem?serverTimezone=GMT%2B8", "root", "password");
			//创建SQL语句
			String sql = "select * from user where username = ? and password = ?";
			//创建SQL语句对象
			ps = conn.prepareStatement(sql);
			//给SQL语句中的占位符赋值
			ps.setString(1, username);
			ps.setString(2, password);
			//执行
			rs = ps.executeQuery();
			//遍历执行结果
			while( rs.next() ){
				user = new User();
				user.setUid(rs.getInt("uid"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			//关闭资源
			if( rs!=null ){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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
		
		return user;
		
	}
	
}
