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
	
	public void battleInitiation(String playerName){
		System.out.println(playerName + " goes first!");
	}
	
	public void displayStatus(String player1Name, String player2Name, 
							  String player1Class, String player2Class, 
							  int player1HP, int player2HP,
							  int player1Mana, int player2Mana){
		
		System.out.println(player1Name + " (" + player1Class + ") "+ "			" + player2Name + " (" + player2Class + ")");
		System.out.println(player1HP + " HP" + "			" + player2HP + " HP");
		System.out.println(player1Mana + " Mana" + "			" + player2Mana + " Mana");
		System.out.println("");
	}
	
	public void displaySkills(String[] skillNames, String playerName, String[] skillDescription){
		for(int i = 0; i < 5; i++){
			System.out.println("[" + (i + 1) + "]" + " " + skillNames[i] + "		" + skillDescription[i]);
		}
		System.out.println(playerName + ", " + "Choose your move: ");
	}
	
	public void displayAttackLog(String attackingPlayerName, String skillUsed, String defendingPlayerName, int damage){
		System.out.println(attackingPlayerName + " used " + skillUsed + "!");
		System.out.println(defendingPlayerName + " takes " + damage + " damage!");
		System.out.println("");
	}
		
	public void displayHealingLog(String playerName, String skillUsed, int healing){
		System.out.println(playerName + " used " + skillUsed + "!");
		System.out.println(playerName + " healed " + healing + "HP!");
		System.out.println("");
	}
	
	public void notEnoughMana(){
		System.out.println("Not enough mana!");
		System.out.println("Choose your move: ");
		System.out.println("");
	}
	
	public void playerWin(String playerName){
		System.out.println("Game over");
		System.out.println(playerName + " wins!");
	}
	
	public void upkeep(String player1Name, String player2Name, int player1ManaRegen, int player2ManaRegen){
		System.out.println(player1Name + " regenerated " + player1ManaRegen + " mana from upkeep");
		System.out.println(player2Name + " regenerated " + player2ManaRegen + " mana from upkeep");
	}
	

}