package com.nayan.demos.creational.singleton;

public class Singleton {

	private static Singleton ref = new Singleton();
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance() {
		return ref;
	}
}
