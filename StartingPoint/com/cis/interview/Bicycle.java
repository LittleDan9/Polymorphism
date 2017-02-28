package com.cis.interview;

//Using inheritance to extend the function of Vehicle into Bicycle.
public class Bicycle extends Vehicle {
	
	//Setting a constructor different from the super class because all "bi"cycles have two wheels. 
	public Bicycle(int year, String make, String model) {
		super(year, make, model, 2);
	}
}
