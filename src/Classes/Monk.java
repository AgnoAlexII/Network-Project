package Classes;

import abstractClasses.Entity;

public class Monk extends Entity{

	private int energy;

	
	public Monk(String name) {
		super(name);
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	
}
