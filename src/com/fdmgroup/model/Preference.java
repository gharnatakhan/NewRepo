package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "preference.findAll", query = "SELECT p FROM Preference p")
public class Preference {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int preferenceId;
	
	private String preferenceName;
	
	private String imageURL;
	
	@ManyToMany(mappedBy="traineePreferences")
	private List<Trainee> trainees = new ArrayList<>();

	public Preference() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Preference(String preferenceName) {
		super();
		this.preferenceName = preferenceName;
	}

	public Preference(String preferenceName, List<Trainee> trainees) {
		super();
		this.preferenceName = preferenceName;
		this.trainees = trainees;
	}

	public int getPreferenceId() {
		return preferenceId;
	}

	public void setPreferenceId(int preferenceId) {
		this.preferenceId = preferenceId;
	}

	public String getPreferenceName() {
		return preferenceName;
	}

	public void setPreferenceName(String preferenceName) {
		this.preferenceName = preferenceName;
	}


	public List<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}

	@Override
	public String toString() {
		return "Preference [preferenceId=" + preferenceId + ", preferenceName=" + preferenceName + ", trainees="
				+ trainees + "]";
	}

	
}
