package com.nayan.demos.creational.builder;

public class MainApp {

	public static void main(String[] args) {
		
		Cubicle cubicle = Admin.constructCubicle();
		System.out.println(cubicle.getPc());
	}
}
