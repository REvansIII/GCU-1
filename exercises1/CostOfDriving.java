package exercises1;
	//exercise 2.23
import java.util.Scanner;


public class CostOfDriving {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		// new scanner
		input = new Scanner (System.in);
		
		//receive input
		System.out.println("Please enter distance in miles: ");
		double distance = input.nextDouble();
		
		System.out.println("Please enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.println("Please enter cost per gallon in dollars e.g. 1.00: ");
		double costPerGallon = input.nextDouble();
		
		// calculate cost of driving
		double costOfDriving = ( (distance/milesPerGallon) * costPerGallon);
		
		System.out.println("The cost of driving is $  " + costOfDriving);

		
	
		

	}

}
