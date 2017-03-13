package Classes;

import abstractClasses.Entity;

public class Warrior extends Entity{
	
	public Warrior(String name) {
		super(name);
		this.mana = 0;
		this.manaRegen = -10;
		this.def = 25;
		this.atk = 20;
	}

	public void upkeep(){
		mana += manaRegen;
		if (mana < 0)
			mana = 0;
	}
	
	public void attack1() {
		/*
		 * Name:				Cleave
		 * Rage regeneration:	15
		 * Effect:				15 damage
		 */
	}

	public void attack2() {
		/*
		 * Name:				Heroic Strike
		 * Rage regeneration:	25			
		 * Effect:				25 damage.
		 */
	}

	public void attack3() {
		/*
		 * Name:				Bladestorm
		 * Rage cost:			60
		 * Effect:				60
		 */
	}

	public void attack4() {
		/*
		 * Name:				Mortal Strike
		 * Rage cost:			90
		 * Effect:				90 damage
		 */
	}

	public void attack5() {
		/*
		 * normal attack 20
		 */
	}
	
}
