package Classes;

import abstractClasses.Entity;

public class Priest extends Entity{

	public Priest(String name) {
		super(name);
		this.mana = 200;
		this.manaRegen = 20;
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
		 * Name:		Heal
		 * Mana Cost:	45
		 * Effect:		Heal for 30
		 */
		
	}

	public void attack2() {
		/*
		 * Name:		Lesser Heal
		 * Mana Cost:	25
		 * Effect:		Heal 15
		 */
		
	}

	public void attack3() {
		/*
		 * Name:		Devouring Plague
		 * Mana Cost:	80
		 * Effect:		90
		 */
	}

	public void attack4() {
		/*
		 * Name:		Mind Blast
		 * Mana Cost:	35
		 * Effect:		deals 30 damage
		 */
		
	}

	public void attack5() {
		/*
		 * Attack with normal weapon
		 * 15 damage
		 */
		
	}
}
