package exercises3;

import java.util.Scanner;

//exercise 6.18

/*   (Check password) Some websites impose certain rules for passwords. Write a method that checks whether a 
 * string is a valid password. Suppose the password rules are as follows: ** A password must have at least eight
 *  characters. ** A password consists of only letters and digits.  **A password must contain at least two digits.
 *  Write a program that prompts the user to enter a password and displays ValidPassword if the rules are followed 
 *  or Invalid Password otherwise.         */

public class Password {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// receive input
		System.out.println("Please enter a password");
		String pass = input.nextLine();

		if (chkPassword(pass)) {
			System.out.println("Password is valid");
		} else {
			System.out.println("Password is invalid");
		}
	}

	public static boolean chkPassword(String password) {
		boolean chkPassword = true;
		if (password.length() < 8) {
			chkPassword = false;
		} 
		else {
			int num = 0;
			for (int x = 0; x < password.length(); x++) {
				if (password.charAt(x) >= 47 && password.charAt(x)<=58 || (password.charAt(x)) >= 64 && (password.charAt(x)<= 91 ||
					(password.charAt(x) >= 97 && (password.charAt(x) <= 122))));
					else {
						chkPassword = false; 
						}
				if (password.charAt(x) > 47 && (password.charAt(x) < 58) ){
					num++;
					}
				}
					if (num < 2) {
					chkPassword = false;
				}
			}
		
	
		return chkPassword;
}

}
