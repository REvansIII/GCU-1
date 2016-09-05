package exercises4;
//exercise 10.8

public class Tax {
	public final static int SINGLE_FILER = 1;
	public final static int MARRIED_JOINTLY = 2;
	public final static int MARRIED_SEPARATELY = 3;
	public final static int HEAD_OF_HOUSEHOLD = 4;

	private int filingStatus = SINGLE_FILER;

	private int[][] brackets = { { 27050, 65550, 136750, 297350 }, // Single
			{ 45200, 109250, 166500, 297350 }, // Married jointly or qual widower
			{ 22600, 54625, 83250, 148675 }, // Married separate
			{ 36250, 93650, 151650, 297350 } // HOH
	};

	private double[] rates = { 0.15, 0.275, 0.305, 0.355, 0.391 };
	private double taxableIncome = 100000;

	public Tax() {
	}

	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}

	public void setBrackets(int[][] brackets) {
		this.brackets = brackets;
	}

	public void setRates(double[] rates) {
		this.rates = rates;
	}

	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
	
	public double getTaxableIncome() {
		return taxableIncome;
	}

	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}

	public int getFilingStatus() {
		return filingStatus;
	}	

	public double findTax() {
		double tax = 0;

		// Compute tax first bracket
		if (taxableIncome <= brackets[filingStatus][0])
			return tax = taxableIncome * rates[0];
		else
			tax = brackets[filingStatus][0] * rates[0];

		int i;

		// Compute tax middle brackets
		for (i = 1; i < brackets[0].length; i++) {
			if (taxableIncome > brackets[filingStatus][i])
				tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i];
			else {
				tax += (taxableIncome - brackets[filingStatus][i - 1]) * rates[i];
				break;
			}
		}

		// Compute tax final bracket
		if (i == brackets[0].length && taxableIncome > brackets[filingStatus][i - 1])
			tax += (taxableIncome - brackets[filingStatus][i - 1]) * rates[i];

		return tax;
	}
}
