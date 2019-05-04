package com.loginsystem.service;

import com.loginsystem.entity.User;

public interface LoginService {
	User checkUserService( String username,String password );
}
