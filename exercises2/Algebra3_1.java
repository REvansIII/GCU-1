package exercises2;

	//exercise 3.1

import java.util.Scanner;

public class Algebra3_1 {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		
	//new scanner
		input = new Scanner (System.in);
	
		
		//receive input
	System.out.println("Please enter a  b  c : ");	
	
		//
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	
	double d, d1, r1, r2;
	
	d = (b*b) - (4*a*c);
	d1 = Math.sqrt(d) ; //establish discriminant
	
	r1 = (-b + d1) / (2*a);
	
	r2 = (-b - d1) / (2*a);
	
	
	if (d1 > 0){
		System.out.println(" Equation has two roots ");
		System.out.println(r1);
		System.out.println(r2);
		}
    
	if (d1 == 0) {
		System.out.println(" Equation has one root ");
		System.out.println(r1);
		
    }
	
	else
		System.out.println("Equation has no real roots");
		
	
	
	}

}
