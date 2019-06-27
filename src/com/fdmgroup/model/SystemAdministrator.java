package com.fdmgroup.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SystemAdministrator")
public class SystemAdministrator extends User {

	public SystemAdministrator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SystemAdministrator(String firstName, String lastName, String email, String role,
			String photoPath, String password, int phoneNumber) {
		super(firstName, lastName, email, role, photoPath, password, phoneNumber);
		// TODO Auto-generated constructor stub
	}

}
