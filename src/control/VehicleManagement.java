package control;

import java.util.Scanner;

import entities.*;

public class VehicleManagement {

	public static void Control(int index, Scanner sc) {
		Vehicle vehicle = VehiclesControl.vehicles.get(index);

		if (vehicle != null) {
			System.out.println("Choose one of the event to do: ");
			ShowVehiclesEvents();

			if (vehicle instanceof VehicleWithDoor)
				ShowVehiclesWithDoorsEvents();
			
			System.out.print("Your choice: ");
			int choice = sc.nextInt();
		}
	}

	public static void ShowVehiclesEvents() {
		System.out.println("1 - Start Engine");
		System.out.println("2 - Stop Engine");
		System.out.println("3 - Speed Up");
		System.out.println("4 - Speed Down");
		System.out.println("5 - Add Passenger");
		System.out.println("6 - Remove Passenger");
		System.out.println("7 - Upgrade Speed");
	}

	public static void ShowVehiclesWithDoorsEvents() {
		System.out.println("7 - Open Doors");
		System.out.println("8 - Close Doors");
		System.out.println("9 - Lock Doors");
		System.out.println("10 - Unlock Doors");
	}
}
