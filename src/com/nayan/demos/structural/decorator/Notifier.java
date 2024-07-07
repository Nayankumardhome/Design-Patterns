package com.nayan.demos.structural.decorator;

public class Notifier implements Notify {

	private final String username;
	private final MySQLService dbService;

	public Notifier(String username) {
		this.username = username;
		this.dbService = new MySQLService();
	}

	public String getUsername() {
		return username;
	}

	@Override
	public void send(String msg) {
		String mail = this.dbService.getEmail(this.username);
		if (!mail.equals("User not found")) {
			System.out.println("Sending " + msg + " by mail to " + mail);
		} else {
			System.out.println("User not found");
		}
	}
}