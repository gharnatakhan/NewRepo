package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;

public class Preference {
	private List<String> allPreferences = new ArrayList<String>();

	public Preference() {
		super();
		allPreferences.add("SOFTWARE_DEVELOPER");
		allPreferences.add("ITSM");
		allPreferences.add("DEVOPS");
		allPreferences.add("INFORMATION_SECURITY");
		allPreferences.add("QA_TESTING");
		allPreferences.add("DATA_ENGINEER");
		allPreferences.add("RISK_REGULATION");
		allPreferences.add("MOBILE_DEVELOPER");
		// TODO Auto-generated constructor stub
	}

	public List<String> getAllPreferences() {
		return allPreferences;
	}

	public void setAllPreferences(List<String> allPreferences) {
		this.allPreferences = allPreferences;
	}
	
	
}
