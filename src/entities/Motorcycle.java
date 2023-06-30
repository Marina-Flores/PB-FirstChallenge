package entities;

public class Motorcycle extends Vehicle {
	
	private boolean eletricStart;

	public Motorcycle
	(
		double cargoCapacity, 
		int passengersNumber,
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
				passengersNumber, 
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
}
