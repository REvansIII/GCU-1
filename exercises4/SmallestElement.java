package exercises4;

//exercise 7.9

class SmallestElement {
	
	
	
	public static double min(double[] array) {
		double [] numbers = new double[10];
	
	double max = 0;
	double indexOfMax= 0;

		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i]) {
				
				max= numbers[i];
				indexOfMax = i;
}		
		
		}
		return indexOfMax;
		
}
}