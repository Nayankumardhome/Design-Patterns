package com.nayan.demos.creational.abstractfactory;

public class ModernChair implements Chair{

	@Override
	public int hasLegs() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String hasMaterial() {
		// TODO Auto-generated method stub
		return "wood, plastic and iron";
	}

}
