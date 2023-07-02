package views;

import java.util.Scanner;

import control.VehiclesControl;

public class Menu {
	public static void Principal() {
    	Scanner sc = new Scanner(System.in);

		StringBuilder options = new StringBuilder();		
		options.append("+-----------------------------+").append('\n');
		options.append("|        Options Menu         |").append('\n');
		options.append("|-----------------------------|").append('\n');
		options.append("|1 - Add a Vehicle            |").append('\n');
		options.append("|2 - List Vehicles            |").append('\n');
		options.append("|3 - Control Vehicle 	      |").append('\n');
		options.append("-------------------------------").append('\n');
	
		short opcao = 0;		
		do{
			System.out.println(options.toString());		
	    	System.out.print("Enter the number corresponding to the option you wish to perform: ");
			opcao = sc.nextShort();

			switch(opcao){
				case 1:
					System.out.println("\nAdd vehicle option chosen!");	
					VehiclesControl.AddVehicle(sc);
					break;
				case 2:
					System.out.println("\nList vehicle option chosen!");			
					VehiclesControl.ListAllVehicles();
					break;	
				case 3:
					System.out.println("\nControl vehicle option chosen!");
					VehiclesControl.ControlVehicle(sc);
					break;		
				case 0:
					System.out.println("\nCome back anytime!");
					break;
				default:
					Menu.Principal();
					break;
			}
		}while(opcao != 0); 
		
		sc.close();
	}	
	
	
}
