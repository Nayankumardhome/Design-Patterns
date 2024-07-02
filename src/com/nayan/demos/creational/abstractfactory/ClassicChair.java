package com.nayan.demos.creational.abstractfactory;

public class ClassicChair implements Chair{

	@Override
	public int hasLegs() {
		return 4;
	}

	@Override
	public String hasMaterial() {
		return "wood structure upholstered in fabric or leather";
	}

}
