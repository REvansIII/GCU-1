package draft;

//Milestone Assignment 2
public abstract class NFLPlayer implements Celebrator {
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

	public static void main(String[] args) {

	}

	
	public NFLPlayer(String aname, int anumber) {
		aname = name;
		anumber= number;
	}

		
	// set height for player class
	public void setHeight(String aheight) {
		aheight = height;
	}

	//get height for player
	String getHeight(){
		return height;
	}
	
	
	// set player weight
	public void setWeight(int aweight) {
		aweight= weight;
	}

	//get player weight
	int getWeight(){
		return weight;
	}
	
	
	// set player position
	public void setPosition(String aposition) {
		aposition = position;
	}

	//get player position
	String getPosition(){
		return position;
	}
	
	
	// set  yards per game
	public void setYards(double yards1) {
		yards1= yards;
	}
	
	//get yards per game
	double getYards(){
		return yards / 16;
	}
	
	
	// set player touchdowns
	public void setTouchdowns(int touchdowns1) {
		touchdowns1= touchdowns;
	}

	//get player touchdowns
	int getTouchdowns(){
		return touchdowns;
	}
	
	
	// player college attended
	public void setCollege(String acollege) {
		acollege= college;
	}

	String getCollege(){
		return college;
	}
	
	
	// player 40 yard dash time
	public void setFortyYardTime(double fortyyardtime1) {
		fortyyardtime1 = fortyyardtime;
	}

	//get player 40 time
	double getFortyYardTime(){
		return fortyyardtime;
	}
	
	
	// player vertical jump
	public void setVerticalJump(double verticaljump1) {
		verticaljump1 = verticaljump;
	}
	
	//get vertical jump
	double getVerticalJump(){
		return verticaljump;
	}
	
	public String toString(){
		return "NFL PLAYER";
	}
}
