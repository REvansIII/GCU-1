package exercises2;
//exercise 9.7

import java.util.*;

public class Exercise9_7 {

	private static Scanner input;
	
	public static void main(String[] args) {
	//new scanner
	 input = new Scanner (System.in);

	 Account account = new Account(1122, 20000);
	 account.setAnnualRate(.045);

	 
class Account {
	
private int id=  0;
private double balance = 0;
private double annualRate= 0;
private Date dateCreated;

Account (){
	dateCreated = new Date();
}

Account(int id, double balance) {
	this.id = id;
	this.balance = balance;
	
}

//accessor & mutator for id, balance, annualInterest
public int getId(){
	return id;			
}
public void setId(int id){  //check for error runtime
	this.id = id;
	}

public double getBalance(){
	return balance;	
}
public void setBalance(double balance){
	this.balance = balance;	
}

public double getAnnualRate(){
	return annualRate;	
}

public void setAnnualRate(double annualRate){
	this.annualRate = annualRate;	
}

public Date dateCreated(){
	return dateCreated;	
}
public double getMonthlyRate(){
	return annualRate/ 12;
}

public double getMonthlyInterest(){
	return balance * (annualRate/100)/ 12;
}

public void withdrawls(double withdrawls){
	balance -= withdrawls;
}

public void deposits(double deposits){
	balance += deposits;
}



}


	





		
	}

	
	
}
