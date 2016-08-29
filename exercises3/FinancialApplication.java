package exercises3;

//exercise 6.7

import java.util.Scanner;

public class FinancialApplication {

	public static void main(String[] args) {
		// new scanner
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter initial investment: ");
		System.out.println("Please enter interest rate i.e. .09 for 9%: ");

		double investmentAmount = input.nextDouble();
		double InterestRate = input.nextDouble();
		double monthlyInterestRate = InterestRate / 12;

		System.out.println("Year     " + "Value");
		int years = 0;

		for (years = 0; years<= 30; years++)
			
		if (years == 30) break;

			System.out.printf("%2d  %10.2f\n" ,years ,
					futureInvestmentValue(investmentAmount, monthlyInterestRate, years));

	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {

		double future = investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12.00));

		return future;

	}
}
