package com.fdmgroup.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdmgroup.dao.UserDao;
import com.fdmgroup.model.AccountManager;

import com.fdmgroup.model.Trainee;

public class TestingApp {

	public static void main(String[] args) {
		
		
		UserDao userDao = new UserDao();
		
		
		
		Trainee trainee = new Trainee("trainee", "lastname", "@", "kys", "path", "pwd");
		
		
		AccountManager accountmanager = new AccountManager("firstname", "last", "email", "ee", "path", "pwd");
		userDao.create(trainee);
		userDao.create(accountmanager);
		System.out.println("Data stored");
		
	
	
	}
	
}

