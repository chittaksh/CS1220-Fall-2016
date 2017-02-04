package com.classes;

import com.roots.Building;

public class House extends Building {

	String description;
	
	public House(){
		
	}
	
	public House(double size, boolean haunted, String description ){
		super(size, haunted);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String Explore() {
		return "You pass a " + super.getSize() +" sq. meter house with a(n) " + description; 
	}
	
}
