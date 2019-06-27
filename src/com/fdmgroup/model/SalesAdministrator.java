package com.fdmgroup.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SalesAdministrator")
public class SalesAdministrator extends AccountManager {

	public SalesAdministrator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesAdministrator(List<JobPosting> jobPostings, List<Client> clients) {
		super(jobPostings, clients);
		// TODO Auto-generated constructor stub
	}

	public SalesAdministrator(String firstName, String lastName, String email, String role, String photoPath,
			String password, int phoneNumber, List<JobPosting> jobPostings, List<Client> clients) {
		super(firstName, lastName, email, role, photoPath, password, phoneNumber, jobPostings, clients);
		// TODO Auto-generated constructor stub
	}

	public SalesAdministrator(String firstName, String lastName, String email, String role, String photoPath,
			String password, int phoneNumber) {
		super(firstName, lastName, email, role, photoPath, password, phoneNumber);
		// TODO Auto-generated constructor stub
	}

	

}
