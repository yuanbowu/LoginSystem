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
		
		//首先设置编码格式
		resp.setContentType("charset=utf8");
		//获取用户数据
		String username = req.getParameter("username");
		String password = req.getParameter("password");
//		System.out.println(username+password);
		//处理请求信息
			//获取对应的业务层对象
			LoginService loginservice = new LoginServiceImpl();
			User user = loginservice.checkUserService(username, password);
//			System.out.println(user);
		//根据判断结果再进行跳转
		
	}
	
}
