/**************************************************************************
Author: Daniel R. Little
Date: February 20, 2017
Purpose: Super class used to demonstrate Polymorphism during lecture.
***************************************************************************/
 
import java.util.Calendar;

public class Vehicle {
	
	//Internal Variables (Encapsulation)
	private int wheels, year;
	private int yearsUntilClassic = 10;
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
	
	//Mutator
	public void setYearsUntilClassic(int yearsUntilClassic){
		this.yearsUntilClassic = yearsUntilClassic;
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
	
	//Super class method that determines if a vehicle is a classic vehicle.
	public boolean isClassic(){
		if(this.year < (Calendar.getInstance().get(Calendar.YEAR) - yearsUntilClassic)){
			return true;
		}
		return false;
	}
	
	
	//This override the implementation of toString found in the Object class. Because vehicle doesn't explicitly extend Object,
	//the compiler automatically extends the Vehicle class from Object.
	@Override 
	public String toString() {
		return String.format("%1$d %2$s %3$s has %4$d wheels", year, make, model, wheels);
	
	}
	

}


