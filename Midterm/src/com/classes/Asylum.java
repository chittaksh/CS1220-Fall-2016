package com.classes;

import com.roots.Building;

public class Asylum extends Building{

	String name;
	
	public Asylum(){
		super();
	}
	
	public Asylum(double size, boolean haunted,String name){
		super(size, haunted);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String Explore() {
		return "You pass a "+ super.getSize() + " sq. meter asylum called " + name;
	}
}
