/**************************************************************************
Author: Daniel R. Little
Date: February 20, 2017
Purpose: Super class used to demonstrate Polymorphism during lecture.
***************************************************************************/
package com.cis.interview;

public class Vehicle {
	
	//Internal Variables (Encapsulation)
	private int wheels, year;
	private String make, model;
	
	//Accessors	
	public int getWheels(){
		return this.wheels;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public String getMake(){
		return this.make;
	}

	
	public String getModel(){
		return model;
	}
	
	//Action methods for Vehicles
	public void stop(){
		System.out.println("Come to a stop.");
	}
	
	public void move(){
		System.out.println("Moved 1 foot forward");
	}

	//Default constructor	
	public Vehicle(int year, String make, String model, int wheels) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.wheels = wheels;
	}
	
	
	//This override the implementation of toString found in the Object class. Because vehicle doesn't explicitly extend Object,
	//the compiler automatically extends the Vehicle class from Object.
	@Override 
	public String toString() {
		return String.format("%1$d %2$s %3$s has %4$d wheels", year, make, model, wheels);
	
	}
	

}


