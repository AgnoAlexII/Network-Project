package Classes;

import abstractClasses.Entity;

public class Warlock extends Entity{

	private int mana; //max mana 200
	private int manaRegen;
	
	public Warlock(String name) {
		super(name);
		this.mana = 200;
		this.manaRegen = 15;
		this.setDef(15);
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
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
		 * Name:		Corruption
		 * Mana Cost:	30
		 * Effect:		30 damage over 3 turns
		 * 
		 */
	}

	public void attack3() {
		/*
		 * Name:		Unstable Affliction
		 * Mana Cost:	45
		 * Effect:		80 damage over 4 turns
		 * 
		 */
	}

	public void attack4() {
		/*
		 * Name:		Immolate
		 * Mana Cost:	35
		 * Effect:		45 damage over 3 turns
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
