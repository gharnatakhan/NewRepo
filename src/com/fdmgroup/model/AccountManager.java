package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
@NamedQuery(name = "accountManager.findAll", query = "SELECT a FROM AccountManager a"),
@NamedQuery(name = "accountManager.findBy", query = "SELECT u FROM User u where u.email = :uemail")
})
@DiscriminatorValue("AccountManager")
public class AccountManager extends User {

	@OneToMany(mappedBy = "accountManager")
	private List<JobPosting> jobPostings = new ArrayList<>();

	@OneToMany(mappedBy = "accountManager")
	private List<Client> clients = new ArrayList<>();

	public AccountManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountManager(String firstName, String lastName, String email,  String photoPath,
			String password, int phoneNumber) {
		super(firstName, lastName, email,  photoPath, password, phoneNumber);
		// TODO Auto-generated constructor stub
	}

	public AccountManager(List<JobPosting> jobPostings, List<Client> clients) {
		this.jobPostings = jobPostings;
		this.clients = clients;
	}

	public AccountManager(String firstName, String lastName, String email,  String photoPath,
			String password, int phoneNumber, List<JobPosting> jobPostings, List<Client> clients) {
		super(firstName, lastName, email, photoPath, password, phoneNumber);
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
		return "AccountManager [jobPostings=" + jobPostings + ", clients=" + clients + ", getUserId()=" + getUserId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getEmail()="
				+ getEmail()   + ", getPhotoPath()=" + getPhotoPath() + ", getPassword()="
				+ getPassword() + ", getPhoneNumber()=" + getPhoneNumber() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
