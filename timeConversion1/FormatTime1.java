package timeConversion1;
// Time Conversion 1

import java.text.*;
import java.util.*;

public class FormatTime1 {

	public static void main(String[] args) throws ParseException {
		//new scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an hour in 24 hour time: " );
		
		String time = input.next();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH");
		SimpleDateFormat sdf2= new SimpleDateFormat("hh a");
		java.util.Date dDate = sdf1.parse( time );
		String strOutput = sdf2.format( dDate );
		System.out.println(strOutput);
	}

}
