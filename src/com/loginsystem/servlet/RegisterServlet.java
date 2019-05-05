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
		
		//设置请求编码格式
		req.setCharacterEncoding("charset=utf-8");
		//设置相应编码格式
		resp.setContentType("utf-8");
		//获取请求信息
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		//处理请求信息
		
		//响应处理结果
		
	}

}
