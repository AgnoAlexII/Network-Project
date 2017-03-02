package Classes;

import abstractClasses.Entity;

public class Warlock extends Entity{

	private int mana;
	
	public Warlock(String name) {
		super(name);
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
	
	
}
