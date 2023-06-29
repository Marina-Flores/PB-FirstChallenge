package entities;


public class Carriage extends VehicleWithDoor {

	public Carriage
	(
		boolean steeringWheel, 
		double cargoCapacity, 
		int passengersNumber, 
		int wheelsNumber, 
		boolean forCargo, 
		Fuel fuel,
		int maximumSpeed,
		int doorsNumber,
		int maxPassengers
	) 
	{
		super(
				steeringWheel, 
				cargoCapacity, 
				passengersNumber, 
				wheelsNumber, 
				forCargo, 
				fuel, 
				maximumSpeed, 
				doorsNumber,
				maxPassengers				
			);
	}	
}
