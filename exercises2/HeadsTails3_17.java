package exercises2;
//exercise 3.17

import java.util.*;

public class HeadsTails3_17 {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		//new Scanner
		input = new Scanner (System.in);
		
		System.out.println("Enter 0 for heads or 1 for tails");
		
		int answer = input.nextInt();
		
		double coin =  Math.random();
		

	
		System.out.println(coin < .5 ? " The coin shows Heads! Try again.." : "The coin shows Tails! Try again..");
		
		
	
	}

}
