package com.nayan.demos.creational.prototype;

public class Sword implements Weapon{

	private String material;
	private double length;
	private SwordDetails details;
	
	public Sword() {
		// TODO Auto-generated constructor stub
	}
	
	public Sword(String material, double length, SwordDetails details) {
		super();
		this.material = material;
		this.length = length;
		this.details = details;
	}
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public SwordDetails getDetails() {
		return details;
	}

	public void setDetails(SwordDetails details) {
		this.details = details;
	}
	

	@Override
	public Weapon clone() {
        try {
            Sword cloned = (Sword) super.clone();
            cloned.details = new SwordDetails(this.details.getOrigin(), this.details.getWeight());
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

	@Override
	public void display() {
		System.out.println("Sword [ Material : " + this.material + ", Length : " + this.length + " cm, Origin : " + this.details.getOrigin() + ", Weight : " + this.details.getWeight() + " kg]");
	}
}
