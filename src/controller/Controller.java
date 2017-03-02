package controller;

import java.util.Scanner;

import Classes.Rogue;
import Classes.Warrior;
import Classes.Warlock;
import Classes.Mage;
import Classes.Priest;
import player.Player;
import view.View;

public class Controller {

	private View view = new View();
	private Player player1 = new Player();
	private Player player2 = new Player();
	private Scanner sc = new Scanner(System.in);

	public void start(){
		startGame();
	}
	public void startGame(){
		view.startMenu();
		gameModeSelect();
	}
	
	public void gameModeSelect(){
		switch(sc.next()){
		
		case "1":	view.gameModeSelected("Local game selected!");
					selectionAlgorithm();
					break;
		default:	view.gameModeSelected("Wrong choice!");
		}
	}
	
	public void selectionAlgorithm(){
		do{
			inputPlayerInformation();
		}while(confirm() != true);
	}
	
	public boolean confirm(){
		view.confirmationScreen(player1, player2);
		switch(sc.next().toLowerCase()){
			case "y": return true;					 
			case "n": return false;
			default: return false;
		}
	}
	
	public void inputPlayerInformation(){
		enterName(player1, "Player 1");
		selectClass(player1);
		enterName(player2, "Player 2");
		selectClass(player2);
	}
	
	public void enterName(Player player,String playerNumber){
		view.enterName(playerNumber);
		player.setName(sc.next());
		view.welcome(player.getName());
	}
	
	public void selectClass(Player player){
		view.selectClass(player.getName());
		switch(sc.next()){
		
		case "1": player.setPlayerCharacter(new Warrior("Warrior"));
		  		break;
		case "2": player.setPlayerCharacter(new Rogue("Rogue"));
				break;
		case "3": player.setPlayerCharacter(new Warlock("Warlock"));
		  		break;
		case "4": player.setPlayerCharacter(new Priest("Priest"));
		  		break;
		case "5": player.setPlayerCharacter(new Mage("Mage"));
		  		break;
		}
	}
	
	
}