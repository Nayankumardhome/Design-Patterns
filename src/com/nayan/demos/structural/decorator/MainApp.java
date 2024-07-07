package com.nayan.demos.structural.decorator;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username:");
		String username = sc.nextLine();
		Notify notify = new SMSDecorator(new WhatsappDecorator(new Notifier(username)));
		notify.send("Order delivered");
		sc.close();
	}
}
