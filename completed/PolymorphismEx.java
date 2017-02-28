/**************************************************************************
Author: Daniel R. Little
Date: February 20, 2017
Purpose: 	The main executing object in a lecture example on polymorphism. 
		 	The object of this class is to show both variable polymorphism
		 	and method polymorphism utilizing an ArrayList of the superclass
		 	type. It also demonstrates the difference between static and 
		 	dynamic	types.
***************************************************************************/
 
import java.util.*;

public class PolymorphismEx {

	public static void main(String[] args) {
		//Create a new Vehicle object and store it in a vehicle variable
		Vehicle v1 = new Vehicle(1983, "Big Wheels", "Yellow & Blue", 3);
		
		//Create a new Bicycle object and store it in a vehicle variable
		Bicycle b1 = new Bicycle(2011, "Giant", "TCR Advanced SL");
		
		//Create a new Car object and store is in a Car variable
		Car c1 = new Car(2014, "Tesla", "Model 3", "Automatic", 4);		
		
		//Create a new Car object and store is in a Car variable
		Car c2 = new Car(2000, "Subaru", "Legacy", "Manual", 4);
		
		//Create a new Vehicle variable and store a Car object in it.
		//Storing a Car object (dynamic type) into a Vehicle variable (static type) is an example of variable polymorphism. 
		Vehicle v3 = c2;
		
		//We can store an sub class of vehicle as well as vehicle in a vehicle object
		//We cannot store a vehicle object in a subclass of vehicle.
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(v1); //Adding a vehicle to a list of vehicles is nothing special
		vehicles.add(b1); //Adding a car to a list of vehicles is polymorphism in action
		vehicles.add(c1); //Adding a bicycle to a list of vehicles is polymorphism in action. 		
		vehicles.add(v3); //Adding a local vehicle variables that is holding a Car typed object.
		
		//Simple for-loop to demonstrate method & variable polymorphism as well as method traversal. 		
		for(Vehicle vehicle : vehicles){
			//When an object is printed using System.out.println the object toString method is the string that is returned.
			//We could have also written System.out.println(vehicle.toString());
			System.out.println(vehicle);
			//Use reflection to get the package and class name of the current object. 
			System.out.println("Dynamic Type is " + vehicle.getClass().getName());
			//Polymorphic method dispatch and ternary operator.
			System.out.println("Vehicle is " + (vehicle.isClassic() ? "a" : "not a") + " classic");			
			if(vehicle instanceof Car){ //Reflection to see if the vehicle object is or Type Car
				//Utilize casting to access the getDoors method.
				System.out.println("Car has " + ((Car)vehicle).getDoors() + " Doors");
				//Execute the move method to demonstrate polymorphic method dispatch with overloading.
				((Car)vehicle).move(true);
			}
			//Execute the move method to demonstrate polymorphic method dispatch with overloading.
			vehicle.move();
			//Execute the stop method to demonstrate polymorphic method dispatch with overriding.			
			vehicle.stop();
			//Add a line to the screen print for easier reading.
			System.out.println("");			
		}		
	}

}
