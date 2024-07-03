package com.nayan.demos.creational.builder;

public class Cubicle {

	private float officeSpace;
	private Machine pc;
	
	public Cubicle() {
		// TODO Auto-generated constructor stub
	}

	public Cubicle(float officeSpace, Machine pc) {
		super();
		this.officeSpace = officeSpace;
		this.pc = pc;
	}

	public float getOfficeSpace() {
		return officeSpace;
	}

	public void setOfficeSpace(float officeSpace) {
		this.officeSpace = officeSpace;
	}

	public Machine getPc() {
		return pc;
	}

	public void setPc(Machine pc) {
		this.pc = pc;
	}
	
}
