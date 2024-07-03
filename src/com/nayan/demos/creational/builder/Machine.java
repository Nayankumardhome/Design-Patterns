package com.nayan.demos.creational.builder;

public class Machine {

	private String type;
	private String make;
	
	public Machine() {
		// TODO Auto-generated constructor stub
	}

	public Machine(String type, String make) {
		super();
		this.type = type;
		this.make = make;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
}
