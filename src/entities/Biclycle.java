package entities;

public class Biclycle extends Vehicle {
	
	private boolean isEletric;
	private boolean hasLuggage;	
	
	public Biclycle
	(
			double cargoCapacity, 
			boolean forCargo, 
			int maximumSpeed,
			boolean isEletric, 
			int maxPassengers,
			boolean hasLuggage			
	) 
	{
		super(
				false, 
				cargoCapacity, 
				2, 
				forCargo, 
				new Fuel("pessoa"), 
				maximumSpeed, 
				0,
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
	
	@Override
	public String toString() {
	    return super.toString() +
	            "\nIs Electric: " + isEletric +
	            "\nHas Luggage: " + hasLuggage;
	}
}
