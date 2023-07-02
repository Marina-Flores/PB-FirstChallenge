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
				new Fuel("human"), 
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
	public void startEngine() {
		if(isEletric) {
			if(engine)
				System.out.println("The engine is already running!");
			else {
				System.out.println("Starting the engine...");
				this.engine = true;
			}
		}
		else 		
			System.out.println("Sorry, this bicycle does not have an engine!");	
	} 

	@Override
	public void stopEngine() {
		if(isEletric) {
			if(!engine)
				System.out.println("The engine is already running!");
			else {
				System.out.println("Starting the engine...");
				this.engine = true;
			}
		}
		else 
			System.out.println("Sorry, this bicycle does not have an engine!");			
	}
	
	@Override
	public String toString() {
	    return super.toString() +
	            "\nIs Electric: " + isEletric +
	            "\nHas Luggage: " + hasLuggage;
	}
}
