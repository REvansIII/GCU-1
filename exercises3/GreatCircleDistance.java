package exercises3;

//exercise 4.2

import java.util.Scanner;

	
public class GreatCircleDistance {
	
	private static Scanner input; 
	
	public static void main(String[] args) {
		
		//new scanner
		input = new Scanner (System.in);
		
		//receive input
		System.out.println("Enter Point 1 in latitude and longitude in degrees (press enter): ");
		double x1 = Math.toRadians(input.nextDouble());
		double y1 = Math.toRadians(input.nextDouble());
		
		System.out.println("Enter Point 2 in latitude and longitude in degrees (press enter): ");
		double x2= Math.toRadians(input.nextDouble());
		double y2= Math.toRadians(input.nextDouble());
		
		//establish radius
		double radius = 6371.01;
		
		//calculate 
		
		double d =  Math.acos(Math.sin(x1)) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2);
	
		d= Math.toDegrees(d);
	    
	    double distance = radius * d;
	    
	    System.out.println("The distance is " + distance);
	
	
	}

}
