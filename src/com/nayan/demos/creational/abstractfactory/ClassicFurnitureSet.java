package com.nayan.demos.creational.abstractfactory;

public class ClassicFurnitureSet implements FurnitureSet{

	private ClassicChair chair;
	private ClassicSofa sofa;
	private ClassicTeapoy teapoy;
	
	public ClassicFurnitureSet() {
		// TODO Auto-generated constructor stub
	}

	public ClassicFurnitureSet(ClassicChair chair, ClassicSofa sofa, ClassicTeapoy teapoy) {
		super();
		this.chair = chair;
		this.sofa = sofa;
		this.teapoy = teapoy;
	}

	public ClassicChair getChair() {
		return chair;
	}

	public void setChair(ClassicChair chair) {
		this.chair = chair;
	}

	public ClassicSofa getSofa() {
		return sofa;
	}

	public void setSofa(ClassicSofa sofa) {
		this.sofa = sofa;
	}

	public ClassicTeapoy getTeapoy() {
		return teapoy;
	}

	public void setTeapoy(ClassicTeapoy teapoy) {
		this.teapoy = teapoy;
	}
}
