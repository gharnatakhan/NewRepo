package com.fdmgroup.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AccountManager")
public class AccountManager extends User{
	
	/*private List<JobPosting> jobPostings;*/

	public AccountManager(String firstName, String lastName, String email, String role, String photoPath,
			String password, List<JobPosting> jobPostings) {
		super(firstName, lastName, email, role, photoPath, password);
	/*	this.jobPostings = jobPostings;*/
	}

	public AccountManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountManager( String firstName, String lastName, String email, String role, String photoPath,
			String password) {
		super( firstName, lastName, email, role, photoPath, password);
		// TODO Auto-generated constructor stub
	}
/*
	public List<JobPosting> getJobPostings() {
		return jobPostings;
	}

	public void setJobPostings(List<JobPosting> jobPostings) {
		this.jobPostings = jobPostings;
	}

	@Override
	public String toString() {
		return "AccountManager [jobPostings=" + jobPostings + "]";
	}*/
	
}
