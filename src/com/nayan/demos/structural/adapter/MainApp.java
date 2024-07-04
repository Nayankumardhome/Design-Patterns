package com.nayan.demos.structural.adapter;

import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		CSVReader csvReader = new CSVReader();
		UserAdapter userAdapter = new CSVToJsonAdapter(csvReader);
		
		String csvFileName = "users.csv";
		List<User> users = userAdapter.getUsers(csvFileName);
		for(User user : users) {
			System.out.println(user.toString());
		}
	}

}
