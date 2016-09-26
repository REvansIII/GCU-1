package draft;

/*      
The class should hold an array of players and have a class method called CreatePlayers. 
This method will create the players that will be available to be drafted and store them on the player’s array.
 */
import java.util.*;

class Player_mgr extends NFLPlayer implements Celebrator {

	public Player_mgr(String aname, int anumber) {
		super(aname, anumber);

	}

	public void CreatePlayer() {

		OffensivePlayer player0 = new OffensivePlayer("Cardale Jones", 7);

		player0.setHeight("6-5");
		player0.setWeight(250);
		player0.setPosition("Quarterback");
		player0.setYards(245);
		player0.setTouchdowns(1);
		player0.setCollege("Ohio State");
		player0.setFortyYardTime(4.81);
		player0.setVerticalJump(36.0);

		OffensivePlayer player1 = new OffensivePlayer("Paxton Lynch", 12);

		player1.setHeight("6-7");
		player1.setWeight(244);
		player1.setPosition("Quarterback");
		player1.setYards(187);
		player1.setTouchdowns(2);
		player1.setCollege("Memphis");
		player1.setFortyYardTime(4.86);
		player1.setVerticalJump(36.0);

		OffensivePlayer player2 = new OffensivePlayer("Alex Erickson", 12);

		player2.setHeight("6-0");
		player2.setWeight(195);
		player2.setPosition("Wide Receiver");
		player2.setReceptions(1);
		player2.setYards(20);
		player2.setTouchdowns(1);
		player2.setCollege("Wisconsin");
		player2.setFortyYardTime(4.86);
		player2.setVerticalJump(36.0);

		OffensivePlayer player3 = new OffensivePlayer("Charone Peake", 17);

		player3.setHeight("6-2");
		player3.setWeight(209);
		player3.setPosition("Wide Receiver");
		player3.setReceptions(1);
		player3.setYards(20);
		player3.setTouchdowns(1);
		player3.setCollege("Clemson");
		player3.setFortyYardTime(4.86);
		player3.setVerticalJump(36.0);

		OffensivePlayer player4 = new OffensivePlayer("Derrick Henry", 2);

		player4.setHeight("6-3");
		player4.setWeight(247);
		player4.setPosition("Runningback");
		player4.setCarries(14);
		player4.setRushingyds(43);
		player4.setYards(93);
		player4.setTouchdowns(1);
		player4.setCollege("Alabama");
		player4.setFortyYardTime(0);
		player4.setVerticalJump(0);

		DefensivePlayer player5 = new DefensivePlayer("Von Miller", 58);

		player5.setHeight("6-3");
		player5.setWeight(250);
		player5.setPosition("Outside Linebacker");
		player5.setTackles(212);
		player5.setfumbleRecover(0);
		player5.setInterceptions(1);
		player5.setSacks(64);
		player5.setCollege("Texas A & M");
		player5.setFortyYardTime(4.53);
		player5.setVerticalJump(37);

		DefensivePlayer player6 = new DefensivePlayer("Frank Clark", 2);

		player6.setHeight("6-3");
		player6.setWeight(260);
		player6.setPosition("Defensive End");
		player6.setTackles(19);
		player6.setfumbleRecover(0);
		player6.setInterceptions(0);
		player6.setSacks(6);
		player6.setCollege("Michigan");
		player6.setFortyYardTime(4.79);
		player6.setVerticalJump(38.5);

		DefensivePlayer player7 = new DefensivePlayer("Marcus Cooper", 41);

		player7.setHeight("6-2");
		player7.setWeight(192);
		player7.setPosition("Defensive Back");
		player7.setTackles(69);
		player7.setfumbleRecover(1);
		player7.setInterceptions(5);
		player7.setSacks(0);
		player7.setCollege("Rutgers");
		player7.setFortyYardTime(0);
		player7.setVerticalJump(0);

		DefensivePlayer player8 = new DefensivePlayer("Will Compton", 51);

		player8.setHeight("6-1");
		player8.setWeight(238);
		player8.setPosition("Inside Linebacker");
		player8.setTackles(101);
		player8.setfumbleRecover(0);
		player8.setInterceptions(1);
		player8.setSacks(1.0);
		player8.setCollege("Nebraska");
		player8.setFortyYardTime(0);
		player8.setVerticalJump(0);

		DefensivePlayer player9 = new DefensivePlayer("Joe Haden", 23);

		player9.setHeight("5-11");
		player9.setWeight(195);
		player9.setPosition("Cornerback");
		player9.setTackles(275);
		player9.setfumbleRecover(4);
		player9.setInterceptions(18);
		player9.setSacks(2);
		player9.setCollege("Florida");
		player9.setFortyYardTime(0);
		player9.setVerticalJump(0);

	}

	@Override
	public void celebrate() {

	}

	@Override
	public void dance() {

	}

	@Override
	public void wave() {

	}

	@Override
	public void backflip() {

	}

	@Override
	public void smiles() {

	}

