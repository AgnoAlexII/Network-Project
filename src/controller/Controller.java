package controller;

import java.util.Scanner;

import Classes.Monk;
import Classes.Thief;
import Classes.Warrior;
import Classes.blackMage;
import Classes.redMage;
import Classes.whiteMage;
import player.Player;
import view.View;

public class Controller {

	private View view = new View();
	private Player player1 = new Player();
	private Player player2 = new Player();
	private Player player3 = new Player();
	private Player player4 = new Player();
	private Scanner sc = new Scanner(System.in);
	
	public void startGame(){
		view.startMenu();
		gameModeSelect();
	}
	
	public void gameModeSelect(){
		switch(sc.nextLine()){
		
		case "1": view.singeplayerSelected();
				  selectionAlgorithm();
				  //enterName();
				  break;
		default: System.out.println("Wrong choice!");
		}
	}
	
	public void enterName(){
		player1.setName(sc.nextLine());
		view.welcomeSinglePlayer(player1.getName());
		//selectPlayerClass();
	}
	
	public void selectPlayerClass(Player player){
		switch(sc.next()){
		
		case "1": player.setPlayerCharacter(new Warrior("Warrior"));
				  break;
		case "2": player.setPlayerCharacter(new Thief("Thief"));
				  break;
		case "3": player.setPlayerCharacter(new blackMage("Black Mage"));
				  break;
		case "4": player.setPlayerCharacter(new Monk("Monk"));
				  break;
		case "5": player.setPlayerCharacter(new redMage("Red Mage"));
		  		  break;
		case "6": player.setPlayerCharacter(new whiteMage("White Mage"));
		  		  break;
		}
	}
	
	public void selectPlayer1Class(){
		
		selectPlayerClass(player1);
		view.displayChosenClass("to play as a", player1.getPlayerCharacter().getName());
		view.chooseAIClass("partner's");
		selectPlayer2Class();
	}
	
	public void selectPlayer2Class(){
		
		selectPlayerClass(player2);
		player2.setName("Player 2 (Default)");
		view.displayChosenClass(player2.getPlayerCharacter().getName(), "partner!");
		view.chooseAIClass("first enemy's");
		selectPlayer3Class();
	}
	
	public void selectPlayer3Class(){
		
		selectPlayerClass(player3);
		player3.setName("Player 3 (Default)");
		view.displayChosenClass(player3.getPlayerCharacter().getName(), "first enemy!");
		view.chooseAIClass("second enemy's");
		selectPlayer4Class();
	}
	
	public void selectPlayer4Class(){
		
		selectPlayerClass(player4);		
		player4.setName("Player 4 (Default)");
		view.displayChosenClass(player4.getPlayerCharacter().getName(), "second enemy!");
	}
	
	public boolean confirm(){
		view.confirmationScreen(player1, player2, player3, player4);
		switch(sc.nextLine()){
			case "Y": return true;					 
			case "N": return false;
			default: return false;
		}
	}
	
	public void selectionAlgorithm(){
		
		do{
			enterName();
			selectPlayer1Class();
		}while(confirm() != true);
	}
}