package com.nayan.demos.structural.bridge;

public class Television implements Device {

	private int volumeLevel;
	
	public Television() {
		// TODO Auto-generated constructor stub
	}

	public Television(int volumeLevel) {
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
}
