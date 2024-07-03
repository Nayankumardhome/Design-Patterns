package com.nayan.demos.creational.prototype;

public class Gun implements Weapon{

	private String model;
    private int range;
    private GunDetails details;
    
    public Gun() {
		// TODO Auto-generated constructor stub
	}
    
    public Gun(String model, int range, GunDetails details) {
		super();
		this.model = model;
		this.range = range;
		this.details = details;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public GunDetails getDetails() {
		return details;
	}
	
	public void setDetails(GunDetails details) {
		this.details = details;
	}


	@Override
	public Weapon clone() {
    	try {
            Gun cloned = (Gun) super.clone();
            cloned.details = new GunDetails(this.details.getAmmoCapacity(), this.details.isAutomatic());
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    
    @Override
    public void display() {
    	System.out.println("Gun [ Model : " + this.model + ", Range : " + this.range + " meters, Ammo Capacity : " + this.details.getAmmoCapacity() + ", Automatic : " + this.details.isAutomatic()+ "]");
    }
}
