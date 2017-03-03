package Classes;

import abstractClasses.Entity;

public class Warrior extends Entity{

	private int rage; //max rage is 120
	
	public Warrior(String name) {
		super(name);
		this.setDef(25);
	}

	public void upkeep(){
		rage -= 10;
		if (rage < 0)
			rage = 0;
	}
	
	public int getRage() {
		return rage;
	}
	
	public void setRage(int rage) {
		this.rage = rage;
	}

	public void attack1() {
		/*
		 * Name:				Cleave
		 * Rage regeneration:	15
		 * Effect:				30 damage. Bleed for 2 turns
		 */
	}

	public void attack2() {
		/*
		 * Name:				Heroic Strike
		 * Rage regeneration:	25			
		 * Effect:				35 damage.
		 */
	}

	public void attack3() {
		/*
		 * Name:				Slam
		 * Rage cost:			90
		 * Effect:				90 damage. 40% chance to stun
		 */
	}

	public void attack4() {
		/*
		 * Name:				Mortal Strike
		 * Rage cost:			70
		 * Effect:				45 damage + 25 if target is bleeding
		 */
	}

	public void attack5() {
		/*
		 * normal attack 20
		 */
	}
	
}
