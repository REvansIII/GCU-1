package timeConversion2;

//Time Conversion 2 

/* Write a program that will prompt the user to enter a time in a decimal format
and print the amount of hours and minutes from the value entered.  Example, user 
enters 4.5 and application parses to 4 hours and 30 minutes.*/

import java.util.*;
import java.text.*;



public class FormatTime2 {

	public static void main(String[] args) {
		// new scanner
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter amount of time in decimal form: ");
		
		double time = input.nextDouble();
		
		int x = (int) (time);
		int y = (int)((time * 60) % 60);
		
		System.out.printf("%s hours and %s minutes", x, y);
		
	
		
	}

}
