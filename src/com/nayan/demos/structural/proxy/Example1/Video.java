package com.nayan.demos.structural.proxy.Example1;

public class Video {

	private String id;
	private String title;
	private String data;
	
	public Video() {
		// TODO Auto-generated constructor stub
	}

	public Video(String id, String title) {
		super();
		this.id = id;
		this.title = title;
		this.data = "Video";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
		
}
