package com.fdmgroup.service;

import com.fdmgroup.model.User;

public interface SystemAdminServiceI extends UserServiceI{
	
	User createUser(User user);
	
	boolean disableUser(User user);
}
