package exercises1;
	//exercise 1.13
public class Cramer1 {

	public static void main(String[] args) {
		System.out.println("Applying the Cramer Rule to the linear equation system");
		System.out.println("3.4x + 50.2y = 44.5");
		System.out.println("2.1x + .55y = 5.9");
		System.out.println("yields a result of");
		
		System.out.println("x=");
		System.out.println(	((44.5*.55) - (50.2*5.9)) / ((3.4*.55) - (50.2*2.1)) );
		
		System.out.println("y=");
		System.out.println(  ((3.4*5.9) - (44.5*2.1)) / ((3.4*.55) - (50.2*2.1)) );		
		
		
		

	}

}
