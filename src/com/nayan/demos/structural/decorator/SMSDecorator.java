package com.nayan.demos.structural.decorator;

public class SMSDecorator extends BaseNotifierDecorator{

	public SMSDecorator(Notify wrapped) {
		super(wrapped);
	}

	@Override
	public void send(String msg) {
		super.send(msg);
		long phoneNbr = this.dbService.getPhoneNbr(this.getUsername());
		if (phoneNbr != 0) {
			System.out.println("Sending " + msg + " by SMS to " + phoneNbr);
		} else {
			System.out.println("User not found");
		}
	}
}
