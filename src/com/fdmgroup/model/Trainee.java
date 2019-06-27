package com.fdmgroup.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Trainee")
public class Trainee extends User {

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private Batch batch;

	private LocalDate startDate;

	private LocalDate endDate;

	private enum status {
		PREGATE, INTRAINING, SIGNEDOFF, BEACHED, OTHER
	}

	private String university;

	private String major;

	private String degreeType;

	private String location;

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Trainee_Preference")
	private List<Preference> traineePreferences = new ArrayList<>();

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Trainee_Skill")
	private List<Skill> skills = new ArrayList<>();

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Trainee_GeoFlex")
	private List<GeoFlex> geoflex = new ArrayList<>();

	@OneToMany(mappedBy = "trainee")
	private List<Application> applicationHistory = new ArrayList<>();

	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainee(String firstName, String lastName, String email, String photoPath,
			String password, int phoneNumber) {
		super(firstName, lastName, email, photoPath, password, phoneNumber);
		// TODO Auto-generated constructor stub
	}

	

	public Trainee(Batch batch, LocalDate startDate, LocalDate endDate, String university, String major,
			String degreeType, String location, List<Preference> traineePreferences, List<Skill> skills,
			List<GeoFlex> geoflex, List<Application> applicationHistory) {
		this.batch = batch;
		this.startDate = startDate;
		this.endDate = endDate;
		this.university = university;
		this.major = major;
		this.degreeType = degreeType;
		this.location = location;
		this.traineePreferences = traineePreferences;
		this.skills = skills;
		this.geoflex = geoflex;
		this.applicationHistory = applicationHistory;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getDegreeType() {
		return degreeType;
	}

	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Preference> getTraineePreferences() {
		return traineePreferences;
	}

	public void setTraineePreferences(List<Preference> traineePreferences) {
		this.traineePreferences = traineePreferences;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public List<GeoFlex> getGeoflex() {
		return geoflex;
	}

	public void setGeoflex(List<GeoFlex> geoflex) {
		this.geoflex = geoflex;
	}

	public List<Application> getApplicationHistory() {
		return applicationHistory;
	}

	public void setApplicationHistory(List<Application> applicationHistory) {
		this.applicationHistory = applicationHistory;
	}

	@Override
	public String toString() {
		return "Trainee [batch=" + batch + ", startDate=" + startDate + ", endDate=" + endDate + ", university="
				+ university + ", major=" + major + ", degreeType=" + degreeType + ", location=" + location
				+ ", traineePreferences=" + traineePreferences + ", skills=" + skills + ", geoflex=" + geoflex
				+ ", applicationHistory=" + applicationHistory + "]";
	}

	
}
