package exercises3;
//exercise 6.12

/* (Display characters) Write a method that prints characters using the following header:
 * public static void printChars(char ch1, char ch2, int numberPerLine)This method prints
 *  the characters between ch1 and ch2 with the specified numbers per line. Write a test 
 *  program that prints ten characters per line from 1 to Z.Characters are separated by exactly one space. */

public class DisplayChar {

	public static void main(String[] args) {
		printChars('l', 'Z', 10);

	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {

		int numberOfPrinted = 0;

		for (ch1 = 0; ch1 <= ch2; ch1++) {
			System.out.print(ch1 + " ");
			numberOfPrinted++;
			if (numberOfPrinted % numberPerLine == 0)
				System.out.println();

		}

	}

}
