 
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
	
	//Using dynamic method polymorphism to override the operation for stopping for a car.
	@Override
	public void stop(){
		System.out.println("Use foot to apply pressure to break pedal.");
	}
	
	//Using static method polymorphism to overload the move method for moving into reverse in a car
	public void move(boolean reverse){
		if(reverse){
			System.out.println("Moved 1 foot backward");
		}else{
			super.move();
		}
			
	}	
	
	//Override the toString method to print the car's transmission type after Vehicles toString();
	//toString first existed in Object, then Vehicle, and now Car. Polymorphic method dispatch will select the Car implementation when 
	//calling .toString on a Car typed object.
	@Override
	public String toString(){
		//Here we execute Vehicles toString followed by Car's implementation. 
		return super.toString() + String.format(" w/ %1$s transmission (Car)", transmission.toLowerCase());
	}
}
