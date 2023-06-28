package entities;

public class Car extends Vehicle {
	
	private boolean hasAirConditioning;

	public Car
	(
		boolean engine, 
		boolean steeringWheel, 
		double cargoCapacity, 
		int passengersNumber, 
		int wheelsNumber, 
		boolean forCargo, 
		Fuel fuel,
		int maximumSpeed,
		boolean hasAirConditioning,
		int doorsNumber
	) 
	{
		super(engine, steeringWheel, cargoCapacity, passengersNumber, wheelsNumber, forCargo, fuel, maximumSpeed, doorsNumber);
		this.hasAirConditioning = hasAirConditioning;
	}

	public boolean isHasAirConditioning() {
		return hasAirConditioning;
	}

	public void setHasAirConditioning(boolean hasAirConditioning) {
		this.hasAirConditioning = hasAirConditioning;
	}
	

}
