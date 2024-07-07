package com.nayan.demos.structural.decorator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MySQLService {

	private User getUser(String username) {
	    User obj = null;

	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");

	        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasename", "username", "password");
	             PreparedStatement pst = con.prepareStatement("SELECT * FROM user WHERE username = ?")) {

	            pst.setString(1, username);
	            try (ResultSet rs = pst.executeQuery()) {
	                if (rs.next()) {
	                    String name = rs.getString("username");
	                    String email = rs.getString("emailId");
	                    long phoneNo = rs.getLong("phoneNbr");

	                    obj = new User(name, email, phoneNo);
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }

	    return obj;
	}

	
	public long getPhoneNbr(String username) {
		User obj = getUser(username);
		if(obj != null) {
			return obj.getPhoneNbr();
		}
		return 0;
	}
	
	public String getEmail(String username) {
		User obj = getUser(username);
		if(obj != null) {
			return obj.getEmailId();
		}
		return "User not found";
	}
}
