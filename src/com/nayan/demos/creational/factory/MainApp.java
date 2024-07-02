package com.nayan.demos.creational.factory;

import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		
		List<DataConnector> connectors = ConnectorFactory.getObjects();
		for(DataConnector ref : connectors) {
			ref.connect();
		}
	}

}
