package Classes;

import abstractClasses.Entity;

public class Priest extends Entity{

	private int mana; //max mana 200
	private int manaRegen;
	
	public Priest(String name) {
		super(name);
		this.mana = 200;
		this.manaRegen = 20;
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
		 * Name:		Heal
		 * Mana Cost:	35
		 * Effect:		Heal for 30
		 */
		
	}

	public void attack2() {
		/*
		 * Name:		Renew
		 * Mana Cost:	25
		 * Effect:		Heal 15 for 3 turns
		 */
		
	}

	public void attack3() {
		/*
		 * Name:		Devouring Plague
		 * Mana Cost:	50
		 * Effect:		90 damage in the span of 3 turns
		 * 				Heals caster 15 per turn
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
