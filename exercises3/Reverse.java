package exercises3;

import java.util.Scanner;

//exercise 18.9
/* (Print the characters in a string reversely) Write a recursive method that displays a string reversely
 *  on the console using the following header: *** public static void reverseDisplay(String value) ***  
 *  For example, reverseDisplay("abcd") displays dcba. Write a test program that prompts the user to enter
 *   a string and displays its reversal. */
 
public class Reverse {

	public static void main(String[] args) {
		// new scanner
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter four letters");
		String str = input.next();
		
		Reverse rev =new Reverse();
		System.out.println("The reverse of " + str+ " is " + rev.reverseDisplay(str));
				
	}	
	public static String reverseDisplay(String str){  // I had difficulty negotiating the use of a void value here.
	
			if ((str == null)|| (str.length()<=1))
				return str;
		
			return reverseDisplay(str.substring(1)) + str.charAt(0);
			}
			}
	  
	  


