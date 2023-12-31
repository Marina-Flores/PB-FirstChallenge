package entities;

public class Car extends VehicleWithDoor{
	
	private boolean hasAirConditioning;
	
	public Car
	(
		double cargoCapacity,
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
				cargoCapacity, 
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
	public String toString() {
	    return super.toString() +
	            "\nHas Air Conditioning: " + hasAirConditioning;
	}	
}
