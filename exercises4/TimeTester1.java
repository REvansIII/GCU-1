package exercises4;


public class TimeTester1 {

	public static void main(String[] args) {
		Time time1 = new Time(0);
		System.out.println(time1.toString());

		Time time2 = new Time(555550000);
		time1.setTime(555550000);
		System.out.println(time2.toString());
	}

}
