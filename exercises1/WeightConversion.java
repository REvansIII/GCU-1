package exercises1;
	//exercise 2.4

import java.util.Scanner;

public class WeightConversion {

	//create new scanner
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner (System.in);
		
		//receive input
		System.out.println(  "Please enter an amount in pounds:");
		double pounds= input.nextDouble();
		
		double kilograms= (int) (pounds * 0.454);
		
		System.out.println(pounds  + "  pounds is equal to " + kilograms + " kilograms");
		
		


	}

}