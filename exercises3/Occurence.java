package exercises3;
//exercise 18.10

import java.util.Scanner;

/*  Write a recursive method that finds the number 
 * of occurrences of a specified letter in a string using the following method header... 
 *  For example, count("Welcome", 'e') returns 2. Write a test program that prompts the user
 *   to enter a string and a character, and displays the number of occurrences for the character in the string.                          */

public class Occurence {

	public static void main(String[] args) {
		// new scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word");
		System.out.println("Please enter a letter");

		String str = input.next();
		char a = (char) input.nextInt();
		
		Occurence occ = new Occurence();
		System.out.println(str + Occurence.count(str, a));
		
		
	}

	public static int count(String str, char a){
		int counter = 0;
			for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == 'a'){
					counter++;}
	
			}
			return a;
	}}
