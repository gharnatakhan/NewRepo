package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
//@NamedQueries({ 
	
	@NamedQuery(name = "client.findAll", query = "SELECT c FROM Client c")
//,}
	// @NamedQuery(name = "user.findAllActive", query = "SELECT u FROM User u WHERE
	// u.active = true"),
//	@NamedQuery(name = "user.findByEmail", query = "SELECT u FROM User u where u.email = :uemail"),
	// @NamedQuery(name = "user.findAllAdmins", query = "SELECT u FROM AdminUser u
	// where TYPE(u) = AdminUser"),
//	@NamedQuery(name = "user.findByType", query = "SELECT u FROM User u where TYPE(u) = :type") })
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int clientId;

	private String name;

	public Client(String name, String location, AccountManager accountManager) {
		super();
		this.name = name;
		this.location = location;
		this.accountManager = accountManager;
	}

	private String location;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private AccountManager accountManager;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public AccountManager getAccountManager() {
		return accountManager;
	}

	public void setAccountManager(AccountManager accountManager) {
		this.accountManager = accountManager;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", name=" + name + ", location=" + location + ", accountManager="
				+ accountManager + "]";
	}

}
