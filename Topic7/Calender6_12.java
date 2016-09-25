package exercises6;
// exercise 13.4

import java.util.*;

public class Calender6_12 {
	static MyCalendar calendar = new MyCalendar();

	public static void main(String[] args) {
		int month = calendar.get(MyCalendar.MONTH) + 1;
		int year = calendar.get(MyCalendar.YEAR);

		if (args.length > 2)
			System.out.println("Usage java Calendar6_12 month year");
		else if (args.length == 2) {

			// use user month and year
			year = Integer.parseInt(args[1]);
			month = Integer.parseInt(args[0]);

			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, month - 1);
		} else if (args.length == 1) {

			// use user month for the current year
			month = Integer.parseInt(args[0]);

			calendar.set(Calendar.MONTH, month - 1);
		}

		// set date to the first day in a month
		calendar.set(Calendar.DATE, 1);

		// print calendar month
		printMonth(year, month);
	}

	static void printMonth(int year, int month) {
		// get start day
		int startDay = getStartDay();

		// get number of days in the month
		int numOfDaysInMonth = calendar.daysInMonth();

		// print heading
		printMonthTitle(year, month);

		// print body
		printMonthBody(startDay, numOfDaysInMonth);
	}

	static int getStartDay() {
		return calendar.get(Calendar.DAY_OF_WEEK);
	}

	static void printMonthBody(int startDay, int numOfDaysInMonth) {
		// print padding space before the first day of the month
		int i = 0;

		for (i = 0; i < startDay - 1; i++)
			System.out.print("    ");

		for (i = 1; i <= numOfDaysInMonth; i++) {
			if (i < 10)
				System.out.print("   " + i);
			else
				System.out.print("  " + i);

			if ((i + startDay - 1) % 7 == 0)
				System.out.println();
		}

		System.out.println("");
	}

	static void printMonthTitle(int year, int month) {
		System.out.println("         " + calendar.getMonthName() + ", " + year);
		System.out.println("******************************");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
}
