package com.fdmgroup.service;

import com.fdmgroup.model.User;

public interface LoginServiceI {
	User login(String username, String password);
}
