package entities;

public abstract class Vehicle {		
	
	private boolean engine;
	private boolean steeringWheel;	
	private double cargoCapacity;
	private int passengersNumber; 
	private int wheelsNumber; 
	private int doorsNumber;
	private boolean forCargo;
	private Fuel fuel;
	private int maximumSpeed;
	private int maxPassengers;
	
	public Vehicle
	(
		boolean steeringWheel, 
		double cargoCapacity, 
		int passengersNumber, 
		int wheelsNumber, 
		boolean forCargo,
		Fuel fuel,
		int maximumSpeed,
		int doorsNumber,
		int maxPassengers
	) 
	{
		this.engine = false;
		this.steeringWheel = steeringWheel;
		this.cargoCapacity = cargoCapacity;
		this.passengersNumber = 0;
		this.wheelsNumber = wheelsNumber;
		this.forCargo = forCargo;
		this.fuel = fuel;
		this.maximumSpeed = maximumSpeed;
		this.doorsNumber = doorsNumber;
		this.maxPassengers = maxPassengers;
	}
	
	public boolean isEngine() {
		return engine;
	}	
	public void setEngine(boolean engine) {
		this.engine = engine;
	}
	public boolean isSteeringWheel() {
		return steeringWheel;
	}
	public void setSteeringWheel(boolean steeringWheel) {
		this.steeringWheel = steeringWheel;
	}
	public int getPassengersNumber() {
		return passengersNumber;
	}
	public void setPassengersNumber(int passengersNumber) {
		this.passengersNumber = passengersNumber;
	}
	
	public int getWheelsNumber() {
		return wheelsNumber;
	}

	public boolean isForCargo() {
		return forCargo;
	}
	public void setForCargo(boolean forCargo) {
		this.forCargo = forCargo;
	}
	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public int getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(int maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}

	public int getDoorsNumber() {
		return doorsNumber;
	}

	
	@Override
	public String toString() {
		return "Vehicle: " + this.getClass().getSimpleName();
	}
	
	//TODO: speedUp
	public void speedUp(int speed) { }
	
	//TODO: speedDown
	public void speedDown(int speed) { } 
	
	//TODO: getPassengersCount
	public void getPassengersCount() { }
	
	//TODO: addPassenger
	public void addPassenger() { }
	
	//TODO: removePassenger
	public void removePassenger() { }
	
	//TODO: isMaxPassengerReached
	public boolean isMaxPassengerReached() { return false; }
	
	//TODO: startEngine
	public void startEngine() {
		this.engine = true;
	} 
	
	//TODO: stopEngine
	public void stopEngine() {
		this.engine = false;
	}
	
	
	
	
	
	
	
	
}
