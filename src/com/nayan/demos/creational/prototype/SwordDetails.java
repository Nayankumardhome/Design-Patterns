package com.nayan.demos.creational.prototype;

public class SwordDetails {

	private String origin;
    private double weight;
    
    public SwordDetails() {
		// TODO Auto-generated constructor stub
	}

	public SwordDetails(String origin, double weight) {
		super();
		this.origin = origin;
		this.weight = weight;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
    
}
