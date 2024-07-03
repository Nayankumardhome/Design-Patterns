package com.nayan.demos.creational.builder;

//Concrete Builders - Responsible for creating actual artifacts
public class ProjectManagerBuilder implements Builder{

	Cubicle obj = new Cubicle();

	@Override
	public void buildMachine() {
		obj.setPc(new Laptop());
	}

	@Override
	public void buildDecorations() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildPeripherals() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildFurniture() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cubicle build() {
		// TODO Auto-generated method stub
		return obj;
	}
	
	
}
