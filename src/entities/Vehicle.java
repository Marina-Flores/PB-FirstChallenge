package entities;

public abstract class Vehicle {		
	
	protected boolean engine;
	private boolean hasSteeringWheel;	
	private double cargoCapacity;
	private int passengersNumber; 
	private int wheelsNumber; 
	private int doorsNumber;
	private boolean forCargo;
	private Fuel fuel;
	protected int maximumSpeed;
	private int maxPassengers;
	protected int currentSpeed = 0; 
	
	public Vehicle
	(
		boolean hasSteeringWheel, 
		double cargoCapacity, 
		int wheelsNumber, 
		boolean forCargo,
		Fuel fuel,
		int maximumSpeed,
		int doorsNumber,
		int maxPassengers
	) 
	{
		this.engine = false;
		this.hasSteeringWheel = hasSteeringWheel;
		this.cargoCapacity = cargoCapacity;
		this.passengersNumber = 0;
		this.wheelsNumber = wheelsNumber;
		this.forCargo = forCargo;
		this.fuel = fuel;
		this.maximumSpeed = maximumSpeed;
		this.doorsNumber = doorsNumber;
		this.maxPassengers = maxPassengers;
	}
	
	public Vehicle() {}
	
	public boolean isEngine() {
		return engine;
	}	
	public void setEngine(boolean engine) {
		this.engine = engine;
	}
	public boolean isSteeringWheel() {
		return hasSteeringWheel;
	}
	public void setSteeringWheel(boolean steeringWheel) {
		this.hasSteeringWheel = steeringWheel;
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

	public int getDoorsNumber() {
		return doorsNumber;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	protected void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	public void speedUp(int speed) {
		if(!engine)
			System.out.println("Please, start the car before accelerating!");
		else if(this.currentSpeed == this.maximumSpeed)
			System.out.println("It wasn't possible to accelerate because the vehicle is already at maximum speed!");
		else if((this.currentSpeed + speed) > this.maximumSpeed) {
			int speedIncreased = (this.currentSpeed + speed) - this.maximumSpeed;
			this.setCurrentSpeed(this.currentSpeed + speedIncreased);
			System.out.println("It only possible to increase the speed by " + speedIncreased + " in order to avoid exceeding the maximum speed!");
		}
		else {
			System.out.println("Speeding up... Current Speed: " + currentSpeed);
			this.setCurrentSpeed(this.currentSpeed + speed); 
		}
	}
	
	public void speedDown(int speed) { 
		if(this.currentSpeed == 0)
			System.out.println("It's not possible to decrease the speed as the vehicle is already stopped!");
		else if(this.currentSpeed < speed) {
			System.out.println("Stopping the vehicle...");
			this.setCurrentSpeed(0);
		}
		else {
			System.out.println("Slowing down... Current Speed: " + currentSpeed);
			this.setCurrentSpeed(this.currentSpeed - speed);
		}
	}	
		
	public void addPassenger() {
		if(!this.isMaxPassengerReached()) {
			System.out.println("Adding the passenger... Total: " + passengersNumber);
			this.setPassengersNumber(passengersNumber += 1); 
		}
		else {
			System.out.println("Vehicle has already reached maximum passenger capacity!");
		}
	}	

	public void removePassenger() {
		if(passengersNumber == 0)
			System.out.println("The vehicle has no passengers!");
		else {
			System.out.println("Leaving the passenger...");
			this.setPassengersNumber(passengersNumber -= 1);
		}
	}
	
	protected boolean isMaxPassengerReached() { 
		if(this.passengersNumber == this.maxPassengers)
			return true;
		
		return false;
	}
	
	public void startEngine() {
		if(engine)
			System.out.println("The engine is already running!");
		else {
			System.out.println("Starting the engine...");
			this.engine = true;
		}
	} 
	
	public void stopEngine() {
		if(!engine)
			System.out.println("The engine is already running!");
		else {
			System.out.println("Stoping the engine...");
			this.engine = true;
		}
	}
	
	public void upgradeSpeed(int additionalSpeed) {
		this.maximumSpeed += additionalSpeed; 
	}
	
	@Override
	public String toString() {
	    return  "Vehicle: " + this.getClass().getSimpleName() + "\n" + 
	    		"Engine started: " + engine + "\n" +
	            "Has Steering Wheel: " + hasSteeringWheel + "\n" +
	            "Cargo Capacity: " + cargoCapacity + "\n" +
	            "Passengers Number: " + passengersNumber + "\n" +
	            "Wheels Number: " + wheelsNumber + "\n" +
	            "Doors Number: " + doorsNumber + "\n" +
	            "For Cargo: " + forCargo + "\n" +
	            "Fuel: " + fuel + "\n" +
	            "Maximum Speed: " + maximumSpeed + "\n" +
	            "Max Passengers: " + maxPassengers + "\n" +
	            "Current Speed: " + currentSpeed;
	}
}
