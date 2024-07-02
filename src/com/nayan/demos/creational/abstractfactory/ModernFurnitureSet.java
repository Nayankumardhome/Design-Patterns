package com.nayan.demos.creational.abstractfactory;

public class ModernFurnitureSet implements FurnitureSet{

	private ModernChair chair;
	private ModernSofa sofa;
	private ModernTeapoy teapoy;
	
	public ModernFurnitureSet() {
		// TODO Auto-generated constructor stub
	}

	public ModernFurnitureSet(ModernChair chair, ModernSofa sofa, ModernTeapoy teapoy) {
		super();
		this.chair = chair;
		this.sofa = sofa;
		this.teapoy = teapoy;
	}

	public ModernChair getChair() {
		return chair;
	}

	public void setChair(ModernChair chair) {
		this.chair = chair;
	}

	public ModernSofa getSofa() {
		return sofa;
	}

	public void setSofa(ModernSofa sofa) {
		this.sofa = sofa;
	}

	public ModernTeapoy getTeapoy() {
		return teapoy;
	}

	public void setTeapoy(ModernTeapoy teapoy) {
		this.teapoy = teapoy;
	}
}
