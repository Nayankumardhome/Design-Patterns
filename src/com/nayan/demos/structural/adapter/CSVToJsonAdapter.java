package com.nayan.demos.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class CSVToJsonAdapter implements UserAdapter{

	private CSVReader csvReader;
	
	public CSVToJsonAdapter() {
		// TODO Auto-generated constructor stub
	}

	public CSVToJsonAdapter(CSVReader csvReader) {
		super();
		this.csvReader = csvReader;
	}

	public CSVReader getCsvReader() {
		return csvReader;
	}

	public void setCsvReader(CSVReader csvReader) {
		this.csvReader = csvReader;
	}

	@Override
	public List<User> getUsers(String fileName) {
		List<String[]> csvData = csvReader.readcsv(fileName);
		List<User> users = new ArrayList<User>();
		for(String[] row : csvData) {
			String name = row[0];
            String email = row[1];
            String password = row[2];
            String lineOne = row[3];
            String city = row[4];
            int pincode = Integer.parseInt(row[5]);
            users.add(new User(name,email,password,new Address(lineOne,city,pincode)));
		}
		return users;
	}
}
