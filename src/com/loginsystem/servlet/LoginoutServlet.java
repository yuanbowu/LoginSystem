package com.loginsystem.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginoutServlet extends HttpServlet {


	public LoginoutServlet() {
		super();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//用来强制销毁session
		HttpSession session = req.getSession();
		session.invalidate();
		resp.sendRedirect("PageServlet");
		return;
	}

}
