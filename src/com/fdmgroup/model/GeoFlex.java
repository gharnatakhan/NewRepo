package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class GeoFlex {
	@Id
	private int geoflexId;
	
	private String geoflexName;
	
	@ManyToMany(mappedBy="geoflex")
	private List<Trainee> trainees = new ArrayList<>();

	public GeoFlex() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GeoFlex(int geoflexId, String geoflexName, List<Trainee> trainees) {
		super();
		this.geoflexId = geoflexId;
		this.geoflexName = geoflexName;
		this.trainees = trainees;
	}

	public int getGeoflexId() {
		return geoflexId;
	}

	public void setGeoflexId(int geoflexId) {
		this.geoflexId = geoflexId;
	}

	public String getGeoflexName() {
		return geoflexName;
	}

	public void setGeoflexName(String geoflexName) {
		this.geoflexName = geoflexName;
	}

	public List<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}

	@Override
	public String toString() {
		return "GeoFlex [geoflexId=" + geoflexId + ", geoflexName=" + geoflexName + ", trainees=" + trainees + "]";
	}
	
	
	

}
