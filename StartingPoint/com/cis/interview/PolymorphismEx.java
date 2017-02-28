/**************************************************************************
Author: Daniel R. Little
Date: February 20, 2017
Purpose: 	The main executing object in a lecture example on polymorphism. 
		 	The object of this class is to show both variable polymorphism
		 	and method polymorphism utilizing an ArrayList of the superclass
		 	type. It also demonstrates the difference between static and 
		 	dynamic	types.
***************************************************************************/
package com.cis.interview;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismEx {

	public static void main(String[] args) {
		//Object constructors
		//Vehicle(int year, String make, String model, int wheels)
		//Car(int year, String make, String model, String transmission, int doors)
		//Bicycle(int year, String make, String model)


		//Vehicle List
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle(1983, "Big Wheels", "Classic", 3));

		//Loop through list
		for(Vehicle vehicle : list){
			vehicle.move();
			vehicle.stop();
		}


	}

}
