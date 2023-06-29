package entities;

public class Biclycle extends Vehicle {
	
	private boolean isEletric;
	private boolean hasLuggage;	
	
	public Biclycle
	(
			boolean steeringWheel, 
			double cargoCapacity, 
			int passengersNumber, 
			int wheelsNumber, 
			boolean forCargo, 
			Fuel fuel,
			int maximumSpeed,
			boolean isEletric,
			int doorsNumber, 
			int maxPassengers,
			boolean hasLuggage			
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
