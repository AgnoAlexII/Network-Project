package Classes;

import abstractClasses.Entity;
import skillTypesEnum.DamageSpellsEnum;

public class Rogue extends Entity{
	
	public Rogue() {
		super("Rogue");
		this.mana = 120;
		this.manaRegen = 25;
		this.atk = 20;
	}
	public void upkeep(){
		mana += manaRegen;
		if(mana > 120)
			mana = 120;
	}
	
	public void getSkillsFromEnum() {
		for (int i = 0; i < 4; i++){
			skills.add(DamageSpellsEnum.getDamageSkill(i + 1, name));
		}
	}
	/*
	public int attack1(int enemyHP) {
		/*
		 * Name:			Mutilate
		 * Energy cost:		60
		 * Effect:			60
		 *
		DamageSpell mutilate = DamageSpellsEnum.getDamageSkill(1, name);
		
		return mutilate.doTheDamage(enemyHP);
	}

	public int attack2(int enemyHP) {
		/*
		 * Name:			Backstab
		 * Energy cost:		90
		 * Effect:			stabs the enemy for 90.
		 * 
		 *

		DamageSpell backstab = DamageSpellsEnum.getDamageSkill(2, name);
		
		mana -= backstab.getManaCost();
		return backstab.doTheDamage(enemyHP);
	}

	
	public int attack3(int enemyHP) {
		/*
		 * Name:			Rupture
		 * Energy cost:		40
		 * Effect:			50 damage
		 *
		DamageSpell rupture = DamageSpellsEnum.getDamageSkill(3, name);
		
		mana -= rupture.getManaCost();
		return rupture.doTheDamage(enemyHP);
	}

	
	public int attack4(int enemyHP) {
		/*
		 * Name:			Kidney Shot
		 * Energy Cost:		35
		 * Effect:			45
		 *

		DamageSpell kidneyShot = DamageSpellsEnum.getDamageSkill(4, name);
		
		mana -= kidneyShot.getManaCost();
		return kidneyShot.doTheDamage(enemyHP);
	}
*/
	
}
