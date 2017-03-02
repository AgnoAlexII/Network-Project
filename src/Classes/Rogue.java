package Classes;

import abstractClasses.Entity;

public class Rogue extends Entity{

	private int energy;

	
	public Rogue(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	
}
