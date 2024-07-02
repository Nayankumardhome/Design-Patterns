package com.nayan.demos.creational.abstractfactory;

public class ClassicFurnitureFactory implements FurnitureFactory{

	@Override
	public FurnitureSet createFurnitureSet() {
		FurnitureSet set = new ClassicFurnitureSet(new ClassicChair(),new ClassicSofa(), new ClassicTeapoy());
		return set;
	}

}
