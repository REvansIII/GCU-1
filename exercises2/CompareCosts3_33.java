package exercises2;
//exercise 3.33

import java.util.Scanner;


public class CompareCosts3_33 {

	private static Scanner input;
	
	public static void main(String[] args) {
		// new scanner
		input = new Scanner (System.in);
		
		//receive input
		
		System.out.println("Please enter the weight and price of package 1 :");
		double w1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		System.out.println("Please enter the weight and price of package 2 :");
		double w2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		
		double c1 = w1 / price1;
		double c2 = w2 / price2;
		
		if (c1 == c2)
			System.out.println("Packages have equal price");
		if (c1 < c2)
			System.out.println("Package 1 has the better price" + " @ " +  c1  + " versus " + c2 + " per unit");
		else if (c2 < c1) 
			System.out.println("Package 2 has the better price" + " @ " + c1  + " versus " + c2 + " per unit ");
		
		

	}

}
