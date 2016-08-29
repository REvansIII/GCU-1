package exercises3;
//exercise 6.2
import java.util.Scanner;

public class PalindromeInt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a three digit integer");
		int number1 = input.nextInt(); 	
		
		int n1 = reverse(number1);
		
		System.out.println("The reverse of "+ number1 + " is " +n1);
		
		boolean n2 = isPalindrome(number1);
		
		System.out.println(n2);
	}
		


	// Return the reversal of an integer, i.e., reverse(456) returns 654 
	public static int reverse (int number1) {
		int rev = 0;	
		int number2 = 0;
		
		while (number1 !=  0 ) {  //reverse 
		
		number2 = number1 % 10;
		rev = rev * 10 + number2;
		number1 = number1 /10;
			}
		return rev; 
	}
	


	// Return true if number is a palindrome
	public static boolean isPalindrome(int number1) {
		int n1 = reverse(number1);
		
		if (n1 == number1)
			return true;
		else
			return false;
		
		
		
					}
		 }
		
	
		

	


