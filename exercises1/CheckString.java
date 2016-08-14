package exercises1;
	//exercise 4.22

import java.util.*;



public class CheckString {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		//new scanner
		input = new Scanner (System.in);
		
		// receive input
		System.out.println("Please enter string s1: ");
		String s1 = input.nextLine();
		
		System.out.println("Please enter string s2: ");
		String s2 = input.nextLine();
		
		//compare strings
		s1.compareTo(s2);
		
		//
		if (s1.contains(s2))
		System.out.println(s2 + " is a substring of " + s1);
		
		else {
			System.out.println(s2 + " is not a substring of " + s1);
		}
	
		
		

		// TODO Auto-generated method stub

	}

}
