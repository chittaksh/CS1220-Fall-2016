package com.classes;

import javax.swing.JOptionPane;

public class Course {

	private String identifier;
	
	private String title;

	public Course() {
		super();
		this.identifier = JOptionPane.showInputDialog("Enter Identifier :");
		this.title = JOptionPane.showInputDialog("Enter Subject Title :");
	}

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
