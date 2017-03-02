package abstractClasses;

public abstract class Entity {

	private String name;
	private int hp;
	private int atk;
	private int def;
	private int speed;
	
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
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public abstract void attack1();
	public abstract void attack2();
	public abstract void attack3();
	public abstract void attack4();
	public abstract void attack5();
}
