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

	public enum allStreams {
		JAVA, TESTING, DEVOPS, ITSM
	}

	private String stream;

	private String location;

	private int batchSize;

	@OneToMany(mappedBy = "batch")
	private List<Trainee> trainee = new ArrayList<>();

	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batch(int batchId, String stream, String location, int batchSize, List<Trainee> trainee) {
		super();
		this.batchId = batchId;
		this.stream = stream;
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

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
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
		return "Batch [batchId=" + batchId + ", stream=" + stream + ", location=" + location + ", batchSize="
				+ batchSize + ", trainee=" + trainee + "]";
	}

}
