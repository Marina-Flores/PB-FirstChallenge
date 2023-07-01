package entities;


public class Carriage extends Vehicle {

	public Carriage(
			double cargoCapacity, 
			int wheelsNumber, 
			boolean forCargo,   
			int maximumSpeed,   
			int doorsNumber,  
			int maxPassengers 
	) 
	{
		super(
				false, 
				cargoCapacity, 
				0, 
				wheelsNumber,
				forCargo, 
				new Fuel("animal"), 
				maximumSpeed, 
				doorsNumber,
				maxPassengers);
	}

	
}