	public static void main(String[] args) throws Exception {
		OffensivePlayer player0 = new OffensivePlayer("Cardale Jones", 7);
		OffensivePlayer player1 = new OffensivePlayer("Paxton Lynch", 12);
		OffensivePlayer player2 = new OffensivePlayer("Alex Erickson", 12);
		OffensivePlayer player3 = new OffensivePlayer("Charone Peake", 17);
		OffensivePlayer player4 = new OffensivePlayer("Derrick Henry", 2);
		DefensivePlayer player5 = new DefensivePlayer("Von Miller", 58);
		DefensivePlayer player6 = new DefensivePlayer("Frank Clark", 2);
		DefensivePlayer player7 = new DefensivePlayer("Marcus Cooper", 41);
		DefensivePlayer player8 = new DefensivePlayer("Will Compton", 51);
		DefensivePlayer player9 = new DefensivePlayer("Joe Haden", 23);
		
		
		Scanner input = new Scanner(System.in);

		List<String> a = new ArrayList<>();
		a.add("Player 0: Cardale Jones");
		a.add("Player 1: Paxton Lynch");
		a.add("Player 2: Alex Erickson");
		a.add("Player 3: Charone Peake");
		a.add("Player 4: Derrick Henry");
		a.add("Player 5: Von Miller");
		a.add("Player 6: Frank Clark");
		a.add("Player 7: Marcus Cooper");
		a.add("Player 8: Will Compton");
		a.add("Player 9: Joe Haden");

		// List Available Players
		System.out.println("******List of Available Players******");
		System.out.println(a);

		// user input
		System.out.println("Please enter the number of the player you wish to view: ");
		int pick = input.nextInt();

		if (pick < 0 || pick > 9) {
			System.out.println("Invalid Selection, Please try again");
		}

		switch (pick) {

		case 0:
			pick = 0;
			System.out.println(player0.toString());
			break;

		case 1:
			pick = 1;
			System.out.println(player1.toString());
			break;

		case 2:
			pick = 2;
			System.out.println(player2.toString());
			break;

		case 3:
			pick = 3;
			System.out.println(player3.toString());
			break;

		case 4:
			pick = 4;
			System.out.println(player4.toString());
			break;

		case 5:
			pick = 5;
			System.out.println(player5.toString());
			break;

		case 6:
			pick = 6;
			System.out.println(player6.toString());
			break;

		case 7:
			pick = 7;
			System.out.println(player7.toString());
			break;

		case 8:
			pick = 8;
			System.out.println(player8.toString());
			break;

		case 9:
			pick = 9;
			System.out.println(player9.toString());
			break;

		}
		
		//Second List for user selections
		List<NFLPlayer> b= new ArrayList<>();
		
		System.out.println("To select player for draft reenter player number or enter 10 ");
		
		int selection = input.nextInt();
		
		if(selection < 0 || selection > 9 ){
			System.out.println("Invalid selection; please try again");
		}
			
		
		   switch (selection){
			
			case 0: selection = 0;
			System.out.println("You have selected" + b);
			b.add(player0);
			break;
			
			case 1: selection = 1;
			System.out.println("You have selected" + b);
			b.add(player1);
			break;
			
			case 2: selection = 2;
			System.out.println("You have selected" + b);
			b.add(player2);
			break;
			
			case 3: selection = 3;
			System.out.println("You have selected" + b);
			b.add(player3);
			break;
			
			case 4: selection = 4;
			System.out.println("You have selected" + b);
			b.add(player4);
			break;
			
			case 5: selection = 5;
			System.out.println("You have selected" + b);
			b.add(player5);
			break;
			
			case 6: selection = 6;
			System.out.println("You have selected" + b);
			b.add(player6);
			break;
			
			case 7: selection = 7;
			System.out.println("You have selected" + b);
			b.add(player7);
			break;
			
			case 8: selection = 8;
			System.out.println("You have selected" + b);
			b.add(player8);
			break;
			
			case 9: selection = 9;
			System.out.println("You have selected" + b);
			b.add(player9);
			break;
			
			case 10: selection = 10;
			break;
			}
			
			System.out.println("Would you like to select another player? (enter 1 for yes, 0 for no)");
			
			int again = input.nextInt();
			
			if (again < 0 || again > 1){
				 System.out.println("Invalid selection; please try again");
				 
			} 
		
		
		if (again == 0){
			System.out.println("You have selected players " + b );
			System.out.println("Would you like to make remove a player before ending?(enter 1 for yes, 0 for no)");
			int delPlayer = input.nextInt();
			if (delPlayer == 0)
				System.out.println("Thank you for using the NFL Player Application");
				if (delPlayer ==1)
					System.out.println("Enter the number of the Player you would like to remove");
				int removePlayer= input.nextInt();
				b.remove(removePlayer);
				System.out.println("Player has been removed" + b + "\n Thank you for using the NFL Player Application");
			
			}
			 
		
			while (again == 1){
			
			System.out.println(a);
			System.out.println("Please enter the number of the player you wish to select.");
			int pick2 = input.nextInt();
			b.add(pick2, null);
			System.out.println("You have selected" + a.get(pick2));
			System.out.println(b);
			System.out.println("Would you like to make remove a player before exiting?(enter 1 for yes, 0 for no)");
			int delPlayer2 = input.nextInt();
		
			if (delPlayer2 == 0)
				System.out.println("Thank you for using the NFL Player Application");
				if (delPlayer2 ==1)
					System.out.println("Enter the number of the Player you would like to remove");
				int removePlayer2= input.nextInt();
				b.remove(removePlayer2);
				System.out.println("Player has been removed" + b + "\n Thank you for using the NFL Player Application");
			break;
			
			}
			
			
		}

}
