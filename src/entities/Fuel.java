package entities;

public class Fuel {
	
	public Fuel(String fuelType) {
		setFuel(fuelType);
	}	
	
	private boolean gasoline;
	private boolean ethanol;
	private boolean diesel;
	private boolean electricity;
	private boolean human;
	private boolean animal;
	
	public void setFuel(String fuelType) {
		
		switch (fuelType) {
		case "gasoline":
			this.gasoline = true;
			this.ethanol = false;
			this.diesel = false; 
			this.electricity = false;
			this.human = false; 
			this.animal = false; 			
			break;
			
		case "ethanol":
			this.gasoline = false;
			this.ethanol = true;
			this.diesel = false; 
			this.electricity = false;
			this.human = false; 
			this.animal = false; 			
			break;
		
		case "diesel":
			this.gasoline = false;
			this.ethanol = false;
			this.diesel = true; 
			this.electricity = false;
			this.human = false; 
			this.animal = false; 			
			break;
		
		case "electricity":
			this.gasoline = false;
			this.ethanol = false;
			this.diesel = false; 
			this.electricity = true;
			this.human = false; 
			this.animal = false; 			
			break;
		
		case "human":
			this.gasoline = false;
			this.ethanol = false;
			this.diesel = false; 
			this.electricity = false;
			this.human = true; 
			this.animal = false; 			
			break;	

		case "animal":
			this.gasoline = false;
			this.ethanol = false;
			this.diesel = false; 
			this.electricity = false;
			this.human = false; 
			this.animal = true; 			
			break;
		
		default:
			throw new IllegalArgumentException("Fuel type not found! :(");
		}
	}
	
	public boolean isGasoline() {
		return gasoline;
	}
	public void setGasoline() {
		setFuel("gasoline");
	}
	public boolean isEthanol() {
		return ethanol;
	}
	public void setEthanol() {
		setFuel("ethanol");
	}
	public boolean isDiesel() {
		return diesel;
	}
	public void setDiesel() {
		setFuel("diesel");
	}
	public boolean isElectricity() {
		return electricity;
	}
	public void setElectricity() {
		setFuel("electricity");
	}
	public boolean isHuman() {
		return human;
	}
	public void setHuman() {
		setFuel("human");
	}
	public boolean isAnimal() {
		return animal;
	}
	public void setAnimal() {
		setFuel("animal");
	}
	
	@Override
	public String toString() {
	    
	    if (gasoline) {
	        return "Gasoline";
	    }
	    if (ethanol) {
	        return "Ethanol";
	    }
	    if (diesel) {
	        return "Diesel";
	    }
	    if (electricity) {
	        return "Electricity";
	    }
	    if (human) {
	        return "Human";
	    }
	    if (animal) {
	        return "Animal";
	    }
	    return "";
	}

}
