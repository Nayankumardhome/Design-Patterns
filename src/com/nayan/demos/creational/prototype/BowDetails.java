package com.nayan.demos.creational.prototype;

public class BowDetails {

	private String material;
    private double stringLength;
    
    public BowDetails() {
		// TODO Auto-generated constructor stub
	}

	public BowDetails(String material, double stringLength) {
		super();
		this.material = material;
		this.stringLength = stringLength;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getStringLength() {
		return stringLength;
	}

	public void setStringLength(double stringLength) {
		this.stringLength = stringLength;
	}
    
}
