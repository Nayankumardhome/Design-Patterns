package com.nayan.demos.creational.abstractfactory;

public class ModernFurnitureFactory implements FurnitureFactory{

	@Override
	public FurnitureSet createFurnitureSet() {
		FurnitureSet set = new ModernFurnitureSet(new ModernChair(), new ModernSofa(), new ModernTeapoy());
		return set;
	}

}
