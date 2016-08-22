package exercises2;
//exercise 3.26

import java.util.Scanner;

public class Divisible3_26 {
 
	private static Scanner input;
	
	public static void main(String[] args) {
		
		// new scanner
		input = new Scanner (System.in);
		//receive input
		System.out.println("Enter an integer: ");
		
		int num1 = input.nextInt();
		
		
System.out.println("Is " + num1 + " divisible by 5 and 6? ");

System.out.println(num1 % 5 == 0 && num1 % 6 == 0 ?  "True" : "False.");


System.out.println("Is " + num1 + " divisible by 5 or 6?  ");	

System.out.println(num1 % 5 == 0 || num1 % 6 == 0 ? "True" : "False.");


System.out.println(" Is " + num1 + " divisible by 5 or 6, but not both? ");

System.out.println(num1 % 5 == 0 ^ num1 % 6 == 0 ?  "True" : "False.");
	}

}
