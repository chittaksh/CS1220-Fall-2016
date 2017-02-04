package com.classes;

import java.util.ArrayList;

public class Student extends Person {
	
	private String cin;
	
	private ArrayList<Course> courses;
	
	public Student(String name, Address address, String cin) {
		super(name, address);
		this.cin = cin;
		this.courses = new ArrayList<Course>();
	}
	
	public Student(String name, Address address, String cin, ArrayList<Course> courses) {
		super(name, address);
		this.cin = cin;
		this.courses = courses;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(Course courses) {
		this.courses.add(courses);
	}

	public String toString(){
		return "\n" + "Name: " + super.getName() + "\n" + "CIN: " + cin + "\n" + 
				"Address: " + super.getAddress().toString() + " \n" + "Courses:" +courses.toString();
	}
}
