package control;

import java.util.LinkedList;
import java.util.Scanner;

import entities.*;
import views.Menu;

public class VehiclesControl {

	public static LinkedList<Vehicle> vehicles = new LinkedList<>();
	
	public static void ListAllVehicles() {
		int index = 1;
		if(vehicles.size() > 0) {
			for(Vehicle v : vehicles){
				System.out.println("------------------------------");
				System.out.println("		{" + index + "} \n" + v);
				System.out.println("------------------------------");			
			}
		}
		else {
			System.out.println("There are no registered vehicles.");
		}		
	}

	public static void ShowAvailableVehicles() {
		System.out.println("Choose one of the available vahicles: ");

		System.out.println("1 - Bicycle");
		System.out.println("2 - Motorcycle");
		System.out.println("3 - Carriage");
		System.out.println("4 - Truck");
		System.out.println("5 - Car");
		System.out.println("0 - Back");

		System.out.print("Your choice: ");
	}

	public static void ShowAvailableFuels() {
		System.out.println("Choose one of the available fuel: ");

		System.out.println("Gasoline");
		System.out.println("Ethanol");
		System.out.println("Diesel");
		System.out.println("Eletricity");

		System.out.print("Your choice: ");
	}

	public static void AddVehicle(Scanner sc) {

		short opcao = 50;
		do {
			ShowAvailableVehicles();

			opcao = sc.nextShort();

			switch (opcao) {

			case 1: {
				System.out.println("Adding a new bicycle...");
				InsertVehicle.AddBicycle(sc);
				Menu.Principal();
				break;
			}

			case 2: {
				System.out.println("Adding a new Motorcycle...");
				InsertVehicle.AddMotorcycle(sc);
				Menu.Principal();
				break;
			}

			case 3: {
				System.out.println("Adding a new Carriage...");
				InsertVehicle.AddCarriage(sc);
				Menu.Principal();
				break;
			}

			case 4: {
				System.out.println("Adding a new Truck...");
				InsertVehicle.AddTruck(sc);
				break;
			}

			case 5: {
				System.out.println("Adding a new Car...");
				InsertVehicle.AddCar(sc);
				Menu.Principal();
				break;
			}
			default: {
				System.out.print("Invalid option! Try again: ");
				opcao = sc.nextShort();
			}
			}
		} while (opcao != 0);
	}	
	
	public static void ControlVehicle(Scanner sc) {
		System.out.println("Enter the number of the vehicle to control. Check the list to verify the number.");
		System.out.print("Vehicle number: ");
		int number = sc.nextInt();
		
		if(number < 1 || number > vehicles.size())
			System.out.println("That vehicle doesn't exist");
		else
			VehicleManagement.Control(number-1, sc);
	}
}
