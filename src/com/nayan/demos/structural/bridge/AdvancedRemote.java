package com.nayan.demos.structural.bridge;

public class AdvancedRemote extends BasicRemote{

	public AdvancedRemote() {
		// TODO Auto-generated constructor stub
	}

	public AdvancedRemote(Device device) {
		super(device);
	}
	
	public void mute() {
		device.setVolume(0);
	}
}
