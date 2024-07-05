package com.nayan.demos.structural.bridge;

public class amazonFireStickRemote extends AdvancedRemote{

	public amazonFireStickRemote() {
		// TODO Auto-generated constructor stub
	}

	public amazonFireStickRemote(Device device) {
		super(device);
	}
	
	public void connectToNetflix() {
		device.connectToNetflix();
	}
}
