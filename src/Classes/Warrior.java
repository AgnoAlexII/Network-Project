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
		 * Name:				Slam
		 * Rage cost:			60
		 * Effect:				60% chance to stun
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
