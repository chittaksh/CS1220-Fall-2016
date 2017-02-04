package com.lab10.classes;

public class Marshall extends Character{
	
	public Marshall(String Name, Double Accuracy){
		super();
		name = Name;
		accuracy = Accuracy;
	}

	@Override
	public void shoot(Character c) {
		System.out.println( this.name + " steadfastly stands up to "+ c.name + " and draws!");
		Double shot = r.nextDouble();
		if(shot<accuracy){
			c.receiveInjury(shot);
		}else{
			System.out.println("The shot misses!");
		}	
	}

}
