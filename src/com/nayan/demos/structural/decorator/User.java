package com.nayan.demos.structural.decorator;

public class User {

	private String username;
	private String emailId;
	private long phoneNbr;

	public User() {
		// Default constructor
	}

	public User(String username, String emailId, long phoneNbr) {
		this.username = username;
		this.emailId = emailId;
		this.phoneNbr = phoneNbr;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNbr() {
		return phoneNbr;
	}

	public void setPhoneNbr(long phoneNbr) {
		this.phoneNbr = phoneNbr;
	}
}