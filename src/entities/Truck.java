package entities;


public class Truck extends Vehicle{
	
	private int axlesNumber;
	
	public Truck
	(
		boolean engine, 
		boolean steeringWheel, 
		double cargoCapacity, 
		int passengersNumber, 
		int wheelsNumber, 
		boolean forCargo, 
		Fuel fuel, 
		int maximumSpeed,
		int axlesNumber,
		int doorsNumber
	) 
	{
		super(engine, steeringWheel, cargoCapacity, passengersNumber, wheelsNumber, forCargo, fuel, maximumSpeed, doorsNumber);
		this.axlesNumber = axlesNumber;
	}

	public int getAxlesNumber() {
		return axlesNumber;
	}

	public void setAxlesNumber(int axlesNumber) {
		this.axlesNumber = axlesNumber;
	}
	
	
}
