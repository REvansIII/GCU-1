package exercises2;


public class Stock {
 
	public static void main(String[] args) {
		
	}
	
Stock stock = new Stock("ORCL", "ORACLE CORPORATION");
stock.estClosingPrice(34.5)
stock.estCurrentPrice(34.35)		


String name;
String symbol;
double previousClosingPrice;
double currentPrice;
double getChangePercent;

public Stock(String name, String symbol) {
	 this.name = name;
	 this.symbol = symbol;
}
	 
public double estClosingPrice(double previousClosingPrice){
	this.previousClosingPrice = previousClosingPrice;
}

public double estCurrentPrice(double currentPrice){
	this.currentPrice = currentPrice;
	
}

public double getChangePercent(){
		 double increase = previousClosingPrice - currentPrice;
		 return (increase) / (currentPrice * 100);
		
	 }


}

	



