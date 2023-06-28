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
	
	public Vehicle
	(
		boolean engine, 
		boolean steeringWheel, 
		double cargoCapacity, 
		int passengersNumber, 
		int wheelsNumber, 
		boolean forCargo,
		Fuel fuel,
		int maximumSpeed,
		int doorsNumber
	) 
	{
		this.engine = engine;
		this.steeringWheel = steeringWheel;
		this.cargoCapacity = cargoCapacity;
		this.passengersNumber = passengersNumber;
		this.wheelsNumber = wheelsNumber;
		this.forCargo = forCargo;
		this.fuel = fuel;
		this.maximumSpeed = maximumSpeed;
		this.doorsNumber = doorsNumber;
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
	public void setWheelsNumber(int wheelsNumber) {
		this.wheelsNumber = wheelsNumber;
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
	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
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

	public void setDoorsNumber(int doorsNumber) {
		this.doorsNumber = doorsNumber;
	}
	
	@Override
	public String toString() {
		return "Vehicle: " + this.getClass().getSimpleName();
	}
	
	//TODO: To implement
	public void speedUp(int speed) { }
	
	//TODO: To implement
	public void speedDown(int speed) { } 
	
	//TODO; To implement
	public void getPassenger() { }
	
	
	
}
