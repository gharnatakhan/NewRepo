package com.fdmgroup.model;

import java.util.List;

public class AccountManager extends User{
	
	private List<JobPosting> jobPostings;

	public AccountManager(int userId, String firstName, String lastName, String email, String role, String photoPath,
			String password, List<JobPosting> jobPostings) {
		super(userId, firstName, lastName, email, role, photoPath, password);
		this.jobPostings = jobPostings;
	}

	public AccountManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountManager(int userId, String firstName, String lastName, String email, String role, String photoPath,
			String password) {
		super(userId, firstName, lastName, email, role, photoPath, password);
		// TODO Auto-generated constructor stub
	}

	public List<JobPosting> getJobPostings() {
		return jobPostings;
	}

	public void setJobPostings(List<JobPosting> jobPostings) {
		this.jobPostings = jobPostings;
	}

	@Override
	public String toString() {
		return "AccountManager [jobPostings=" + jobPostings + "]";
	}
	
}
