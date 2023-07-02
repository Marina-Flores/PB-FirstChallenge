package control;

import java.util.Scanner;

import entities.*;
import views.Menu;

public class VehicleManagement {

	public static void Control(int index, Scanner sc) {
		Vehicle vehicle = VehiclesControl.vehicles.get(index);
		
		if (vehicle != null) {
			boolean isVehicleWithDoor = vehicle instanceof VehicleWithDoor;
			VehicleWithDoor vehicleWithDoor = isVehicleWithDoor ? (VehicleWithDoor) vehicle : null; 

			System.out.println("Choose one of these events to do: ");
			ShowVehiclesEvents();

			if (isVehicleWithDoor) 
				ShowVehiclesWithDoorsEvents();				
									
			short choice = 0;		
			do{
				System.out.print("What you want to do? ");
				choice = sc.nextShort();

				switch(choice){
					case 1:
						vehicle.startEngine();
						break;
					case 2:
						vehicle.stopEngine();
						break;	
					case 3:
						System.out.println("Enter the speed you want to accelerate: ");
						int increment = sc.nextInt();
						vehicle.speedUp(increment);
						break;	
					case 4:
						System.out.println("Enter the speed you want to brake: ");
						int decrement = sc.nextInt();
						vehicle.speedDown(decrement);
						break;
					case 5:
						vehicle.addPassenger();
						break;		
					case 6:
						vehicle.removePassenger();
						break;	
					case 7:
						System.out.println("Enter the value you want to increase the maximum speed: ");
						int upgrade = sc.nextInt();
						vehicle.upgradeSpeed(upgrade);
						break;	
					case 8:
						if(isVehicleWithDoor) {
							System.out.println("How many doors do you want to open?");
							int doorsOpened = sc.nextInt();
							vehicleWithDoor.openDoor(doorsOpened);
						}												
						break;	
					case 9:
						if(isVehicleWithDoor) {
						System.out.println("How many doors do you want to close?");
						int doorsClosed = sc.nextInt();
						vehicleWithDoor.closeDoor(doorsClosed);
						}
						break;	
					case 10:
						if(isVehicleWithDoor) 
							vehicleWithDoor.lockDoors();
						break;	
					case 11:
						if(isVehicleWithDoor) 
							vehicleWithDoor.unlockDoors();
						break;	
					case 0:
						Menu.Principal();
						break;
					default:
						Menu.Principal();
						break;
				}
			}while(choice != 0); 			
		}
	}

	public static void ShowVehiclesEvents() {
		System.out.println("0 - Exit");
		System.out.println("1 - Start Engine");
		System.out.println("2 - Stop Engine");
		System.out.println("3 - Speed Up");
		System.out.println("4 - Speed Down");
		System.out.println("5 - Add Passenger");
		System.out.println("6 - Remove Passenger");
		System.out.println("7 - Upgrade Speed");
	}

	public static void ShowVehiclesWithDoorsEvents() {
		System.out.println("8 - Open Doors");
		System.out.println("9 - Close Doors");
		System.out.println("10 - Lock Doors");
		System.out.println("11 - Unlock Doors");
	}
}
