package com.nayan.demos.structural.adapter;

public class User {

	private String name;
	private String email;
	private String password;
	private Address address;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String email, String password, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "{\n\tName : " + this.name +
                "\n\tEmail : " + this.email +
                "\n\tPassword : " + this.password + 
                "\n\tAddress : " + address.toString() +
                "\n}";
	}
	
	
}
