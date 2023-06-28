package entities;

public class Carriage extends Vehicle {

	public Carriage
	(
		boolean engine, 
		boolean steeringWheel, 
		double cargoCapacity, 
		int passengersNumber, 
		int wheelsNumber, 
		boolean forCargo, 
		Fuel fuel,
		int maximumSpeed,
		int doorsNumber
	) 
	{
		super(engine, steeringWheel, cargoCapacity, passengersNumber, wheelsNumber, forCargo, fuel, maximumSpeed, doorsNumber);
	}
}
