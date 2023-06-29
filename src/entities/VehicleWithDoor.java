package entities;

import interfaces.DoorControl;

public abstract class VehicleWithDoor extends Vehicle implements DoorControl {
	
	private boolean lockedDoors; 
	private int openedDoors; 

	public VehicleWithDoor(
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
		if(this.getCurrentSpeed() > 0) {
			System.out.println("Please stop the car before opening the door.");
		}
		else {
			 if(this.lockedDoors)
					System.out.println("Please unlock the doors to open them.");
			 else if(this.openedDoors == this.getDoorsNumber())
					System.out.println("All doors are already opened!");
			 else if(doorsNumber > (this.getDoorsNumber() - this.openedDoors)) {
					int closedDoors = this.getDoorsNumber() - this.openedDoors;
					System.out.println("The vehicle has " + closedDoors + " closed doors. Opening the " + closedDoors + " doors...");
					this.openedDoors = this.getDoorsNumber();
			}
			 else {
					this.openedDoors += doorsNumber;
			 }					
		}
	}

	@Override
	public void closeDoor(int doorsNumber) {
		if(this.openedDoors == 0)
			System.out.println("All doors are already closed!");
		else if(doorsNumber > openedDoors) {
			System.out.println("The vehicle has " + openedDoors + " opened doors. Closing the " + openedDoors + " doors...");
			openedDoors = 0;
		}
		else 
			openedDoors -= doorsNumber;
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
