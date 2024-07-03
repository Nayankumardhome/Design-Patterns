package com.nayan.demos.creational.builder;

//Responsible for orchestration - getting all things together
public class Admin {

	public static Cubicle constructCubicle() {
		
		Builder builder = new ProjectManagerBuilder();
		//Will be created using Factory pattern for now just manually put on here ProjectManagerBuilder
		//but it can come through Factory pattern also
		
		if(builder instanceof CeoCubicleBuilder) {
			
		}
		else {
			
		}
		builder.buildMachine();
		
		return builder.build();
	}
}
