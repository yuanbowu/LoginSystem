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
		
		//设置请求编码格式
		req.setCharacterEncoding("utf-8");
		//设置相应编码格式
		resp.setContentType("charset=utf-8");
		//获取请求信息
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		//处理请求信息
		RegisterService rs = new RegisterServiceImpl();
		int sign = rs.addUserService(username, password);//sign用来标识是否添加成功
		//响应处理结果
		if( sign==1 ){
//			System.out.println("successful");
			req.getRequestDispatcher("../ForAddSuccessfulJumping.html").forward(req, resp);
		}else{
//			System.out.println("fail");
			req.getRequestDispatcher("RegisterPageServlet").forward(req, resp);
		}
		
	}

}
