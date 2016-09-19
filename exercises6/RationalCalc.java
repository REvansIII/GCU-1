/**(Create a rational-number calculator)Write a program similar to Listing 7.9, 
 * Calculator.java. Instead of using integers, use rationals, as shown in Figure 13.10a.
 *  You will need to use the split method in the String class, introduced in Section 10.10.3,
 *   Replacing and Splitting Strings, to retrieve the numerator string and denominator string, 
 *   and convert strings into integers using the Integer.parseIntmethod. 
 * 
 */
package exercises6;
// exercise 13.16

/**
 * @author Robbie
 *
 */
public class RationalCalc {

	public static void main(String[] args) {
		    Rational result = new Rational(0, 1);

		    if (args.length != 1) {
		      System.out.println(
		        "Usage: java RationalCalc \"operand1 operator operand2\"");
		      System.exit(1);
		    }

		    String[] tokens = args[0].split(" ");

		    switch (tokens[1].charAt(0)) {
		      case '+': result = getRational(tokens[0]).add(getRational(tokens[2]));
		      break;
		      case '-': result = getRational(tokens[0]).subtract(getRational(tokens[2]));
		      break;
		      case '*': result = getRational(tokens[0]).multiply(getRational(tokens[2]));
		      break;
		      case '/': result = getRational(tokens[0]).divide(getRational(tokens[2]));
		    }

		    System.out.println(tokens[0] + " " + tokens[1] + " " + tokens[2] + " = " + result);
		  }

		  static Rational getRational(String s) {
		    String[] st = s.split("/");
		    int numer = Integer.parseInt(st[0]);
		    int denom = Integer.parseInt(st[1]); 
		    return new Rational(numer, denom);
		  }
		}

		