package exercises1;
	//exercise 4.17


import java.util.Scanner;



public class DaysInMonth {

	
	private static Scanner input; 
	
	public static void main(String[] args) {
		
		//new scanner
		input = new Scanner (System.in);
		
		//receive input
		System.out.println("Please enter year");
		int year = input.nextInt();
		
		System.out.println("Please enter month (e.g. Jan, Feb, etc.) ");
		String month = input.next();
		
		int days = 0;
		 
		//  Parts of following code courtesy of http://docs.oracle.com/javase/7/docs/technotes/guides/language/strings-switch.html and http://coding111.blogspot.com
		  switch (month) {
		  case "Feb":
		   if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		    days = 29;
		    break;
		   }
		   days = 28;
		   break;
		 
		  case "Apr":
		  case "Jun":
		  case "Sep":
		  case "Nov":
		   days = 30;
		   break;
		 
		  case "Jan":
		  case "Mar":
		  case "May":
		  case "Jul":
		  case "Aug":
		  case "Oct":
		  case "Dec":
		   days = 31;
		   break;
		 
		  default:
		   System.out.println("Invalid month.");
		   System.exit(0);
		 
		  }
		 
		  System.out.println(month + " " + year + " has " + days + "");
	}
	}
