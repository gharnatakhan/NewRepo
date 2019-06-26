package com.fdmgroup.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Trainee")
public class Trainee extends User {
	private Batch batch;

	private LocalDate startDate;

	private LocalDate endDate;

	private enum status {
		PREGATE, INTRAINING, SIGNEDOFF, BEACHED, OTHER
	}

	private List<String> traineePreferences = new ArrayList<>();

	public List<String> getTraineePreferences() {
		return traineePreferences;
	}

	public void setTraineePreferences(List<String> traineePreferences) {
		this.traineePreferences = traineePreferences;
	}

	private List<String> skills = new ArrayList<>();

	private String degree;

	private String degreeName;

	private String degreeType;

	private String location;

	private List<String> geoflex = new ArrayList<>();

	private int phoneNumber;

	public Trainee(String firstName, String lastName, String email, String role, String photoPath, String password,
			Batch batch, LocalDate startDate, LocalDate endDate, List<String> skills, String degree, String degreeName,
			String degreeType, String location, List<String> geoflex, int phoneNumber) {
		super(firstName, lastName, email, role, photoPath, password);
		this.batch = batch;
		this.startDate = startDate;
		this.endDate = endDate;
		this.skills = skills;
		this.degree = degree;
		this.degreeName = degreeName;
		this.degreeType = degreeType;
		this.location = location;
		this.geoflex = geoflex;
		this.phoneNumber = phoneNumber;
	}

	public Trainee(String firstName, String lastName, String email, String role, String photoPath, String password,
			Batch batch, LocalDate startDate, LocalDate endDate, List<String> traineePreferences, List<String> skills,
			String degree, String degreeName, String degreeType, String location, List<String> geoflex,
			int phoneNumber) {
		super(firstName, lastName, email, role, photoPath, password);
		this.batch = batch;
		this.startDate = startDate;
		this.endDate = endDate;
		this.traineePreferences = traineePreferences;
		this.skills = skills;
		this.degree = degree;
		this.degreeName = degreeName;
		this.degreeType = degreeType;
		this.location = location;
		this.geoflex = geoflex;
		this.phoneNumber = phoneNumber;
	}

	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainee(String firstName, String lastName, String email, String role, String photoPath, String password) {
		super(firstName, lastName, email, role, photoPath, password);
		// TODO Auto-generated constructor stub
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

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
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

	public List<String> getGeoflex() {
		return geoflex;
	}

	public void setGeoflex(List<String> geoflex) {
		this.geoflex = geoflex;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Trainee [batch=" + batch + ", startDate=" + startDate + ", endDate=" + endDate + ", skills=" + skills
				+ ", degree=" + degree + ", degreeName=" + degreeName + ", degreeType=" + degreeType + ", location="
				+ location + ", geoflex=" + geoflex + ", phoneNumber=" + phoneNumber + "]";
	}

}
