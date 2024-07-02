package com.nayan.demos.creational.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConnectorFactory {

	public static List<DataConnector> getObjects() {
		List<DataConnector> connector = new ArrayList<DataConnector>();
		
		try (FileInputStream fin = new FileInputStream("class.txt");
			Scanner sc = new Scanner(fin)){
			while(sc.hasNextLine()) {
				String className = sc.nextLine();
				DataConnector ref = null;
				Class meta = Class.forName(className);
				ref=(DataConnector)meta.getConstructor().newInstance();
				connector.add(ref);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return connector;
	}
}
