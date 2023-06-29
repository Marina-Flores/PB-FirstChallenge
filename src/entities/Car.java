package entities;

import interfaces.DoorControl;

public class Car extends Vehicle implements DoorControl{
	
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
	public void openDoor(int doorsNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeDoor(int doorsNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lockDoors() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unlockDoors() {
		// TODO Auto-generated method stub
		
	}
	

}
