package com.nayan.demos.creational.prototype;

public class Bow implements Weapon{

	private String type;
    private double drawWeight;
    private BowDetails details;
    
    public Bow() {
		// TODO Auto-generated constructor stub
	}

	public Bow(String type, double drawWeight, BowDetails details) {
		super();
		this.type = type;
		this.drawWeight = drawWeight;
		this.details = details;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getDrawWeight() {
		return drawWeight;
	}

	public void setDrawWeight(double drawWeight) {
		this.drawWeight = drawWeight;
	}

	public BowDetails getDetails() {
		return details;
	}

	public void setDetails(BowDetails details) {
		this.details = details;
	}
    
	
    @Override
    public Weapon clone() {
    	try {
			Bow clone = (Bow) super.clone();
			clone.details = new BowDetails(this.details.getMaterial(), this.details.getStringLength());
			return clone;
		} catch (CloneNotSupportedException e) {
            return null;
        }
    }
    
    @Override
    public void display() {
    	System.out.println("Bow [ Type : " + this.type + ", Draw Weight : " + this.drawWeight + " Kg, Material : " + this.details.getMaterial() + ", String Length : " + this.details.getStringLength() + " m]");
    }
    
}
