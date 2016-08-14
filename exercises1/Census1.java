package exercises1;
	//exercise 1.11
public class Census1 {

	public static void main(String[] args) {
		int PresentPopulation= 312032486;
		int AnnualSeconds = 31536000; //assign number of seconds in a year
		int bpy= AnnualSeconds/7; //assign number of births per year @ 1 birth per 7 seconds
		int dpy= AnnualSeconds/13; //assign number of deaths per year @ 1 death per 13 seconds
		int ipy= AnnualSeconds/45; //assign number of immigrants per year @ 1 immigrant per 45 seconds
		
		System.out.println("According to the U.S. Census Bureau the present population is");
		System.out.println(PresentPopulation);
		System.out.println("At the present rate of growth, in five years the population will reach");
		System.out.println(bpy * 5 - dpy * 5 + ipy * 5 + PresentPopulation);
	
		

	}

}
