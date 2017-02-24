package Classes;

import abstractClasses.Entity;

public class blackMage extends Entity{

	private int mana;
	
	public blackMage(String name) {
		super(name);
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
	
	
}
