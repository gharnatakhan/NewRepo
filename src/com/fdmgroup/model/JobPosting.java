package com.fdmgroup.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class JobPosting {
	
	private int jobPostingId;
	private Client client;
	private String jobTitle;
	private String location;
	private LocalDate applicationDeadline;
	private String jobDescription;
	private List<Comment> comments;
	private List<Application> applications;
	public int getJobPostingId() {
		return jobPostingId;
	}
	public void setJobPostingId(int jobPostingId) {
		this.jobPostingId = jobPostingId;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
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
	public LocalDate getApplicationDeadline() {
		return applicationDeadline;
	}
	public void setApplicationDeadline(LocalDate applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
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
	public JobPosting(int jobPostingId, Client client, String jobTitle, String location, LocalDate applicationDeadline,
			String jobDescription, List<Comment> comments, List<Application> applications) {
		super();
		this.jobPostingId = jobPostingId;
		this.client = client;
		this.jobTitle = jobTitle;
		this.location = location;
		this.applicationDeadline = applicationDeadline;
		this.jobDescription = jobDescription;
		this.comments = comments;
		this.applications = applications;
	}
	public JobPosting() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "JobPosting [jobPostingId=" + jobPostingId + ", jobTitle=" + jobTitle + ", location=" + location
				+ ", applicationDeadline=" + applicationDeadline + ", jobDescription=" + jobDescription + ", comments="
				+ comments + ", applications=" + applications + "]";
	}
	

}
