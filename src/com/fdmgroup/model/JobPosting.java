package com.fdmgroup.model;


import java.time.LocalDateTime;

import java.util.List;

public class JobPosting {
	
	private int jobPostingId;
	private int numberOfPositions;
	private Client client;
	private String jobTitle;
	private String location;
	private LocalDateTime applicationDeadline;
	private String jobDescription;
	private List<Comment> comments;
	private List<Application> applications;
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
		return "JobPosting [jobPostingId=" + jobPostingId + ", numberOfPositions=" + numberOfPositions + ", client="
				+ client + ", jobTitle=" + jobTitle + ", location=" + location + ", applicationDeadline="
				+ applicationDeadline + ", jobDescription=" + jobDescription + ", comments=" + comments
				+ ", applications=" + applications + "]";
	}
	public JobPosting(int jobPostingId, int numberOfPositions, Client client, String jobTitle, String location,
			LocalDateTime applicationDeadline, String jobDescription, List<Comment> comments,
			List<Application> applications) {
		this.jobPostingId = jobPostingId;
		this.numberOfPositions = numberOfPositions;
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
	
	

}
