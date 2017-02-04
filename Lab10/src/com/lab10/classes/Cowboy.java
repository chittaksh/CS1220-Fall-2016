package com.lab10.classes;

public class Cowboy extends Character{
	
	public static int count;
	
	public Cowboy(Double Accuracy){
		super();
		count++;
		name = "Cowboy #" + count;
		accuracy = Accuracy;
	}

	@Override
	public void shoot(Character c) {
		// TODO Auto-generated method stub
		System.out.println(this.name + " attempts to shoot "+c.name+" in the back like a coward");
		Double shot = r.nextDouble();
		if(shot<accuracy){
			c.receiveInjury(shot);
		}else{
			System.out.println("The shot misses!");
		}
	}

}
