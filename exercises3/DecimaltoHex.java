package exercises3;
//exercise 4.11



import java.util.*;

public class DecimaltoHex {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an integer between 0 and 15");
		
		int decimal = input.nextInt();
		
	
		String str = Integer.toHexString(decimal);
	      System.out.println("Hex value is "+str);
	      
	      
	      
	}
	}


