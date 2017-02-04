package com.classes;

import java.util.ArrayList;

public class FacultyMember extends Person {

	private String employeeId;
	
	private ArrayList<Course> courses;

	public FacultyMember(String name, Address address, String employeeId){
		super(name, address);
		this.employeeId = employeeId;
		this.courses = new ArrayList<Course>();
	}
	
	public FacultyMember(String name, Address address, String employeeId, ArrayList<Course> courses){
		super(name, address);
		this.employeeId = employeeId;
		this.courses = courses;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(Course courses) {
		this.courses.add(courses);
	}
	
	public String toString(){
		return "\n" + "Name: " + super.getName() + "\n" + "ID: " + employeeId + "\n" + 
				"Address: " + super.getAddress().toString() + " \n" + "Courses:" +courses.toString();
	}
}
