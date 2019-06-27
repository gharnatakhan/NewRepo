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

		Preference p1 = new Preference("DEV", trainees);
		Preference p2 = new Preference("ITSM", trainees);
		
		Batch b1 = new Batch(0, allStreams.ITSM.name(), "Danforth", 12, trainees);
		Trainee t1 = new Trainee("Hang", "Hang", "hang.wang@fdmgroup.mail", "null", "123", 111, b1, startDate, endDate, "McGill", "MEng", "bachelor", "Zhengzhou", new Preference("DEV",trainees), new GeoFlex(1,"Montreal",trainees), applications);
		Trainee t2 = new Trainee("Molham", "Kaadan", "idk", "nude", "111", 112, b1, startDate, endDate, "US", "Cs", "bachelor", "Missisipi", new Preference("Mainframe",trainees), new GeoFlex(2,"Vancouver",trainees), applications);
		trainees.add(t1);
		trainees.add(t2);
		
		Batch b1 = new Batch(0, allStreams.ITSM.name(), "Danforth", 12, trainees);
		
	}
}
