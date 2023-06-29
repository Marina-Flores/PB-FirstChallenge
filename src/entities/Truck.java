package entities;

import interfaces.DoorControl;

public class Truck extends Vehicle implements DoorControl{
	
	private int axlesNumber;
	
	public Truck
	(
		boolean steeringWheel, 
		double cargoCapacity, 
		int passengersNumber, 
		int wheelsNumber, 
		boolean forCargo, 
		Fuel fuel, 
		int maximumSpeed,
		int axlesNumber,
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
				maxPassengers);
		
		this.axlesNumber = axlesNumber;
	}	

	public int getAxlesNumber() {
		return axlesNumber;
	}

	public void setAxlesNumber(int axlesNumber) {
		this.axlesNumber = axlesNumber;
	}	
	
	@Override 
	public void openDoor(int doorsNumber) {
		
	}
	
	@Override
	public void closeDoor(int doorsNumber) {
		
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
