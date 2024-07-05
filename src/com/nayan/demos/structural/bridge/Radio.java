package com.nayan.demos.structural.bridge;

public class Radio implements Device{

	private int volumeLevel;
	
	public Radio() {
		// TODO Auto-generated constructor stub
	}
	
	public Radio(int volumeLevel) {
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
