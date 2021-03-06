package com.classes;

import javax.swing.JOptionPane;

public class Address {

	private String no;
	
	private String streetName;
	
	private String city;
	
	private String state;
	
	private String country;
	
	public Address() {
		super();
		this.no = JOptionPane.showInputDialog("Enter Street No :");
		this.streetName = JOptionPane.showInputDialog("Enter Street Name :");;
		this.city = JOptionPane.showInputDialog("Enter City :");;
		this.state = JOptionPane.showInputDialog("Enter State :");;
		this.country = JOptionPane.showInputDialog("Enter Country :");;
	}

	public Address(String no, String streetName, String city, String state, String country) {
		super();
		this.no = no;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString(){
		return no +" " + streetName + ", \n" + city + ", " + state + ", " + country;
	}

}
