package draft;
//Milestone Assignment 2
 public class NFLPlayer {
 
	public static void main(String[] args ) {
		// create objects via constructor
	
class Player {
	String name;
	int number;
	String height;
	int weight;
	String position;
	double yards;
	int touchdowns;
	String college;
	double fortyyardtime;
	double verticaljump;
	
	//assign constructor to player class

public Player(String name, int number){
	this.name = name;
	this.number = number;
	}
	
	//set height for player class
public void setHeight(String height){
	this.height = height;	
}
	// get player height
public String getHeight(){
	return height;	
}
	// set player height
public void setWeight(int weight){
	this.weight =weight;
}
	// get player weight
public int getWeight(){
	return weight;	
}
	// set player position
public void setPosition(String position){
	this.position = position;	
}
	// get player position
public String getPosition() {
	return position;
}	
	//set accumulated yards
public void setYards(double yards){
	this.yards =yards;	
}
	// get accumulated yards
public double getYards(){
	return yards;
}
	// set player touchdowns
public void setTouchdowns(int touchdowns){
	this.touchdowns = touchdowns;
}
	// get player touchdowns
public int getTouchdowns(){
	return touchdowns;
}
	// set player college attended
public void setCollege(String college){
	this.college = college;	
}
	// get player college attended
public String getCollege(){
	return college;
}
	// set player 40 yard dash time
public void setFortyYardTime(double fortyyardtime){
	this.fortyyardtime = fortyyardtime;
}
	// get player 40 yard dash time
public double getFortyYardTime(){
	return fortyyardtime;
}

public void setVerticalJump(double verticaljump) {
	this.verticaljump = verticaljump;
}

public double getVerticalJump(){
	return verticaljump;
}

	// Print player information
public void printPlayer(){
	System.out.println(" " + name +  " # " + number);
	System.out.println("Height " + height);
	System.out.println("Weight " + weight );
	System.out.println("Position " + position);
	System.out.println("Yards " + yards);
	System.out.println("Touchdowns " + touchdowns);
	System.out.println("College "+ college);
	System.out.println("40-yard Dash Time " + fortyyardtime + " secs ");
	System.out.println("Vertical Jump " + verticaljump + " inches");
	
	
}

}
Player playerOne = new Player ("Cardale Jones " , 7 ); 
Player playerTwo = new Player ("Paxton Lynch ", 12);
Player playerThree = new Player ("Alex Erickson ", 12);
Player playerFour = new Player ("Charone Peake ", 17);

 // methods 
playerOne.setHeight("6-5");
playerOne.setWeight(250);
playerOne.setPosition("Quarterback");
playerOne.setYards(245);
playerOne.setTouchdowns(1);
playerOne.setCollege("Ohio State");
playerOne.setFortyYardTime(4.81);
playerOne.setVerticalJump(36);
playerOne.printPlayer();

playerTwo.setHeight("6-7");
playerTwo.setWeight(244);
playerTwo.setPosition("Quarterback");
playerTwo.setYards(187);
playerTwo.setTouchdowns(2);
playerTwo.setCollege("Memphis");
playerTwo.setFortyYardTime(4.86);
playerTwo.setVerticalJump(36);
playerTwo.printPlayer();

playerThree.setHeight("6-0");
playerThree.setWeight(195);
playerThree.setPosition("Wide Receiver");
playerThree.setYards(1);
playerThree.setTouchdowns(1);
playerThree.setCollege("Wisconsin");
playerThree.setFortyYardTime(0);
playerThree.setVerticalJump(0);
playerThree.printPlayer();

playerFour.setHeight("6-2");
playerFour.setWeight(209);
playerFour.setPosition("Wide Receiver");
playerFour.setYards(77);
playerFour.setTouchdowns(1);
playerFour.setCollege("Clemson");
playerFour.setFortyYardTime(4.45);
playerFour.setVerticalJump(35.5);
playerFour.printPlayer();

}}
	
