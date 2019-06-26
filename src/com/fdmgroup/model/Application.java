package com.fdmgroup.model;

public class Application {
	
	private int applicationId;
	
	private int userId;
	
	private int jobPostingId;
	
	private String elevatorPitch;
	
	public Application(int applicationId, int userId, int jobPostingId, String elevatorPitch) {
		super();
		this.applicationId = applicationId;
		this.userId = userId;
		this.jobPostingId = jobPostingId;
		this.elevatorPitch = elevatorPitch;
	}
	
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", userId=" + userId + ", jobPostingId=" + jobPostingId
				+ ", elevatorPitch=" + elevatorPitch + "]";
	}
	
	public int getApplicationId() {
		return applicationId;
	}
	
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getJobPostingId() {
		return jobPostingId;
	}
	
	public void setJobPostingId(int jobPostingId) {
		this.jobPostingId = jobPostingId;
	}
	
	public String getElevatorPitch() {
		return elevatorPitch;
	}
	
	public void setElevatorPitch(String elevatorPitch) {
		this.elevatorPitch = elevatorPitch;
	}

}
