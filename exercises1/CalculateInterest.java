package exercises1;
	//exercise 2.20

import java.util.Scanner;

		
public class CalculateInterest {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		// new scanner
		input =  new Scanner (System.in);
		
		//receive input
		System.out.println("Please enter balance: ");
		double balance = input.nextDouble();
		
		System.out.println("Please enter interest rate e.g 3 for 3%: ");
		double annualInterestRate = input.nextDouble();
		
		//calculate monthly interest
		double monthlyInterest = (balance) * (annualInterestRate/1200); 
		
		System.out.println("Monthly interest amount is " + monthlyInterest);
		
		

	}

}
