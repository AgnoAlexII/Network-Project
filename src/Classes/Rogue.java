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
		 * Effect:			20 damage for 3 turns
		 */
		
	}

	public void attack2() {
		/*
		 * Name:			Blind
		 * Energy Cost:		45
		 * Effect:			60% chance to disable
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
