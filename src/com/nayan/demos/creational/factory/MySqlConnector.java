package com.nayan.demos.creational.factory;

public class MySqlConnector implements DataConnector{
	
	@Override
	public void connect() {
		System.out.println("MySql Connect");
	}

}
