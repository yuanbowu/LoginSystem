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
	//ʹ��jdbc�������ݿ�
	public User checkUserDao(String username, String password) {
		
		//����JDBC����
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = null;
		try {
//			System.out.println("��ȡ����usernameΪ��"+username);
//			System.out.println("��ȡ����passwordΪ��"+password);
			//��������
			Class.forName("com.mysql.cj.jdbc.Driver");
			//��ȡ���Ӷ���
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginsystem?serverTimezone=GMT%2B8", "root", "password");
			//����SQL���
			String sql = "select * from user where username = ? and password = ?";
			//����SQL������
			ps = conn.prepareStatement(sql);
			//��SQL����е�ռλ����ֵ
			ps.setString(1, username);
			ps.setString(2, password);
			//ִ��
			rs = ps.executeQuery();
			//����ִ�н��
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
			//�ر���Դ
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
