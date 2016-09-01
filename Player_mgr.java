package draft;

/*      
The class should hold an array of players and have a class method called CreatePlayers. 
This method will create the players that will be available to be drafted and store them on the player’s array.
 */

public class Player_mgr {
	
	
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
    
	

	
	
	
	public static void  CreatePlayers(){
	
	}
	public Player_mgr(String name, int number) {
		this.name = name;
		this.number = number;
	}

	// set height
	public void setHeight(String height) {
		this.height = height;
	}

	// get player height
	public String getHeight() {
		return height;
	}

	// set player height
	public void setWeight(int weight) {
		this.weight = weight;
	}

	// get player weight
	public int getWeight() {
		return weight;
	}

	// set player position
	public void setPosition(String position) {
		this.position = position;
	}

	// get player position
	public String getPosition() {
		return position;
	}

	// set accumulated yards
	public void setYards(double yards) {
		this.yards = yards;
	}

	// get accumulated yards
	public double getYards() {
		return yards;
	}

	// set player touchdowns
	public void setTouchdowns(int touchdowns) {
		this.touchdowns = touchdowns;
	}

	// get player touchdowns
	public int getTouchdowns() {
		return touchdowns;
	}

	// set player college attended
	public void setCollege(String college) {
		this.college = college;
	}

	// get player college attended
	public String getCollege() {
		return college;
	}

	// set player 40 yard dash time
	public void setFortyYardTime(double fortyyardtime) {
		this.fortyyardtime = fortyyardtime;
	}

	// get player 40 yard dash time
	public double getFortyYardTime() {
		return fortyyardtime;
	}

	public void setVerticalJump(double verticaljump) {
		this.verticaljump = verticaljump;
	}

	public double getVerticalJump() {
		return verticaljump;
	}

	// Print player information
	public void printPlayer_mgr() {
		System.out.println(" " + name + " # " + number);
		System.out.println("Height " + height);
		System.out.println("Weight " + weight);
		System.out.println("Position " + position);
		System.out.println("Yards " + yards);
		System.out.println("Touchdowns " + touchdowns);
		System.out.println("College " + college);
		System.out.println("40-yard Dash Time " + fortyyardtime + " secs ");
		System.out.println("Vertical Jump " + verticaljump + " inches");
		System.out.println("                         ");

	}
	
	
	public static void main(String[] args) { 	
		
		Player_mgr playerOne = new Player_mgr("Cardale Jones ", 7); 
		Player_mgr playerTwo = new Player_mgr("Paxton Lynch ", 12);
		Player_mgr playerThree = new Player_mgr("Alex Erickson ", 12);
		Player_mgr playerFour = new Player_mgr("Charone Peake ", 17);

		playerOne.setHeight("6-5");
		playerOne.setWeight(250);
		playerOne.setPosition("Quarterback");
		playerOne.setYards(245);
		playerOne.setTouchdowns(1);
		playerOne.setCollege("Ohio State");
		playerOne.setFortyYardTime(4.81);
		playerOne.setVerticalJump(36);
		playerOne.printPlayer_mgr();

		playerTwo.setHeight("6-7");
		playerTwo.setWeight(244);
		playerTwo.setPosition("Quarterback");
		playerTwo.setYards(187);
		playerTwo.setTouchdowns(2);
		playerTwo.setCollege("Memphis");
		playerTwo.setFortyYardTime(4.86);
		playerTwo.setVerticalJump(36);
		playerTwo.printPlayer_mgr();

		playerThree.setHeight("6-0");
		playerThree.setWeight(195);
		playerThree.setPosition("Wide Receiver");
		playerThree.setYards(1);
		playerThree.setTouchdowns(1);
		playerThree.setCollege("Wisconsin");
		playerThree.setFortyYardTime(0);
		playerThree.setVerticalJump(0);
		playerThree.printPlayer_mgr();

		playerFour.setHeight("6-2");
		playerFour.setWeight(209);
		playerFour.setPosition("Wide Receiver");
		playerFour.setYards(77);
		playerFour.setTouchdowns(1);
		playerFour.setCollege("Clemson");
		playerFour.setFortyYardTime(4.45);
		playerFour.setVerticalJump(35.5);
		playerFour.printPlayer_mgr();

		
		
	}

}
