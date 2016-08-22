package exercises2;
//exercise 3.5

import java.util.Scanner;


public class FutureDates3_5 {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		
		//new scanner
		input= new Scanner (System.in);
		
		//receive input
		System.out.println(" Please enter today's day: Sun=0, Mon=1 etc.");
			int day = input.nextInt();
	
		System.out.println(" Please enter number of days from today for future day");
			int futureDay = input.nextInt();
		
			
		if (day == 0)
			System.out.println(" The day is Sunday");
	    if (day == 1)
			System.out.println(" The day is Monday");
	    if (day == 2)
			System.out.println(" The day is Tuesday");
	    if (day == 3)
			System.out.println(" The day is Wednesday");
		if (day == 4)
			System.out.println(" The day is Thursday");
		if (day == 5)
			System.out.println(" The day is Friday");
	    if (day == 6)
			System.out.println(" The day is Saturday");
	    
	    
	    int i = day + futureDay % 7; //calculate future day
	    
	    
	    if (i == 0) 
	    	System.out.println(" The future day is Sunday");
	    if (i == 1)
	    	System.out.println(" The future day is Monday");
	    if (i == 2)
	    	System.out.println(" The future day is Tuesday");
	    if (i == 3)
	    	System.out.println(" The future day is Wednesday");
	    if (i == 4)
	    	System.out.println(" The future day is Thursday");
	    if (i == 5)
	    	System.out.println(" The future day is Friday");
	    if (i == 6)
	    	System.out.println(" The future day is Saturday");
	    
	    	
  
  
  }
	} 
	
	

