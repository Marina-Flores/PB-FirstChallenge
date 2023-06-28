package entities;

public class Motorcycle extends Vehicle {
	
	private boolean eletricStart;

	public Motorcycle
	(
		boolean engine, 
		boolean steeringWheel,
		double cargoCapacity, 
		int passengersNumber,
		int wheelsNumber, 
		boolean forCargo,
		Fuel fuel,
		int maximumSpeed,
		boolean eletricStart,
		int doorsNumber
	) 
	{
		super(engine, steeringWheel, cargoCapacity, passengersNumber, wheelsNumber, forCargo, fuel, maximumSpeed, doorsNumber);
		this.eletricStart = eletricStart;
	}


	public boolean isEletricStart() {
		return eletricStart;
	}

	public void setEletricStart(boolean eletricStart) {
		this.eletricStart = eletricStart;
	}
}
