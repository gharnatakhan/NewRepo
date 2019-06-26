package com.fdmgroup.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * @author Hang.Wang
 *
 */
@Entity
@NamedQueries({ @NamedQuery(name = "jobPosting.findAll", query = "SELECT j FROM JobPosting j"),
		// @NamedQuery(name = "user.findAllActive", query = "SELECT u FROM User u WHERE
		// u.active = true"),
		// @NamedQuery(name = "user.findByEmail", query = "SELECT u FROM User u where
		// u.email = :uemail"),
		// @NamedQuery(name = "user.findAllAdmins", query = "SELECT u FROM AdminUser u
		// where TYPE(u) = AdminUser"),
		// @NamedQuery(name = "user.findByType", query = "SELECT u FROM User u where
		// TYPE(u) = :type")
})
public class JobPosting {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int jobPostingId;

	private int numberOfPositions;

	private int clientId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "jobPostingId", insertable=false, updatable=false)
	private AccountManager accountManager;

	private String jobTitle;

	private String location;

	private LocalDateTime applicationDeadline;

	private String jobDescription;

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="JobPosting_Preferences")
	private List<Preference> wantedPreferences = new ArrayList<>();
	
	@OneToMany(mappedBy = "jobPosting")
	private List<Comment> comments = new ArrayList<>();

	@OneToMany(mappedBy = "jobPosting")
	private List<Application> applications = new ArrayList<>();

	public JobPosting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobPosting(int numberOfPositions, int clientId, AccountManager accountManager,
			String jobTitle, String location, LocalDateTime applicationDeadline, String jobDescription,
			List<Preference> wantedPreferences, List<Comment> comments, List<Application> applications) {
		this.numberOfPositions = numberOfPositions;
		this.clientId = clientId;
		this.accountManager = accountManager;
		this.jobTitle = jobTitle;
		this.location = location;
		this.applicationDeadline = applicationDeadline;
		this.jobDescription = jobDescription;
		this.wantedPreferences = wantedPreferences;
		this.comments = comments;
		this.applications = applications;
	}

	public int getJobPostingId() {
		return jobPostingId;
	}

	public void setJobPostingId(int jobPostingId) {
		this.jobPostingId = jobPostingId;
	}

	public int getNumberOfPositions() {
		return numberOfPositions;
	}

	public void setNumberOfPositions(int numberOfPositions) {
		this.numberOfPositions = numberOfPositions;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public AccountManager getAccountManager() {
		return accountManager;
	}

	public void setAccountManager(AccountManager accountManager) {
		this.accountManager = accountManager;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDateTime getApplicationDeadline() {
		return applicationDeadline;
	}

	public void setApplicationDeadline(LocalDateTime applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public List<Preference> getWantedPreferences() {
		return wantedPreferences;
	}

	public void setWantedPreferences(List<Preference> wantedPreferences) {
		this.wantedPreferences = wantedPreferences;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	@Override
	public String toString() {
		return "JobPosting [jobPostingId=" + jobPostingId + ", numberOfPositions=" + numberOfPositions + ", clientId="
				+ clientId + ", accountManager=" + accountManager + ", jobTitle=" + jobTitle + ", location=" + location
				+ ", applicationDeadline=" + applicationDeadline + ", jobDescription=" + jobDescription
				+ ", wantedPreferences=" + wantedPreferences + ", comments=" + comments + ", applications="
				+ applications + "]";
	}

}