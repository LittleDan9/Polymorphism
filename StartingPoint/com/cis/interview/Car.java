package com.cis.interview;
//Using inheritance to extend the function of Vehicle into Bicycle.
public class Car extends Vehicle{
	//Add some private members to Car.	
	private String transmission;
	private int doors;
	
	//public accessor for transmission
	public String getTransmission(){
		return this.transmission;
	}
	
	//Car only accessor
	public int getDoors(){
		return doors;
	}

	//Default Constructor
	//This is different from Vehicle to account for setting the transmission type and number of doors
	public Car(int year, String make, String model, String transmission, int doors) {
		super(year, make, model, 4); //Utilize Vehicles constructor to setup a car
		//Handle the special car members after being setup from the super classes constructor.
		this.transmission = transmission;
		this.doors = doors;
	}
}
