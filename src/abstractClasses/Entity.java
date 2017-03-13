package abstractClasses;

public abstract class Entity {

	protected String name;
	protected int hp;
	protected int atk;
	protected int def;
	protected int mana;
	protected int manaRegen;
	
	public Entity(String name){
		this.name = name;
		this.hp = 250;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public int getManaRegen() {
		return manaRegen;
	}
	public void setManaRegen(int manaRegen) {
		this.manaRegen = manaRegen;
	}
}
