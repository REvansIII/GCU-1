package exercises5;
//exercise 11.3
import java.util.*;

public class SubAccountsMain {

	public static void main(String[] args) {
		Checking checking = new Checking("John Doe", 1234, 2500);
		Savings savings = new Savings("Jane Doe", 4321, 1500);
		System.out.println(checking.toString());
		System.out.println(savings.toString());
	}

}

class Savings extends Account{
	
	private String name;
	private int id;
	private Date dateCreated;


	public Savings(String name, int id, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		dateCreated = new java.util.Date();
	}
	
	
	 @Override
	  public String toString() {
	    return "Savings Account created on " + dateCreated;
	  }
}


class Checking extends Account{
	
	
	private int id;
	private String name;
	private Date dateCreated;
	public Checking(String name, int id, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		dateCreated = new java.util.Date();
	}
	
	void withdraw(){
		if (balance <= 0){
			System.out.println("You do not have sufficient funds");
			}
		}
	 @Override
	  public String toString() {
	    return "Checking Account created on  " + dateCreated ;
	  }
}
