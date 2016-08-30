package nflProject;

import java.util.Arrays;

/*method should be called during instantiation, inside the constructor. *****Create a class called 
 PlayerManager.*****The class should hold an array of players and have a class method called CreatePlayers. 
This method will create the players that will be available to be drafted and store them on the player’s array.*/                                            


public class PlayerManage {

	public static void main(String[] args) {
		
		
		String[] player = new String[7];
		
		PlayerManage pm =new PlayerManage();
		
		PlayerManage.CreatePlayer(player);
		
		
	}

	
	public static void CreatePlayer(String player[]){
		player [0]= "             NFL PLAYERS AVAILABLE FOR DRAFT";
		player [1]= "Cardale Jones, #7, 6ft 5in, 250lbs, Quarterback, 245yds, 1TD, Ohio State, 4.81s 40yd dash, 36in verticle jump ";
		player [2]= "Paxton Lynch, #12, 6ft 7in, 244lbs, Quarterback, 187yds, 2TD, Memphis, 4.86s 40yd dash, 36in verticle jump";
		player [3]= "Alex Erickson, #12, 6ft, 195lbs, Wide Receiver, 1yd, 1TD, Wisconsin, combine stats unavailable";
		player [4]= "Charone Peake, #17, 6ft2in, 209lbs, Wide Receiver, 77yds, 1TD, Clemson, 4.45s 40yd dash, 35.5in verticle jump";
		player [5]= "Cody Kessler, #5, 6ft1in, 215lbs, Quarterback, 25yds, 1TD, USC, 4.89s 40yd dash, 29.5in verticle jump";
		player [6]= "Mike Bercovici, #6, 6ft, 204lbs, Quarterback, 154yds, 0TD, Arizona St., combine stats unavailable";
		
			int i =0;
			for ( i=0; i<player.length; i++)
				
			System.out.println(player[i]);
			
		}
		
		
	}





