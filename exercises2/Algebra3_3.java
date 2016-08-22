package exercises2;

//exercise 3.3

import java.util.Scanner;

public class Algebra3_3 {
 
	private static Scanner input;
	
	public static void main(String[] args) {
	
		//new scanner
		input = new Scanner (System.in);
		
		// receive input
		System.out.println(" Please enter values for a, b, c, d, e, and f");

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		
		
		double cramer1, cramer2, cramer3, x , y;
		
		cramer1 = (e*d) - (b*f);
		
		cramer2 = (a*f) - (e*c);
		
		cramer3 = (a*d) - (b*c);
		
		
		x= cramer1/cramer3;
		y= cramer2/cramer3;
		
		
		if (cramer3 == 0) {
			System.out.println(" Equation has no solution ");
			
		}
		else
			System.out.println(" x = " + x  + " y = " + y);
	
		
	
	}

}
