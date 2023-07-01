package control;

import java.util.LinkedList;
import java.util.Scanner;

import entities.*;
import views.Menu;

public class VehiclesControl {

	public static LinkedList<Vehicle> vehicles = new LinkedList<>();
	
	public static void ListAllVehicles() {
		int index = 0;
		if(vehicles.size() > 0) {
			for(Vehicle v : vehicles){
				System.out.println("------------------------------");
				System.out.println("{" + index + "} \n" + v);
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
				AddBicycle(sc);
				Menu.Principal();
				break;
			}

			case 2: {
				System.out.println("Adding a new Motorcycle...");
				AddMotorcycle(sc);
				Menu.Principal();
				break;
			}

			case 3: {
				System.out.println("Adding a new Carriage...");
				AddCarriage(sc);
				Menu.Principal();
				break;
			}

			case 4: {
				System.out.println("Adding a new Truck...");
				AddTruck(sc);
				break;
			}

			case 5: {
				System.out.println("Adding a new Car...");
				AddCar(sc);
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

	public static void AddBicycle(Scanner sc) {

		try {

			System.out.print("Is the bicycle for cargo (y/n)? ");
			String replyforCargo = sc.next();
			boolean forCargo = (replyforCargo == "y") ? true : false;

			double cargoCapacity;
			if (forCargo) {
				System.out.print("Qual a capacidade de carga? ");
				cargoCapacity = sc.nextDouble();
			} else
				cargoCapacity = 0;

			System.out.print("What is the bicycle maximum speed? ");
			int maximumSpeed = sc.nextInt();

			System.out.print("Is the bicycle eletric (y/n)? ");
			String replyIsElectric = sc.nextLine();
			boolean isEletric = (replyIsElectric == "y") ? true : false;

			System.out.print("What is the bicycle maximum passengers? ");
			int maxPassenger = sc.nextInt();

			System.out.print("Has the bicycle luggage (y/n)? ");
			String replyHasLuggage = sc.nextLine();
			boolean hasLuggage = (replyHasLuggage == "y") ? true : false;

			Biclycle bicycle = new Biclycle(cargoCapacity, forCargo, maximumSpeed, isEletric, maxPassenger, hasLuggage);

			vehicles.add(bicycle);

		} catch (Exception e) {
			System.out.println("Something went wrong! Restarting...");
			AddBicycle(sc);
		}
	}

	public static void AddMotorcycle(Scanner sc) {

		try {
			System.out.print("Is the motocycle for cargo (y/n)? ");
			String replyforCargo = sc.next();
			boolean forCargo = (replyforCargo == "y") ? true : false;

			double cargoCapacity;
			if (forCargo) {
				System.out.print("What is the load capacity? ");
				cargoCapacity = sc.nextDouble();
			} else
				cargoCapacity = 0;

			System.out.print("What is the motocycle maximum speed? ");
			int maximumSpeed = sc.nextInt();

			System.out.print("What is the motocycle maximum passengers? ");
			int maxPassenger = sc.nextInt();

			System.out.print("What is the motocycle wheels number? ");
			int wheelsNumber = sc.nextInt();

			System.out.print("Has the motocycle an eletric start (y/n)? ");
			String replyHasEletricStart = sc.nextLine();
			boolean hasEletricStart = (replyHasEletricStart == "y") ? true : false;

			System.out.print("What is the motocycle fuel? ");
			ShowAvailableFuels();
			String fuel = sc.nextLine();

			Vehicle motorcycle = new Motorcycle(cargoCapacity, wheelsNumber, forCargo, new Fuel(fuel.toLowerCase()),
					maximumSpeed, maxPassenger, hasEletricStart);

			vehicles.add(motorcycle);
		} catch (Exception e) {
			System.out.println("Something went wrong! Restarting...");
			AddMotorcycle(sc);
		}

	}

	public static void AddCarriage(Scanner sc) {

		try {
			System.out.print("Is the carriage for cargo (y/n)? ");
			String replyforCargo = sc.next();
			boolean forCargo = (replyforCargo == "y") ? true : false;

			double cargoCapacity;
			if (forCargo) {
				System.out.print("What is the load capacity? ");
				cargoCapacity = sc.nextDouble();
			} else
				cargoCapacity = 0;

			System.out.print("What is the carriage maximum speed? ");
			int maximumSpeed = sc.nextInt();

			System.out.println("What is the carriage doors number");
			int doorsNumber = sc.nextInt();

			System.out.print("What is the carriage maximum passengers? ");
			int maxPassenger = sc.nextInt();

			System.out.print("What is the carriage wheels number? ");
			int wheelsNumber = sc.nextInt();

			Vehicle carriage = new Carriage(cargoCapacity, wheelsNumber, forCargo, maximumSpeed, doorsNumber,
					maxPassenger);

			vehicles.add(carriage);

		} catch (Exception e) {
			System.out.println("Something went wrong! Restarting...");
			AddCarriage(sc);
		}
	}

	public static void AddCar(Scanner sc) {

		try {
			System.out.print("Is the car for cargo (y/n)? ");
			String replyforCargo = sc.next();
			boolean forCargo = (replyforCargo == "y") ? true : false;

			double cargoCapacity;
			if (forCargo) {
				System.out.print("What is the load capacity? ");
				cargoCapacity = sc.nextDouble();
			} else
				cargoCapacity = 0;

			System.out.print("What is the car maximum speed? ");
			int maximumSpeed = sc.nextInt();

			System.out.print("What is the car doors number? ");
			int doorsNumber = sc.nextInt();

			System.out.print("What is the car maximum passengers? ");
			int maxPassenger = sc.nextInt();

			System.out.print("What is the car wheels number? ");
			int wheelsNumber = sc.nextInt();
			sc.nextLine();

			System.out.print("What is the car fuel? ");
			ShowAvailableFuels();
			String fuel = sc.nextLine();

			System.out.print("Has the car air conditioning (y/n)? ");
			String replyHasAirConditioning = sc.nextLine();
			boolean hasAirConditioning = (replyHasAirConditioning == "y") ? true : false;

			Vehicle car = new Car(cargoCapacity, wheelsNumber, forCargo, new Fuel(fuel.toLowerCase()), maximumSpeed,
					doorsNumber, maxPassenger, hasAirConditioning);

			vehicles.add(car);

		} catch (Exception e) {
			System.out.println("Something went wrong! Restarting...");
			AddCar(sc);
		}

	}

	public static void AddTruck(Scanner sc) {

		try {
			System.out.print("Is the truck for cargo (y/n)? ");
			String replyforCargo = sc.next(); 
			boolean forCargo = (replyforCargo == "y") ? true : false;

			double cargoCapacity;
			if (forCargo) {
				System.out.print("What is the load capacity? ");
				cargoCapacity = sc.nextDouble();
			} else
				cargoCapacity = 0;

			System.out.print("What is the truck maximum speed? ");
			int maximumSpeed = sc.nextInt();

			System.out.print("What is the truck doors number? ");
			int doorsNumber = sc.nextInt();

			System.out.print("What is the truck maximum passengers? ");
			int maxPassenger = sc.nextInt();

			System.out.print("What is the truck wheels number? ");
			int wheelsNumber = sc.nextInt();

			sc.nextLine();
			System.out.print("What is the truck fuel?");
			ShowAvailableFuels();
			String fuel = sc.nextLine();

			System.out.print("How many axles does the truck have? (y/n)");
			int axlesNumber = sc.nextInt();

			Vehicle truck = new Truck(cargoCapacity, wheelsNumber, forCargo, new Fuel(fuel.toLowerCase()), maximumSpeed,
					axlesNumber, doorsNumber, maxPassenger);

			vehicles.add(truck);
		} catch (Exception e) {
			System.out.println("Something went wrong! Restarting...");
			AddTruck(sc);
		}

	}
}
