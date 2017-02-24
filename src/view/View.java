package view;

import player.Player;

public class View {

	//Start menu
	public void startMenu(){
		System.out.println("Welcome!");
		System.out.println("Select game mode:");
		System.out.println("[1] Single player");
		System.out.println("[2] Multiplyer (Coming soon!)");
	}
	
	//Displays when single player is selected
	//Prompts for user input for name
	public void singeplayerSelected(){
		System.out.println("Single player selected");
		System.out.println("Please enter your name: ");
	}
	
	//Displays after player enters name
	//calls display classes
	public void welcomeSinglePlayer(String name){
		System.out.println("Welcome "+ name + " !");
		displayClasses();
	}
	
	//Displays available classes
	public void displayClasses(){
		System.out.println("Choose your class");
		System.out.println("[1]Warrior      [2]Thief     [3]Black Mage");
		System.out.println("[6]White Mage   [5]Monk      [7]Red Mage");
	}
	
	//Displays after character class is chosen
	public void displayChosenClass(String choice, String event){
		System.out.println("You have chosen " + choice + " " + " to be your " + event);
	}
	
	//Displays choices for AI
	public void chooseAIClass(String event){
		System.out.println("Choose your " + event + " class");
		displayClasses();
	}
	
	//Confirmation Screen
	public void confirmationScreen(Player player1, Player player2, Player player3, Player player4){
		System.out.println("Are you sure with your setup?");
		System.out.println("Team 1             Team 2");
		System.out.println(player1.getName() + "    " + player3.getName());
		System.out.println(player1.getPlayerCharacter().getName() + "     " + player3.getPlayerCharacter().getName());
		System.out.println();
		System.out.println(player2.getName() + "     " + player4.getName());
		System.out.println(player2.getPlayerCharacter().getName() + "    " + player4.getPlayerCharacter().getName());
		System.out.println();
		System.out.println("[Y] Yes      [N] No");
	}
}