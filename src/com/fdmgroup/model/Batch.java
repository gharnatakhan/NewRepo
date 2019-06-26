package com.fdmgroup.model;

import java.util.List;

public class Batch {
	private int batchId;
	
	private enum stream
	{ 
	   JAVA,
	   TESTING,
	   DEVOPS,
	   ITSM 
	} 
	
	private String location;
	
	private int batchSize;
	
	private List<Trainee> trainee;
	
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
	
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Batch(int batchId, String location, int batchSize, List<Trainee> trainee) {
		super();
		this.batchId = batchId;
		this.location = location;
		this.batchSize = batchSize;
		this.trainee = trainee;
	}
	
	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", location=" + location + ", batchSize=" + batchSize + "]";
	}
	
	
}