package exercises2;
//exercise 3.12

import java.util.Scanner;

public class Palindrome3_12 {

	private static Scanner input;
	
	public static void main(String[] args) {
	
		//new scanner
		input = new Scanner (System.in);
		
		//receive input
		System.out.println("Please enter a three-digit integer");
		
		int num1, num2 = 0;
		
		int rev = 0;
		
		num1 = input.nextInt();		
		
		int n = num1;
		
		while (num1 !=  0 )   //reverse num1
	{
		num2= num1 % 10;
		rev = rev * 10 + num2;
		num1 = num1 /10;
		}
		
		
	
		System.out.println(n == rev ?"Integer is a palindrome" : "Integer is not a palindrome   " +rev);
		
		
	
	
	
	

	 
	
	}
	
		
	}
			

	


