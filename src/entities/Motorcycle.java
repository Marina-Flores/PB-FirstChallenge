package entities;

public class Motorcycle extends Vehicle {
	
	private boolean eletricStart;

	public Motorcycle
	(
		double cargoCapacity,
		int wheelsNumber,
		boolean forCargo, 
		Fuel fuel,
		int maximumSpeed, 
		int maxPassengers, 
		boolean eletricStart 
	) 
	{
		super(
				false, 
				cargoCapacity, 
				wheelsNumber, 
				forCargo, 
				fuel, 
				maximumSpeed, 
				0, 
				maxPassengers
			)
		;
		this.eletricStart = eletricStart;
	}


	public boolean isEletricStart() {
		return eletricStart;
	}

	public void setEletricStart(boolean eletricStart) {
		this.eletricStart = eletricStart;
	}
	
	@Override
	public String toString() {
	    return super.toString() +
	            ", Has Electric Start: " + eletricStart;
	}
}
