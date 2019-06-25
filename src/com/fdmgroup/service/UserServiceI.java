package com.fdmgroup.service;

import com.fdmgroup.model.User;

public interface UserServiceI {
	User updateProfile(User user);
	
	void viewAllJobPostings();
}
