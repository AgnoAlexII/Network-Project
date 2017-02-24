package Classes;

import abstractClasses.Entity;

public class Warrior extends Entity{

	private int rage;

	
	public Warrior(String name) {
		super(name);
	}

	public int getRage() {
		return rage;
	}
	
	public void setRage(int rage) {
		this.rage = rage;
	}
	
}
