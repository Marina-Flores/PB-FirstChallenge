package entities;

public class Truck extends VehicleWithDoor{
	
	private int axlesNumber;
	
	public Truck
	(
		boolean hasSteeringWheel, 
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
	
	
}
