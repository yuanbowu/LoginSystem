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
		
		//����JDBC����
		Connection conn = null;
		PreparedStatement ps = null;
		int rs = 0;
		User user = null;
		try {
//			System.out.println("��ȡ����usernameΪ��"+username);
//			System.out.println("��ȡ����passwordΪ��"+password);
			//��������
			Class.forName("com.mysql.cj.jdbc.Driver");
			//��ȡ���Ӷ���
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginsystem?serverTimezone=GMT%2B8", "root", "password");
			//����SQL���
			String sql = "INSERT INTO user (uid,username,password) VALUES (100,?,?) ";

			//����SQL������
			ps = conn.prepareStatement(sql);
			//��SQL����е�ռλ����ֵ
			ps.setString(1, username);
			ps.setString(2, password);
			//ִ��
			rs = ps.executeUpdate(sql);
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			//�ر���Դ
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
