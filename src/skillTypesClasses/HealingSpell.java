package skillTypesClasses;

public class HealingSpell {

	private int healing;
	private int manaCost;
	
	public HealingSpell(int healing, int manaCost){
		this.healing = healing;
		this.manaCost = manaCost;
	}

	public int getHealing() {
		return healing;
	}

	public void setHealing(int healing) {
		this.healing = healing;
	}

	public int getManaCost() {
		return manaCost;
	}

	public void setManaCost(int manaCost) {
		this.manaCost = manaCost;
	}
	
}
