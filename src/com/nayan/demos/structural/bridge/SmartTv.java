package com.nayan.demos.structural.bridge;

public class SmartTv implements Device{

	private int volumeLevel;
	
	public SmartTv() {
		// TODO Auto-generated constructor stub
	}

	public SmartTv(int volumeLevel) {
		super();
		this.volumeLevel = volumeLevel;
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}
	
	@Override
	public void onOff() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setVolume(int level) {
		setVolumeLevel(level);
	}
	
	@Override
	public void connectToNetflix() {
		System.out.println("Actual code to connect with NetFlix");
	}
}
