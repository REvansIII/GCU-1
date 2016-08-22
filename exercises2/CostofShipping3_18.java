package exercises2;
//exercise 3.18

import java.util.Scanner;


public class CostofShipping3_18 {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		//new scanner
		input = new Scanner (System.in);
		
		//receive input
		System.out.println("Please enter the weight of the package in pounds");
		
		double weight, cost = 0;
		
		weight = input.nextDouble();
		
		if (0 < weight && weight <= 1.0)
			cost = 3.50;
		else if (1<weight && weight <=3.0)
			cost = 5.50;
		else if (3<weight && weight <=10.0)
			cost = 8.50;
		else if (10<weight && weight <=20.0)
			cost= 10.50;
		
		System.out.println("$ " + cost);
		
		
		if (weight>=50)
			System.out.print("Package cannot be shipped..");
			}
		    
	
		
	}


