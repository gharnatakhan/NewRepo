package com.fdmgroup.model;

public class Client {
	private int clientId;
	
	private String name;
	
	private String location;

	public Client(int clientId, String name, String location) {
		this.clientId = clientId;
		this.name = name;
		this.location = location;
	}

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

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", name=" + name + ", location=" + location + "]";
	}
	
}
