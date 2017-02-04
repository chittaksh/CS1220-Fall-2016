package com.classes;

import javax.swing.JOptionPane;

public class Person {

	private String name;
	
	private Address address;

	public Person() {
		super();
		this.name = JOptionPane.showInputDialog("Enter Name :");
		this.address = new Address();
	}
	
	public Person(String name){
		super();
	}

	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public String toString(){
		return "Name: " + name + "\n" + "Address: \n" + address.toString();
	}
}
