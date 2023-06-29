package entities;

public class Car extends VehicleWithDoor{
	
	private boolean hasAirConditioning;
	
	public Car
	(
		boolean steeringWheel, 
		double cargoCapacity, 
		int passengersNumber, 
		int wheelsNumber, 
		boolean forCargo, 
		Fuel fuel,
		int maximumSpeed,
		int doorsNumber,
		int maxPassengers,
		boolean hasAirConditioning
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
		
		this.hasAirConditioning = hasAirConditioning;
	}

	public boolean isHasAirConditioning() {
		return hasAirConditioning;
	}

	public void setHasAirConditioning(boolean hasAirConditioning) {
		this.hasAirConditioning = hasAirConditioning;
	}	
	
	@Override 
	public void addPassenger() {
		
	}
	
	@Override
	public void removePassenger() {
		
	}
}
