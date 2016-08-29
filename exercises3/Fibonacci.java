package exercises3;
//exercise 18.2

import java.util.Scanner;

/*  (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.Hint: To compute fib(n) without recursion,
 *  you need to obtain fib(n - 2)andfib(n - 1) first. Let f0 and f1 denote the two previous Fibonacci numbers. 
 *   Write a test program that prompts the user to enter an index and displays its Fibonacci number.    */
public class Fibonacci {

	public static void main(String[] args) {
		// new scanner
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number 1 - 10");

		int n = input.nextInt();

		System.out.println("Fibonacci number at index " + n + " is " + fib(n));

	}

	public static int fib(int n) {
		int f0 = 0;
		int f1 = 0;
		int currentFib = 0;

		for (int i = 1; i <= n; i++) {
			currentFib = f0 + f1;
			f0 = f1;
			f1 = currentFib;
		}

		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else
			return fib(n - 1) + fib(n - 2);
	}

}
