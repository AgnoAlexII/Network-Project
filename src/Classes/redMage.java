package Classes;

import abstractClasses.Entity;

public class redMage extends Entity{

	private int mana;
	
	public redMage(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
}
