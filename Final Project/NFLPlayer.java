package draft;

import java.util.ArrayList;

//Milestone Assignment 2
public abstract class NFLPlayer implements Celebrator {
	private String name;
	private int number;
	private String height;
	private int weight;
	private String position;
	private double yards;
	private int touchdowns;
	private static String college;
	private double fortyyardtime;
	private double verticaljump;


	
	public NFLPlayer(String aname, int anumber) {
		aname = name;
		anumber= number;
	}

		
	// set height for player class
	public void setHeight(String aheight) {
		aheight = height;
	}

	//get height for player
	public String getHeight(){
		return height;
	}
	
	
	// set player weight
	public void setWeight(int aweight) {
		aweight= weight;
	}

	//get player weight
	public int getWeight(){
		return weight;
	}
	
	
	// set player position
	public void setPosition(String aposition) {
		aposition = position;
	}

	//get player position
	public String getPosition(){
		return position;
	}
	
	
	// set  yards per game
	public void setYards(double yards1) {
		yards1= yards;
	}
	
	//get yards per game
	public double getYards(){
		return yards / 16;
	}
	
	
	// set player touchdowns
	public void setTouchdowns(int touchdowns1) {
		touchdowns1= touchdowns;
	}

	//get player touchdowns
	public int getTouchdowns(){
		return touchdowns;
	}
	
	
	// player college attended
	public void setCollege(String acollege) {
		acollege= college;
	}

	public String getCollege(){
		return college;
	}
	
	
	// player 40 yard dash time
	public void setFortyYardTime(double fortyyardtime1) {
		fortyyardtime1 = fortyyardtime;
	}

	//get player 40 time
	public double getFortyYardTime(){
		return fortyyardtime;
	}
	
	
	// player vertical jump
	public void setVerticalJump(double verticaljump1) {
		verticaljump1 = getVerticaljump();
	}
	
	//get vertical jump
	public double getVerticalJump(){
		return getVerticaljump();
	}
	
	@Override
	public String toString(){
		return "NFL PLAYER";
	}


	public double getVerticaljump() {
		return verticaljump;
	}


	public void setVerticaljump(double verticaljump) {
		this.verticaljump = verticaljump;
	}


}
