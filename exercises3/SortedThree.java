package exercises3;
//exercise 6.5

import java.util.*;




public class SortedThree {

	public static void main(String[] args) { 
		
		//new Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter three numbers");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		displaySortedNumbers(x, y, z);
		
	}
	
	public static void displaySortedNumbers(double x, double y, double z){
	 
	 if (x>y){
		double temp = x;
		x = y;
		y = temp;
	}
	
	if (y>z){
		double temp = y;
		y = z;
		z= temp;
	}
	
	if (x>y){
		double temp = x;
		x =y;
		y = temp;
	}

	System.out.println(x +""+ y +""+ z);
 }

}


 

