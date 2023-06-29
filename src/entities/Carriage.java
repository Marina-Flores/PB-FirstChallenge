package entities;

import interfaces.DoorControl;

public class Carriage extends Vehicle implements DoorControl {

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
