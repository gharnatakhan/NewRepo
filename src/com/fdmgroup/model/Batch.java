package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Batch {
	@Id
	private int batchId;

	private enum stream {
		JAVA, TESTING, DEVOPS, ITSM
	}

	private String location;

	private int batchSize;

	@OneToMany(mappedBy = "batch")
	private List<Trainee> trainee = new ArrayList<>();

	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batch(int batchId, String location, int batchSize, List<Trainee> trainee) {
		this.batchId = batchId;
		this.location = location;
		this.batchSize = batchSize;
		this.trainee = trainee;
	}

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}

	public List<Trainee> getTrainee() {
		return trainee;
	}

	public void setTrainee(List<Trainee> trainee) {
		this.trainee = trainee;
	}

	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", location=" + location + ", batchSize=" + batchSize + ", trainee="
				+ trainee + "]";
	}

}
