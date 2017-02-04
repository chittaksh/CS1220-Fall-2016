package com.classes;

public class Course {

	private String identifier;
	
	private String title;

	public Course(String identifier, String title) {
		super();
		this.identifier = identifier;
		this.title = title;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString(){
		return identifier + " : " + title;
	}

}
