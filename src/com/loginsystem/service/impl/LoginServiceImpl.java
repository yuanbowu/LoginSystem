package com.loginsystem.service.impl;

import com.loginsystem.dao.LoginDao;
import com.loginsystem.dao.impl.LoginDaoImpl;
import com.loginsystem.entity.User;
import com.loginsystem.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Override
	public User checkUserService(String username, String password) {
		//功能性的代码
		LoginDao ld = new LoginDaoImpl();
		
		return ld.checkUserDao(username, password);
	}
	
}
