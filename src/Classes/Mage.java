package Classes;

import abstractClasses.Entity;

public class Mage extends Entity{
	
	public Mage(String name) {
		super(name);
		this.mana = 200;
		this.manaRegen = 10;
		this.def = 15;
		this.atk = 15;
	}

	public void upkeep(){
		mana += manaRegen;
		if(mana > 200)
			mana = 200;
	}

//	public void attack1() {
//		/*
//		 * Name:		Arcane Barrage
//		 * Mana cost: 	65
//		 * Effect:		70
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
//		 * Name:		Blizzard
//		 * Mana cost:	80
//		 * Effect:		80
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
