package com.nayan.demos.creational.builder;

public interface Builder {

	public void buildMachine();
	public void buildDecorations();
	public void buildPeripherals();
	public void buildFurniture();
	
	public Cubicle build();
}
