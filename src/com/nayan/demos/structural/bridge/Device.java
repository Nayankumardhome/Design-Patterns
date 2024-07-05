package com.nayan.demos.structural.bridge;

public interface Device {

	public void onOff();
	public void setVolume(int level);
	
	public default void connectToNetflix() {
		System.out.println("This is the default connection to Netflix");
	}
}
