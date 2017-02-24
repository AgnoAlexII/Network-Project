package Classes;

import abstractClasses.Entity;

public class Thief extends Entity{

	private int energy;

	
	public Thief(String name) {
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
