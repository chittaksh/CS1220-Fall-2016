package com.roots;

public abstract class Building {
	
	double size; 
	
	boolean haunted;
	
	public Building(){
		super();
	}
	
	public Building(double size, boolean haunted){
		this.size = size;
		this.haunted = haunted;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public boolean isHaunted() {
		return haunted;
	}

	public void setHaunted(boolean haunted) {
		this.haunted = haunted;
	}

	public abstract String Explore();
}
