package skillTypesClasses;

public abstract class DamageSpell{

	private int damage;
	private int manaCost;
	
	public DamageSpell(int damage, int manaCost){
		this.damage = damage;
		this.manaCost = manaCost;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getManaCost() {
		return manaCost;
	}

	public void setManaCost(int manaCost) {
		this.manaCost = manaCost;
	}
	
}
