package Classes;

import abstractClasses.Entity;

public class Warlock extends Entity{

	public Warlock(String name) {
		super(name);
		this.mana = 200;
		this.manaRegen = 15;
		this.def = 15;
		this.atk = 15;
	}

	public void upkeep(){
		mana += manaRegen;
		if(mana > 200)
			mana = 200;
	}

	public void attack1() {
		/*
		 * Name:		Fear
		 * Mana Cost:	45
		 * Effect:		60% chance to fear target for 1 turn
		 * 
		 */
		
	}

	public void attack2() {
		/*
		 * Name:		Incinerate
		 * Mana Cost:	40
		 * Effect:		40
		 * 
		 */
	}

	public void attack3() {
		/*
		 * Name:		Conflagrate
		 * Mana Cost:	70
		 * Effect:		60
		 * 
		 */
	}

	public void attack4() {
		/*
		 * Name:		Haunt
		 * Mana Cost:	25
		 * Effect:		30
		 * 
		 */
	}

	public void attack5() {
		/*
		 * Attack normally for 15 damage
		 * 
		 */
	}
	
	
}
