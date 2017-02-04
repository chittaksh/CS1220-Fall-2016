package com.lab10.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.lab10.classes.Cowboy;
import com.lab10.classes.Marshall;

public class ShootOut {

	List<Cowboy> cowboys = new ArrayList<Cowboy>();
	Random r = new Random();

	public static void main(String[] args) {
		ShootOut shoot = new ShootOut();
		shoot.battle();
	}

	public void battle() {
		Marshall marshall = new Marshall("Wyatt Earp", 0.9 + (0.1 * r.nextDouble()));

		for (int i = 0; i < 5; i++) {
			Cowboy cowboy = new Cowboy(0.5 * r.nextDouble());
			cowboys.add(cowboy);
		}

		/*
		 * System.out.println(marshall.name + " has accuracy "+
		 * marshall.getAccuracy()); for(int i=0; i<5; i++){
		 * System.out.println(cowboys.get(i).name + " has accuracy " +
		 * cowboys.get(i).accuracy); }
		 */

		int current = 0;
		do {
			if (cowboys.get(current % cowboys.size()).isAlive()) {
				cowboys.get(current % cowboys.size()).shoot(marshall);

				if (marshall.isAlive())
					marshall.shoot(cowboys.get(current % cowboys.size()));
				
				if(!cowboys.get(current % cowboys.size()).isAlive())
					cowboys.remove(current % cowboys.size());
				
				// Increment the counter for the current cowboy.
				current++;
			}
			
		} while (marshall.isAlive() && cowboys.size() > 0);

		if (marshall.isAlive()) {
			System.out.println(marshall.getName() + " has won!");
		} else {
			System.out.println("Cowboys have won");
		}
	}

}
