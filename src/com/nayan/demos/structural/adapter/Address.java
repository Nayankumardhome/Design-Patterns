package com.nayan.demos.structural.adapter;

public class Address {

	private String lineOne;
	private String city;
	private int pincode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String lineOne, String city, int pincode) {
		super();
		this.lineOne = lineOne;
		this.city = city;
		this.pincode = pincode;
	}

	public String getLineOne() {
		return lineOne;
	}

	public void setLineOne(String lineOne) {
		this.lineOne = lineOne;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "\t{\n\t\tLine 1 : " + this.lineOne +
                "\n\t\tCity : " + this.city +
                "\n\t\tPinCode : " + this.pincode +
                "\n\t}";
	}
}
