package com.loginsystem.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loginsystem.service.RegisterService;
import com.loginsystem.service.impl.RegisterServiceImpl;

public class RegisterServlet extends HttpServlet {

	public RegisterServlet() {
		super();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//������������ʽ
		req.setCharacterEncoding("utf-8");
		//������Ӧ�����ʽ
		resp.setContentType("charset=utf-8");
		//��ȡ������Ϣ
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		//����������Ϣ
		RegisterService rs = new RegisterServiceImpl();
		int sign = rs.addUserService(username, password);//sign������ʶ�Ƿ���ӳɹ�
		//��Ӧ������
		if( sign==1 ){
//			System.out.println("successful");
			req.getRequestDispatcher("../ForAddSuccessfulJumping.html").forward(req, resp);
		}else{
//			System.out.println("fail");
			req.getRequestDispatcher("RegisterPageServlet").forward(req, resp);
		}
		
	}

}
