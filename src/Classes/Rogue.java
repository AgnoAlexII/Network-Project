package Classes;

import abstractClasses.Entity;

public class Rogue extends Entity{

	private int energy; //max energy is 120
	private int energyRegen;
	
	public Rogue(String name) {
		super(name);
		this.energy = 120;
		this.energyRegen = 25;
		this.setDef(20);
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	
	public void attack1() {
		/*
		 * Name:			Hemmorage
		 * Energy cost:		35
		 * Effect:			60 damage in 3 turns
		 */
		
	}

	public void attack2() {
		/*
		 * Name:			Vanish
		 * Energy cost:		45
		 * Effect:			goes to stealth mode for 1 turn. cannot be targeted by enemy. +15 to energy regen
		 * 
		 */
	}

	
	public void attack3() {
		/*
		 * Name:			Backstab
		 * Energy cost:		60
		 * Effect:			stabs the enemy for 90. 60% chance to stun. must be stealthed
		 * 
		 */
		
	}

	
	public void attack4() {
		/*
		 * Name:			Slice and dice
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
