package com.loginsystem.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	public RegisterServlet() {
		super();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//������������ʽ
		req.setCharacterEncoding("charset=utf-8");
		//������Ӧ�����ʽ
		resp.setContentType("utf-8");
		//��ȡ������Ϣ
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		//����������Ϣ
		
		//��Ӧ������
		
	}

}
