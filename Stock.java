package exercises2;

public class Stock {

	String name;
	String symbol;
	double ChangePercent;
	double previousClosingPrice;
    double currentPrice;
	double change = previousClosingPrice - currentPrice;
	
	
	public static void main(String[] args) {
		Stock stock1 = new Stock("Oracle", "ORCL");
		stock1.setcurrentPrice(34.35);
		stock1.setpreviousClosingPrice(34.50);
		stock1.getChangePercent();
		
		System.out.println("The symbol for " + stock1.name+ " is " + stock1.symbol);
		System.out.println("The current price is $" + stock1.currentPrice+ " after previously closing at "+ stock1.previousClosingPrice);
		System.out.println("A percentage change of " + stock1.ChangePercent);
	}

	

	public Stock(String name, String symbol) {
		this.name = name;
		this.symbol = symbol;

	}

	void setpreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	void setcurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	double getChangePercent() {
		ChangePercent = ( currentPrice- previousClosingPrice)  / (previousClosingPrice)  * 100;
			return ChangePercent;
	}
	
	double getcurrentPrice(){
		return currentPrice;
	}
	double getpreviousClosingPrice(){
		return previousClosingPrice;
	}
	
	
	
	
}

