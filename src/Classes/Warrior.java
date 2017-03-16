package Classes;

import abstractClasses.Entity;
import skillTypesEnum.DamageSpellsEnum;

public class Warrior extends Entity{
	
	public Warrior() {
		super("Warrior");
		this.mana = 0;
		this.manaRegen = -10;
		this.atk = 20;
	}

	public void upkeep(){
		mana += manaRegen;
		if (mana < 0)
			mana = 0;
	}

	
	public void getSkillsFromEnum() {
		for (int i = 0; i < 4; i++){
			skills.add(DamageSpellsEnum.getDamageSkill(i + 1, name));
		}
	}
	
	/*
	public int attack1(int enemyHP) {
		/*
		 * Name:				Cleave
		 * Rage regeneration:	15
		 * Effect:				15 damage
		 
		DamageSpell cleave = DamageSpellsEnum.getDamageSkill(1, name);
		mana -= cleave.getManaCost();
		return cleave.doTheDamage(enemyHP);
	}

	public int attack2(int enemyHP) {
		/*
		 * Name:				Bladestorm
		 * Rage cost:			60
		 * Effect:				60
		 

		DamageSpell bladeStorm = DamageSpellsEnum.getDamageSkill(2, name);
		mana -= bladeStorm.getManaCost();
		return bladeStorm.doTheDamage(enemyHP);
	}

	public int attack3(int enemyHP) {

		/*
		 * Name:				Heroic Strike
		 * Rage regeneration:	25			
		 * Effect:				25 damage.
		 
		DamageSpell heroicStrike = DamageSpellsEnum.getDamageSkill(3, name);
		mana -= heroicStrike.getManaCost();
		return heroicStrike.doTheDamage(enemyHP);
	}

	public int attack4(int enemyHP) {
		/*
		 * Name:				Mortal Strike
		 * Rage cost:			90
		 * Effect:				90 damage
		 
		DamageSpell mortalStrike = DamageSpellsEnum.getDamageSkill(4, name);
		
		mana -= mortalStrike.getManaCost();
		return mortalStrike.doTheDamage(enemyHP);
	}
*/
}
