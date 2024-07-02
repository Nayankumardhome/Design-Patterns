package com.nayan.demos.creational.factory;

public class OracleConnector implements DataConnector{

	@Override
	public void connect() {
		System.out.println("Oracle Connect");
	}

}
