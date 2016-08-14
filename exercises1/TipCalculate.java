package exercises1;
	//exercise 2.5
import java.util.Scanner;


public class TipCalculate {
	
	// new scanner
	private static Scanner input;
	
		
	public static void main(String[] args) {
		input = new Scanner (System.in);
		
		// receive input
		System.out.println( "Please enter subtotal:");
		double subtotal = input.nextDouble();
		
		System.out.println( "Please enter percent of gratuity:");
		double gratuity = input.nextDouble();
		
		//calculate tip
		double tip = (gratuity/100.00 * subtotal);
		
		// list tip and total
		System.out.println("Gratuity is $ " + tip);
		System.out.println("Total is $" + (subtotal + tip));
		

	}

}
