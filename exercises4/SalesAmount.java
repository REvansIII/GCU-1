package exercises4;
//exercise 5.39

import java.util.*;

public class SalesAmount {

	static double salesAmt;
	static double goal;
	
	public static void main(String[] args) {
		
		//new scanner
		Scanner input = new Scanner(System.in);
		
		// input
		System.out.println("Please enter desired commission");
		
		goal= input.nextDouble();
		
		
		if (goal <= 5000){
			salesAmt = goal /.08;
		}
		if (goal>5000  &&  goal<= 10000){
			salesAmt = ((goal - 5000) / .10) + (5000 / .08);
		}
			else if (goal>10000){
				salesAmt = ((goal - 10000)/.12) + (5000 / .10) + (5000 / .08);
				
			}
		System.out.println("Minimum sales to reach desired commission");
		System.out.printf("%-18.2f", salesAmt);
	
	
	input.close();
	}
	}

