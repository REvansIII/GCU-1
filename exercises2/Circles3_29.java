package exercises2;
//exercise 3.29

import java.util.Scanner;


public class Circles3_29 {
 
	private static Scanner input;
	
	public static void main(String[] args) {
		
		//new scanner 
		input = new Scanner (System.in);
		
		
		//receive input
		System.out.println("Please enter the coordinates (x, y) and radius of Circle 1:  ");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();
		
		System.out.println("Please enter the coordinates (x, y) and radius of Circle 2:  ");
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();
		
		
	double distance = Math.sqrt(  ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1))  );                                    	
	
	if (distance <= Math.abs(radius1 - radius2)){
		System.out.println(" Circle 2 inside Circle 1");
		}
	else if (distance <= radius1 + radius2){
		System.out.println(" Circle 2 overlaps Circle 1");
		}
	
	else 
		System.out.println("Circles do not overlap");

	}

}
