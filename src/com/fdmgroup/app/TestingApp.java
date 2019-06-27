package com.fdmgroup.app;

import java.time.LocalDate;

import com.fdmgroup.dao.UserDao;
import com.fdmgroup.model.AccountManager;
import com.fdmgroup.model.Batch;
import com.fdmgroup.model.GeoFlex;
import com.fdmgroup.model.Trainee;

public class TestingApp {

	public static void main(String[] args) {

		UserDao userDao = new UserDao();

		Batch batch = new Batch();
		GeoFlex gf = new GeoFlex();
		LocalDate endDate = LocalDate.now();
		LocalDate startDate = LocalDate.now();
		Trainee trainee = new Trainee("d", "lastName", "email", "role", "photoPath", "password",111);

		userDao.create(trainee);
		System.out.println("Data stored");

	}

}
