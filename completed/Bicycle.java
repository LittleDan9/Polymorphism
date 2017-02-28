 

//Using inheritance to extend the function of Vehicle into Bicycle.
public class Bicycle extends Vehicle {
	
	//Setting a constructor different from the super class because all "bi"cycles have two wheels. 
	public Bicycle(int year, String make, String model) {
		super(year, make, model, 2);
		//Using a mutator in Vehicle, we can change what a vehicle is considered to be a classic.
		//This does not effect other vehicles, only this instance.
		this.setYearsUntilClassic(5);
	}	
	
	//Overriding is a form of method polymorphism.
	@Override
	public void stop(){
		System.out.println("Use hands to apply pressure to breaking system.");
	}
	
	//toString is provided to use via the Object object we are overriding it
	//It is common practice to always override the toString method as it is very helpful for debugging.
	@Override
	public String toString(){
		return super.toString() + " (Bicycle)";
	}
}
