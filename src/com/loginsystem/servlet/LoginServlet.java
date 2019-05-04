package com.loginsystem.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loginsystem.entity.User;
import com.loginsystem.service.LoginService;
import com.loginsystem.service.impl.LoginServiceImpl;

public class LoginServlet extends HttpServlet {

	public LoginServlet() {
		super();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//�������ñ����ʽ
		resp.setContentType("charset=utf8");
		//��ȡ�û�����
		String username = req.getParameter("username");
		String password = req.getParameter("password");
//		System.out.println(username+password);
		//����������Ϣ
			//��ȡ��Ӧ��ҵ������
			LoginService loginservice = new LoginServiceImpl();
			User user = loginservice.checkUserService(username, password);
//			System.out.println(user);
		//�����жϽ���ٽ�����ת
		
	}
	
}
