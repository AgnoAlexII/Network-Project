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
		 * Name:		Chaos Bolt
		 * Mana Cost:	50
		 * Effect:		50
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
