package views;

import java.util.Scanner;

public class Menu {
	public static void Principal() {
    	Scanner sc = new Scanner(System.in);

		StringBuilder opcoes = new StringBuilder();		
		opcoes.append("+-----------------------------+").append('\n');
		opcoes.append("|        Options Menu         |").append('\n');
		opcoes.append("|-----------------------------|").append('\n');
		opcoes.append("|1 - Add a Vehicle            |").append('\n');
		opcoes.append("|2 - List Vehicles            |").append('\n');
		opcoes.append("|3 - Control Vehicle 	      |").append('\n');
		opcoes.append("|0 - Exit             	      |").append('\n');
		opcoes.append("-------------------------------").append('\n');
	
		short opcao = 50;		
		do{
			System.out.println(opcoes.toString());		
	    	System.out.print("Enter the number corresponding to the option you wish to perform: ");
			opcao = sc.nextShort();

			switch(opcao){
				case 1:
					System.out.println("\n Add vehicle option chosen!");	
					break;
				case 2:
					System.out.println("\n Update vehicle option chosen!");			
					break;	
				case 3:
					System.out.println("\n Control vehicle option chosen!");		
					break;				
				case 50:
					System.out.println(opcoes.toString());		
					break;
				case 0:
					System.out.println("\n Come back anytime!");
					break;
				default:
					Menu.Principal();
					break;
			}
		}while(opcao != 0); 
		
		sc.close();
	}	
}
