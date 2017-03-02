package view;

import player.Player;

public class View {

	//Start menu
	public void startMenu(){
		System.out.println("Welcome!");
		System.out.println("Select game mode:");
		System.out.println("[1] 2 player local machine");
		System.out.println("[2] 2 player LAN (Coming soon!)");
	}
	
	public void gameModeSelected(String event){
		System.out.println(event);
	}
	public void enterName(String player){
		System.out.println(player + ", " + "please enter your name");
	}

	public void welcome(String playerName){
		System.out.println("Welcome " + playerName + "!");
	}
	
	public void selectClass(String playerName){
		System.out.println(playerName + ", " + "please select your class");
		System.out.println("[1]Warrior      [2]Rogue     [3]Warlock");
		System.out.println("[4]Priest       [5]Mage");
	}
	
	public void confirmationScreen(Player player1, Player player2){
		System.out.println("Are you sure with your setup?");
		System.out.println(player1.getName() + "		" + player2.getName());
		System.out.println(player1.getPlayerCharacter().getName() + "        " + player2.getPlayerCharacter().getName());
		System.out.println("[Y] Yes		[N] No");
	}
	
}