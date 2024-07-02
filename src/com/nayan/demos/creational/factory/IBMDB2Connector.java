package com.nayan.demos.creational.factory;

public class IBMDB2Connector implements DataConnector{

	@Override
	public void connect() {
		System.out.println("IBMDB2 connect");		
	}

}
