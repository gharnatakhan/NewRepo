package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AccountManager")
public class AccountManager extends User{
	
	private List<JobPosting> jobPostings = new ArrayList<>();
	
	private List<Client> clients = new ArrayList<>();

	public AccountManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountManager(String firstName, String lastName, String email, String role, String photoPath,
			String password) {
		super(firstName, lastName, email, role, photoPath, password);
		// TODO Auto-generated constructor stub
	}

	public AccountManager(String firstName, String lastName, String email, String role, String photoPath,
			String password, List<JobPosting> jobPostings, List<Client> clients) {
		super(firstName, lastName, email, role, photoPath, password);
		this.jobPostings = jobPostings;
		this.clients = clients;
	}

	public List<JobPosting> getJobPostings() {
		return jobPostings;
	}

	public void setJobPostings(List<JobPosting> jobPostings) {
		this.jobPostings = jobPostings;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	@Override
	public String toString() {
		return "AccountManager [jobPostings=" + jobPostings + ", clients=" + clients + "]";
	}

	
}
