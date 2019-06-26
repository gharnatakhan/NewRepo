package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Client {
	@Id
	private int clientId;

	private String name;

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
