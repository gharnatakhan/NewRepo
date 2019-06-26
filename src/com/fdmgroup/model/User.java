package com.fdmgroup.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "CAULDRON_USER")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="user_type",discriminatorType=DiscriminatorType.STRING)
@NamedQueries({
	@NamedQuery(name = "user.findAll", query = "SELECT u FROM User u"),
//	@NamedQuery(name = "user.findAllActive", query = "SELECT u FROM User u WHERE u.active = true"),
	@NamedQuery(name = "user.findByEmail", query = "SELECT u FROM User u where u.email = :uemail"),
//	@NamedQuery(name = "user.findAllAdmins", query = "SELECT u FROM AdminUser u where TYPE(u) = AdminUser"),
	@NamedQuery(name = "user.findByType", query = "SELECT u FROM User u where TYPE(u) = :type")
})
public class User {
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String role;
	
	private String photoPath;
	
	private String password;


	public User(String firstName, String lastName, String email, String role, String photoPath,
			String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
		this.photoPath = photoPath;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", role=" + role + ", photoPath=" + photoPath + ", password=" + password + "]";
	}

}
