package Classes;

import abstractClasses.Entity;

public class Rogue extends Entity{
	
	public Rogue(String name) {
		super(name);
		this.mana = 120;
		this.manaRegen = 25;
		this.def = 20;
		this.atk = 20;
	}
	public void upkeep(){
		mana += manaRegen;
		if(mana > 120)
			mana = 120;
	}
	
	public void attack1() {
		/*
		 * Name:			Mutilate
		 * Energy cost:		60
		 * Effect:			60
		 */
		
	}

	public void attack2() {
		/*
		 * Name:			Kidney Shot
		 * Energy Cost:		35
		 * Effect:			45
		 */
	}

	
	public void attack3() {
		/*
		 * Name:			Backstab
		 * Energy cost:		90
		 * Effect:			stabs the enemy for 90.
		 * 
		 */
		
	}

	
	public void attack4() {
		/*
		 * Name:			Rupture
		 * Energy cost:		40
		 * Effect:			50 damage
		 */
		
	}

	public void attack5() {
		/*
		 * normal attack for 15 damage
		 */
		
	}
	
}
