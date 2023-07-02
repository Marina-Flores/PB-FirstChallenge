package entities;

import interfaces.DoorControl;

public abstract class VehicleWithDoor extends Vehicle implements DoorControl {

	private boolean lockedDoors = false;
	private int openedDoors = 0;

	public VehicleWithDoor(double cargoCapacity, int wheelsNumber, boolean forCargo, Fuel fuel,
			int maximumSpeed, int doorsNumber, int maxPassengers) {
		super(true, cargoCapacity, wheelsNumber, forCargo, fuel, maximumSpeed, doorsNumber,
				maxPassengers);
	}
	
	public VehicleWithDoor() { }

	@Override
	public void openDoor(int doorsNumber) {
		if (this.getCurrentSpeed() > 0) {
			System.out.println("Please stop the car before opening the door.");
		} else {
			if (this.lockedDoors)
				System.out.println("Please unlock the doors to open them.");
			else if (this.openedDoors == this.getDoorsNumber())
				System.out.println("All doors are already opened!");
			else if (doorsNumber > (this.getDoorsNumber() - this.openedDoors)) {
				int closedDoors = this.getDoorsNumber() - this.openedDoors;
				System.out.println(
						"The vehicle has " + closedDoors + " closed doors. Opening the " + closedDoors + " doors...");
				this.openedDoors = this.getDoorsNumber();
			} else {
				System.out.println("Opening " + doorsNumber + " doors...");
				this.openedDoors += doorsNumber;
			}
		}
	}

	@Override
	public void closeDoor(int doorsNumber) {
		if (this.openedDoors == 0)
			System.out.println("All doors are already closed!");
		else if (doorsNumber > openedDoors) {
			System.out.println(
					"The vehicle has " + openedDoors + " opened doors. Closing the " + openedDoors + " doors...");
			openedDoors = 0;
		} else {
			System.out.println("Closing " + doorsNumber + " doors...");
			openedDoors -= doorsNumber;
		}
	}

	@Override
	public void lockDoors() {
		if (this.lockedDoors)
			System.out.println("The doors are already locked.");
		else if (openedDoors > 0)
			System.out.println("Please, close the doors so that it can be locked.");
		else {
			System.out.println("Locked doors!");
			this.lockedDoors = true;
		}
	}

	@Override
	public void unlockDoors() {
		if (!this.lockedDoors)
			System.out.println("The doors are already unlocked.");
		else {
			System.out.println("Unlocked doors!");
			this.lockedDoors = false;
		}
	}
	
	@Override
	public void speedUp(int speed) {
		if(!engine)
			System.out.println("Please, start the car before accelerating!");
		else if(this.openedDoors > 0)
			System.out.println("Please, close the doors before accelerating!");
		else if(this.currentSpeed == this.maximumSpeed)
			System.out.println("It wasn't possible to accelerate because the vehicle is already at maximum speed!");
		else if((this.currentSpeed + speed) > this.maximumSpeed) {
			int speedIncreased = (this.currentSpeed + speed) - this.maximumSpeed;
			this.setCurrentSpeed(this.currentSpeed + speedIncreased);
			System.out.println("It only possible to increase the speed by " + speedIncreased + " in order to avoid exceeding the maximum speed!");
		}
		else {
			System.out.println("Speeding up... Current speed: " + currentSpeed);
			this.setCurrentSpeed(this.currentSpeed + speed); 
		}
	}
	
	@Override
	public String toString() {
	    return super.toString() +
	            "\nLocked Doors: " + lockedDoors +
	            "\nOpened Doors: " + openedDoors;
	}
}
