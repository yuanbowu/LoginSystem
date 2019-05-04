package com.loginsystem.dao;

import com.loginsystem.entity.User;

public interface LoginDao {
	User checkUserDao( String username,String password );
}
