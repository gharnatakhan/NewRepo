package com.fdmgroup.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.dao.*;
import com.fdmgroup.model.*;
import com.fdmgroup.model.Batch.allStreams;


public class HangTestingApp {
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		PreferenceDao pdao = new PreferenceDao();
		GeoFlexDao gfdao = new GeoFlexDao();
		JobPostingDao jpdao = new JobPostingDao();
		ClientDao cdao = new ClientDao();
		ApplicationDao adao = new ApplicationDao();
		AccountManagerDao amdao = new AccountManagerDao();
		BatchDao bdao = new BatchDao();
		LocalDate endDate = LocalDate.now();
		LocalDate startDate = LocalDate.now();
		
		List<Trainee> trainees = new ArrayList<>();
		List<Application> applications = new ArrayList<>();
		List<Preference> preferences = new ArrayList<>();
		List<GeoFlex> geoflexes = new ArrayList<>();
		List<JobPosting> jobPostings = new ArrayList<>();
		List<Client> clients = new ArrayList<>();
		


		AccountManager am1 = new AccountManager("Nick", "Wang", "idddd", "ddd", "12345", 123455, jobPostings, clients);
		
		
		Client c1 = new Client("RBC", "TRT", am1);
				
		Preference p1 = new Preference("DEV", trainees);
		Preference p2 = new Preference("ITSM", trainees);
		preferences.add(p1);
		preferences.add(p2);
		GeoFlex gf1 = new GeoFlex(1, "Toronto", trainees);
		GeoFlex gf2 = new GeoFlex(2,"Vancouver",trainees);
		geoflexes.add(gf1);
		geoflexes.add(gf2);
		JobPosting jp1 = new JobPosting(4, 2, am1, "Developer", gf1, LocalDateTime.now(), "dont apply", preferences);
		jobPostings.add(jp1);
		
		Batch b1 = new Batch(0, allStreams.ITSM.name(), "Danforth", 12, trainees);
		Trainee t1 = new Trainee("Hang", "Hang", "hang.wang@fdmgroup.mail", "null", "123", 111, b1, startDate, endDate, "McGill", "MEng", "bachelor", "Zhengzhou", preferences, geoflexes, applications);
		Trainee t2 = new Trainee("Molham", "Kaadan", "idk", "nude", "111", 112, b1, startDate, endDate, "US", "Cs", "bachelor", "Missisipi", preferences, geoflexes, applications);
		trainees.add(t1);
		trainees.add(t2);

		userDao.create(t1);
		userDao.create(t2);
		userDao.create(am1);
		
		pdao.create(p1);
		pdao.create(p2);
		
		cdao.create(c1);
		
		gfdao.create(gf1);
		gfdao.create(gf2);
		
//		jpdao.create(jp1);
		
		
		
		
	}
}
