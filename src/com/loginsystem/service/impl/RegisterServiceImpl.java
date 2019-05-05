package com.loginsystem.service.impl;

import javax.servlet.http.HttpServlet;

import com.loginsystem.dao.RegisterDao;
import com.loginsystem.dao.impl.RegisterDaoImpl;
import com.loginsystem.entity.User;
import com.loginsystem.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {


	@Override
	public int addUserService(String username, String password) {
		
		RegisterDao rd = new RegisterDaoImpl();
		
		return rd.addUserDao(username, password);
	}
	
	

}
