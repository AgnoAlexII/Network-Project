package abstractClasses;

import java.util.ArrayList;

import skillTypesClasses.Skill;

public abstract class Entity {

	protected String name;
	protected int hp;
	protected int atk;
	protected int mana;
	protected int manaRegen;
	protected ArrayList<Skill> skills = new ArrayList<Skill>();
	protected String[] skillNames;
	
	public Entity(String name){
		this.name = name;
		this.hp = 400;
		skillNames = new String[5];
		getSkillsFromEnum();
		initializeSkillNames();
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
	public String getSkillName(int index){
		return skillNames[index];
	}
	
	public void initializeSkillNames(){
		for (int i = 0; i < 4; i++){
			skillNames[i] = skills.get(i).getName();
		}
		skillNames[4] = "Attack with weapon";
	}
	public String[] getSkillNames() {

		return skillNames;
	}
	
	public String[] getSkillDescriptions(){
		String[] skillDescriptions = new String[5];
		for(int i = 0; i < 4; i++){
			skillDescriptions[i] = skills.get(i).getDescription();
		}
		skillDescriptions[4] = "for " + atk + " damage"; 
		return skillDescriptions;
	}
	public int normalAttack(int enemyHP) {
		/*
		 * Normal attack
		 * Attack with your weapon
		 * 15 damage
		 */
		return enemyHP - atk;
	}
	
	public int performSkill(int targetHP, int chosenSkill){
		mana -= skills.get(chosenSkill).getManaCost();
		return skills.get(chosenSkill).doTheSkill(targetHP);
		
	}
	
	public Skill getSkill(int index){
		return skills.get(index);
	}
	
	public abstract void getSkillsFromEnum();
	public abstract void upkeep();

	
}
