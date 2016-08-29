package exercises3;
//exercise 4.23

import java.util.*;

public class Payroll4_23 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee's name:  ");		
		System.out.println("Enter number of hours worked:  ");
		System.out.println("Enter hourly pay rate:  ");
		System.out.println("Enter Federal Tax Witholding:  ");
		System.out.println("Enter State Tax Witholding:  ");
		
		String name = input.nextLine();
		double hours = input.nextDouble();
		double rate = input.nextDouble();
		double fed =  input.nextDouble();
		double state = input.nextDouble();
		double gross = (hours *rate);
		
		System.out.println("Employee name: " + name);
		System.out.println("Hours worked: " + hours);
		System.out.printf("Hourly Pay Rate $%4.2f\n" , rate);
		System.out.println("Federal Tax Witholding:" + fed );
		System.out.println("State Tax Witholding: " + state);
		
		
		System.out.printf("Grosspay $%7.2f\n " , gross);
		System.out.println("Deductions: ");
		System.out.println("Federal Withholding " + "("+  fed +  ") " + (fed * gross));
		System.out.println("State Tax Witholding " + "("+ state + ") " + (state * gross));
		System.out.printf("Netpay $%7.2f\n " , ((gross - (fed * gross) - (state * gross))));
		
	}

}
