package com.nayan.demos.creational.singleton;

public class MainApp {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		System.out.println(obj1.hashCode());
		
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj2.hashCode());
		
		//Both Hashcodes are some because the refer to same object
	}

}
