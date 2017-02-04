package main;

import java.util.ArrayList;
import java.util.List;

import com.classes.Asylum;
import com.classes.House;
import com.roots.Building;

public class Driver {
	
	public static void main(String[] args){
		
		List<Building> buildings = dummyData();
		int count = 0;
		
		System.out.println("Let's go for a stroll on Maple street!");
		
		for(Building b: buildings){
			System.out.println(b.Explore());
			if(b.isHaunted()){
				System.out.println("Watch out! A ghost!");
				count++;
			}
		}
		
		System.out.println(count + " of the buildings on Maple Street are(is) haunted.");
	}
	
	public static List<Building> dummyData(){
		List<Building> build = new ArrayList<Building>();
		
		House h1 = new House(165.4, true, "updated kitchen");
		build.add(h1);
		
		House h2 = new House(171.5, false, "capacous septic tank");
		build.add(h2);
		
		Asylum a1 = new Asylum(35000.25, true,"The California Home for Clowns");
		build.add(a1);
		
		House h3 = new House(234.0, false, "updated bathroom");
		build.add(h3);
		
		House h4 = new House(170.0, false, "capacous sink tank");
		build.add(h4);
		
		Asylum a2 = new Asylum(45000.00, true,"The California Home for Scholars");
		build.add(a2);
		
		return build;
	}

}
