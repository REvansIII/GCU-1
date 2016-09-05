package exercises4;

import java.util.*;

public class TestSmallestElement {
	
	
	
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		 double [] numbers = new double[10];
		
		System.out.println("Please enter 10 numbers");
		
		for (int i=0; i < numbers.length; i++){
			numbers [i] = input.nextDouble();
		}
		
		System.out.println("The minimum value is" + SmallestElement.min(numbers) );

		
	}	
	
	

}
