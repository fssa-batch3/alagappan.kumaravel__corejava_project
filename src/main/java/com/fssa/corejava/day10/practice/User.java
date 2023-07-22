package com.fssa.corejava.day10.practice;

class User {
	int id;
	String name;
	String emailId;
	
	public User(String name, String emailId, int id) {
		this.name = name;
		this.emailId = emailId;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
