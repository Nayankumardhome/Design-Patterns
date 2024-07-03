package com.nayan.demos.creational.prototype;

public class GunDetails {

	private int ammoCapacity;
    private boolean isAutomatic;
    
    public GunDetails() {
		// TODO Auto-generated constructor stub
	}

	public GunDetails(int ammoCapacity, boolean isAutomatic) {
		super();
		this.ammoCapacity = ammoCapacity;
		this.isAutomatic = isAutomatic;
	}

	public int getAmmoCapacity() {
		return ammoCapacity;
	}

	public void setAmmoCapacity(int ammoCapacity) {
		this.ammoCapacity = ammoCapacity;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}

	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}
   
}
