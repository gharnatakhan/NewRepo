package com.fdmgroup.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SalesAdministrator")
public class SalesAdministrator extends User {

	public SalesAdministrator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesAdministrator(int userId, String firstName, String lastName, String email, String role,
			String photoPath, String password, int phoneNumber) {
		super(userId, firstName, lastName, email, role, photoPath, password, phoneNumber);
		// TODO Auto-generated constructor stub
	}

}
