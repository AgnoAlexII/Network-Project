package Classes;

import Skills.Skills;
import abstractClasses.Entity;

public class Mage extends Entity{

	private int mana; // max mana 200
	private int manaRegen;
	
	public Mage(String name) {
		super(name);
		this.mana = 200;
		this.manaRegen = 10;
		this.setDef(15);
	}

	public void upkeep(){
		mana += manaRegen;
		if(mana > 200)
			mana = 200;
	}
	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
	
	public int performSkill(int enemyHP, int enemyDEF, int chosenSkill) {
		
		skill = Skills.getSkillOfClass(chosenSkill, name);
		
		
		return enemyHP;
		
	}

//	public void attack1() {
//		/*
//		 * Name:		Arcane Power
//		 * Mana cost: 	30
//		 * Effect:		Spells deal 20% more damage for 2 turns
//		 * 				Spell mana cost increased by 20%
//		 */
//		
//	}
//
//	public void attack2() {
//		/*
//		 * Name:		Arcane Missile
//		 * Mana cost:	35
//		 * Effect:		Deal 30 damage
//		 * 
//		 */		
//	}
//
//	public void attack3() {
//		/*
//		 * Name:		Fireball
//		 * Mana cost:	40
//		 * Effect:		Deal 25 damage, deal 10 damage for 2 turns
//		 * 
//		 */
//		
//	}
//
//	public void attack4() {
//		/*
//		 * Name:		Frostbite
//		 * Mana cost:	50
//		 * Effect:		60% chance to freeze target for 1 turn
//		 * 
//		 */
//		
//	}
//
//	public void attack5() {
//		/*
//		 * Normal attack
//		 * Attack with your weapon
//		 * 15 damage
//		 */
//	}
}
