package controller;

import java.util.Scanner;

import Classes.Mage;
import Classes.Priest;
import Classes.Rogue;
import Classes.Warlock;
import Classes.Warrior;
import abstractClasses.Entity;
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
		selectionAlgorithm();
		battle();
	}
	
	public void gameModeSelect(){
		int choice;
		do{
			choice = sc.nextInt();
			switch(choice){
		
			case 1:	view.gameModeSelected("Local game selected!");
					break;
			default:	view.gameModeSelected("Wrong choice!");
			}
		}while(choice != 1);
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
		
		case "1": player.setPlayerCharacter(new Warrior());
		  		break;
		case "2": player.setPlayerCharacter(new Rogue());
				break;
		case "3": player.setPlayerCharacter(new Warlock());
		  		break;
		case "4": player.setPlayerCharacter(new Priest());
		  		break;
		case "5": player.setPlayerCharacter(new Mage());
		}
	}
	
	public void battle(){
		view.battleInitiation(player1.getName());
		do{
			battleFlow();
		}while(player1.getPlayerCharacter().getHp() > 0 && player2.getPlayerCharacter().getHp() > 0);
		battleEnd();
	}
	
	public void battleFlow(){
		callDisplayStatus();
		if(player2.getPlayerCharacter().getHp() > 0 && player1.getPlayerCharacter().getHp() > 0){
			getPlayerMove(player1.getPlayerCharacter(), player2.getPlayerCharacter(), player1.getName(), player2.getName());
			upkeep();
			callDisplayStatus();
		}
		
		if(player2.getPlayerCharacter().getHp() > 0 && player1.getPlayerCharacter().getHp() > 0){
			getPlayerMove(player2.getPlayerCharacter(), player1.getPlayerCharacter(), player2.getName(), player1.getName());
			upkeep();
			callDisplayStatus();
		}	
	}
	
	public void battleEnd(){
		if(player1.getPlayerCharacter().getHp() <= 0){
			view.playerWin(player2.getName());
		}
		if(player2.getPlayerCharacter().getHp() <= 0){
			view.playerWin(player1.getName());
		}
	}
	public void getPlayerMove(Entity attackingPlayer, Entity defendingPlayer, String attackingPlayerName, String defendingPlayerName){
		
		view.displaySkills(attackingPlayer.getSkillNames(), attackingPlayerName, attackingPlayer.getSkillDescriptions());
		int choice;
		boolean done = false;
		
		do{
			choice = sc.nextInt();
			done = implementPlayerMove(attackingPlayer, choice, defendingPlayer);
		}while(done == false);
		
		if(attackingPlayer.getName().equalsIgnoreCase("priest") && (choice == 3 || choice == 4)){
			view.displayHealingLog(attackingPlayerName, attackingPlayer.getSkillName(choice - 1), attackingPlayer.getSkill(choice - 1).getBenefit());
		}
		else{
			if(choice != 5){
				view.displayAttackLog(attackingPlayerName, attackingPlayer.getSkillName(choice - 1), defendingPlayerName, attackingPlayer.getSkill(choice - 1).getBenefit());
			}
			else{
				view.displayAttackLog(attackingPlayerName, attackingPlayer.getSkillName(choice - 1), defendingPlayerName, attackingPlayer.getAtk());
			}
		}
	}
	
	public void callDisplayStatus(){
		view.displayStatus(player1.getName(), player2.getName(), player1.getPlayerCharacter().getName(), player2.getPlayerCharacter().getName(),
				   player1.getPlayerCharacter().getHp(), player2.getPlayerCharacter().getHp(), 
				   player1.getPlayerCharacter().getMana(), player2.getPlayerCharacter().getMana());
	}
	
	public boolean implementPlayerMove(Entity attackingPlayer, int choice, Entity defendingPlayer){
		boolean done = false;

		if(attackingPlayer.getName().equalsIgnoreCase("priest")){
			if((choice == 1 || choice == 2) && checkManaCost(attackingPlayer,choice) == true){
				defendingPlayer.setHp(attackingPlayer.performSkill(defendingPlayer.getHp(), choice - 1));
				done = true;
			}
			else if((choice == 3 || choice == 4) && checkManaCost(attackingPlayer,choice) == true){
				attackingPlayer.setHp(attackingPlayer.performSkill(attackingPlayer.getHp(), choice - 1));
				done = true;
			}
			else if(choice == 5){
				defendingPlayer.setHp(attackingPlayer.normalAttack(defendingPlayer.getHp()));
				done = true;
			}
			else{
				view.notEnoughMana();
				done = false;
			}
			
		}
		else{
			if((choice >= 1 && choice <= 4) && checkManaCost(attackingPlayer,choice) == true){
				defendingPlayer.setHp(attackingPlayer.performSkill(defendingPlayer.getHp(), choice - 1));
				done = true;
			}
			else if(choice == 5){
				defendingPlayer.setHp(attackingPlayer.normalAttack(defendingPlayer.getHp()));
				done = true;
			}
			else{
				view.notEnoughMana();
				done = false;
			}
		}
		return done;
	}
	
	public boolean checkManaCost(Entity attackingPlayer, int choice){
		if(attackingPlayer.getSkill(choice - 1).getManaCost() <= attackingPlayer.getMana())
			return true;
		else 
			return false;
	}
	
	public void upkeep(){
		player1.getPlayerCharacter().upkeep();
		player2.getPlayerCharacter().upkeep();
		view.upkeep(player1.getName(), player2.getName(), player1.getPlayerCharacter().getManaRegen(), player2.getPlayerCharacter().getManaRegen());
	}
}