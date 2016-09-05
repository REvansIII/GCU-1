package exercises4;
//exercise 5.21

import java.util.Scanner;

public class Loans {
	static double loan;
	static int numOfYears;
	static double annualInterestRate= 5.0;
	
	public static void main(String[]args){
	
	
	// New Scanner
	  Scanner input = new Scanner(System.in);
	 
	  // obtain input loan 
	  System.out.print("Enter loan amount in dollars:");
	   loan= input.nextDouble();
	 
	  // Enter term
	  System.out.print("Enter number of years: ");
	   numOfYears = input.nextInt();
	 
	  //   Header
	  System.out.printf("%-18s%-18s%-18s\n", "Interest Rate",
	    "Monthly Payment", "Total Payment");
	 
	  while (annualInterestRate <= 8.0) {
	   // Obtain monthly interest rate
	   double monthlyInterestRate = annualInterestRate / 1200;
	 
	   // Calculate payment
	   double monthlyPayment = loan
	     * monthlyInterestRate
	     / (1 - 1 / Math.pow(1 + monthlyInterestRate,
	       numOfYears * 12));
	   double totalPayment = monthlyPayment * numOfYears * 12;
	 
	   // Display results
	   System.out.printf("%-18.3f%-18.2f%-18.2f\n", annualInterestRate,
	     monthlyPayment, totalPayment);
	 
	   annualInterestRate = annualInterestRate + 1.0 / 8;
	 
input.close();

}

}
}
