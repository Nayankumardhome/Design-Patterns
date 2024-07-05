package com.nayan.demos.structural.bridge;

public class BasicRemote implements Remote{

	protected Device device;
	
	public BasicRemote() {
		// TODO Auto-generated constructor stub
	}

	public BasicRemote(Device device) {
		super();
		this.device = device;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	@Override
	public void power() {
		device.onOff();
	}

	@Override
	public void volume() {
		
	}
}
