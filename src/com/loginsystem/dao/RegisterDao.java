package com.loginsystem.dao;

import com.loginsystem.entity.User;

public interface RegisterDao {
	User addUserDao( String username,String password );
}
