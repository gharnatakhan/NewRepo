package com.fdmgroup.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.dao.ClientDao;
import com.fdmgroup.dao.JobPostingDao;
import com.fdmgroup.dao.PreferenceDao;
import com.fdmgroup.dao.UserDao;
import com.fdmgroup.model.AccountManager;
import com.fdmgroup.model.Batch;
import com.fdmgroup.model.Client;
import com.fdmgroup.model.GeoFlex;
import com.fdmgroup.model.JobPosting;
import com.fdmgroup.model.Preference;
import com.fdmgroup.model.SalesAdministrator;
import com.fdmgroup.model.SystemAdministrator;
import com.fdmgroup.model.Trainee;

public class TestingApp {

	public static void main(String[] args) {

		UserDao userDao = new UserDao();
		ClientDao clientDao = new ClientDao();
		JobPostingDao jdao = new JobPostingDao();
		PreferenceDao pdao = new PreferenceDao(); 

		Batch batch = new Batch();
		GeoFlex gf = new GeoFlex();
		LocalDate endDate = LocalDate.now();
		LocalDate startDate = LocalDate.now();
<<<<<<< HEAD
		Trainee trainee1 = new Trainee("d", "lastName", "email", "Trainee", "photoPath", "password",111);
		Trainee trainee2 = new Trainee("d", "lastName", "email", "Trainee", "photoPath", "password",111);
		Trainee trainee3 = new Trainee("d", "lastName", "email", "Trainee", "photoPath", "password",111);
		Trainee trainee4 = new Trainee("d", "lastName", "email", "Trainee", "photoPath", "password",111);
=======
		Trainee trainee = new Trainee("d", "lastName", "email@fdm.com", "role", "photoPath", "password",111);
>>>>>>> master
		
		AccountManager accountManager1 = new AccountManager( "firstName", "lastName", "email", "AccountManager", "photoPath", "password", 123);
		AccountManager accountManager2 = new AccountManager( "firstName", "lastName", "email", "AccountManager", "photoPath", "password", 123);
		AccountManager accountManager3 = new AccountManager( "firstName", "lastName", "email", "AccountManager", "photoPath", "password", 123);
		
		SalesAdministrator salesadmin = new SalesAdministrator("firstName", "lastName", "email", "SalesAdministrator", "photoPath", "password", 123);
		SystemAdministrator sysadmin = new SystemAdministrator("firstName", "lastName", "email", "SystemAdministrator", "photoPath", "password", 123);
		
		
		
		Client client1 = new Client("RBC Bank", "Toronto", accountManager1); 
		Preference p1 = new Preference("ITSM");
		Preference p2 = new Preference("testing");
		List<Preference> preferences = new ArrayList<>();
		preferences.add(p1);
		preferences.add(p2);
		
		
		
		
		
		LocalDateTime applicationDeadline = LocalDateTime.now();
		JobPosting jobPosting = new JobPosting(1, 3, accountManager1, "software dev", "toronto", applicationDeadline , "jobDescription", preferences);
		List<JobPosting> jobPostings = new ArrayList<>();
		List<Trainee> trainees = new ArrayList<>();
		trainees.add(trainee1);
		jobPostings.add(jobPosting);
		p1.setJobPostings(jobPostings);
		p2.setJobPostings(jobPostings);
		p1.setTrainees(trainees);
		p2.setTrainees(trainees);
		
<<<<<<< HEAD
		userDao.create(trainee1);
		userDao.create(trainee2);
		userDao.create(trainee3);
		userDao.create(trainee4);
		userDao.create(accountManager1);
		userDao.create(accountManager2);
		userDao.create(accountManager3);
		userDao.create(salesadmin);
		userDao.create(sysadmin);
		
		
=======
		userDao.create(trainee);
		userDao.create(accountManager);
>>>>>>> master
//		clientDao.create(client1);
//		pdao.create(p1);
//		pdao.create(p2);
//		jdao.create(jobPosting);
		System.out.println("\nData stored");

	}

}
