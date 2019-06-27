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
		Trainee trainee = new Trainee("d", "lastName", "email", "role", "photoPath", "password",111);
		
		AccountManager accountManager = new AccountManager( "firstName", "lastName", "email", "role", "photoPath", "password", 123);
		Client client1 = new Client("RBC Bank", "Toronto", accountManager); 
		Preference p1 = new Preference("ITSM");
		Preference p2 = new Preference("testing");
		List<Preference> preferences = new ArrayList<>();
		preferences.add(p1);
		preferences.add(p2);
		
		
		
		
		
		LocalDateTime applicationDeadline = LocalDateTime.now();
		JobPosting jobPosting = new JobPosting(1, 3, accountManager, "software dev", "toronto", applicationDeadline , "jobDescription", preferences);
		List<JobPosting> jobPostings = new ArrayList<>();
		List<Trainee> trainees = new ArrayList<>();
		trainees.add(trainee);
		jobPostings.add(jobPosting);
		p1.setJobPostings(jobPostings);
		p2.setJobPostings(jobPostings);
		p1.setTrainees(trainees);
		p2.setTrainees(trainees);
		
//		userDao.create(trainee);
//		userDao.create(accountManager);
//		clientDao.create(client1);
		pdao.create(p1);
		pdao.create(p2);
//		jdao.create(jobPosting);
		System.out.println("\nData stored");

	}

}
