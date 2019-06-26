package com.fdmgroup.model;

import java.time.LocalDateTime;

public class Application {
	
	private int applicationId;
	
	private int userId;
	
	private int jobPostingId;

	private LocalDateTime applicationTime;
	
	private String elevatorPitch;

	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Application(int applicationId, int userId, int jobPostingId, LocalDateTime applicationTime,
			String elevatorPitch) {
		this.applicationId = applicationId;
		this.userId = userId;
		this.jobPostingId = jobPostingId;
		this.applicationTime = applicationTime;
		this.elevatorPitch = elevatorPitch;
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

	public LocalDateTime getApplicationTime() {
		return applicationTime;
	}

	public void setApplicationTime(LocalDateTime applicationTime) {
		this.applicationTime = applicationTime;
	}

	public String getElevatorPitch() {
		return elevatorPitch;
	}

	public void setElevatorPitch(String elevatorPitch) {
		this.elevatorPitch = elevatorPitch;
	}

	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", userId=" + userId + ", jobPostingId=" + jobPostingId
				+ ", applicationTime=" + applicationTime + ", elevatorPitch=" + elevatorPitch + "]";
	}
	
}
