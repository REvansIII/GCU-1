package exercises4;

public class TestBMI {

	public static void main(String[] args) {
		BMI bmi1 = new BMI("Kim Jang", 18, 145, 5, 10);
		System.out.println("BMI for " + bmi1.getName()+" is "+ bmi1.getBMI()+
				" " + bmi1.getStatus());
		
		BMI bmi2 = new BMI("Susan King", 215, 5, 10);
		System.out.println("BMI for " + bmi2.getName()+" is "+ bmi2.getBMI()+
				" " + bmi2.getStatus());
	}

}
