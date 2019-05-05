package com.loginsystem.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loginsystem.entity.User;

public class MainFunctionServlet extends HttpServlet {

	public MainFunctionServlet() {
		super();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		resp.setContentType("text/html;charset=utf-8");
		User user = (User) req.getSession().getAttribute("user");
		
		
//		resp.getWriter().write(user.getUsername());
		
		req.getRequestDispatcher("../MainFunctionPage.jsp").forward(req, resp);
	}

}
