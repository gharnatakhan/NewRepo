package com.fdmgroup.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "application.findAll", query = "SELECT a FROM Application a")
public class Application {

	@Id
	private int applicationId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private Trainee trainee;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "jobPostingId")
	private JobPosting jobPosting;

	private LocalDateTime applicationTime;

	private String elevatorPitch;

	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Application(int applicationId, Trainee trainee, JobPosting jobPosting, LocalDateTime applicationTime,
			String elevatorPitch) {
		this.applicationId = applicationId;
		this.trainee = trainee;
		this.jobPosting = jobPosting;
		this.applicationTime = applicationTime;
		this.elevatorPitch = elevatorPitch;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

	public JobPosting getJobPosting() {
		return jobPosting;
	}

	public void setJobPosting(JobPosting jobPosting) {
		this.jobPosting = jobPosting;
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
		return "Application [applicationId=" + applicationId + ", trainee=" + trainee + ", jobPosting=" + jobPosting
				+ ", applicationTime=" + applicationTime + ", elevatorPitch=" + elevatorPitch + "]";
	}

	public Application(Trainee trainee, JobPosting jobPosting, String elevatorPitch) {
		super();
		this.trainee = trainee;
		this.jobPosting = jobPosting;
		this.applicationTime = LocalDateTime.now();
		this.elevatorPitch = elevatorPitch;
	}
	

}
