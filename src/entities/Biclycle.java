package entities;

public class Biclycle extends Vehicle {
	
	private boolean isEletric;
	private boolean hasLuggage;	
	
	public Biclycle
	(
			boolean engine, 
			boolean steeringWheel, 
			double cargoCapacity, 
			int passengersNumber, 
			int wheelsNumber, 
			boolean 
			forCargo, 
			Fuel fuel,
			int maximumSpeed,
			boolean isEletric,
			boolean hasLuggage, 
			int doorsNumber
	) 
	{
		super(engine, steeringWheel, cargoCapacity, passengersNumber, wheelsNumber, forCargo, fuel, maximumSpeed, doorsNumber);
		this.isEletric = isEletric;
		this.hasLuggage = hasLuggage;
	}
	
	public boolean isEletric() {
		return isEletric;
	}
	public void setEletric(boolean isEletric) {
		this.isEletric = isEletric;
	}
	public boolean isHasLuggage() {
		return hasLuggage;
	}
	public void setHasLuggage(boolean hasLuggage) {
		this.hasLuggage = hasLuggage;
	} 
	
	

}
