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
		return skillNames[index + 1];
	}
	
	public String[] getSkillNames() {
		String[] skillNames = new String[4];
		for (int i = 0; i < 4; i++){
			skillNames[i] = skills.get(i).getName();
		}
		return skillNames;
	}
	
	public String[] getSkillDescriptions(){
		String[] skillDescriptions = new String[4];
		for(int i = 0; i < 4; i++){
			skillDescriptions[i] = skills.get(i).getDescription();
		}
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
		System.out.println(mana);
		System.out.println(skills.get(chosenSkill).getBenefit());
		return skills.get(chosenSkill - 1).doTheSkill(targetHP);
		
	}
	
	public abstract void getSkillsFromEnum();
	
	public Skill getSkill(int index){
		return skills.get(index);
	}
	
}
