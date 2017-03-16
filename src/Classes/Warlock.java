package Classes;

import abstractClasses.Entity;
import skillTypesEnum.DamageSpellsEnum;

public class Warlock extends Entity{

	public Warlock() {
		super("Warlock");
		this.mana = 200;
		this.manaRegen = 15;
		this.atk = 15;
	}

	public void upkeep(){
		mana += manaRegen;
		if(mana > 200)
			mana = 200;
	}

	public void getSkillsFromEnum() {
		for (int i = 0; i < 4; i++){
			skills.add(DamageSpellsEnum.getDamageSkill(i + 1, name));
		}		
	}
	
/*
	public int attack1(int enemyHP) {
		/*
		 * Name:		Chaos Bolt
		 * Mana Cost:	50
		 * Effect:		50
		 * 
		 *
		
		DamageSpell chaosBolt = DamageSpellsEnum.getDamageSkill(1, name);
		
		mana -= chaosBolt.getManaCost();
		return chaosBolt.doTheDamage(enemyHP);
	}

	public int attack2(int enemyHP) {
		/*
		 * Name:		Incinerate
		 * Mana Cost:	40
		 * Effect:		40
		 * 
		 *
		DamageSpell incinerate = DamageSpellsEnum.getDamageSkill(2, name);
		
		mana -= incinerate.getManaCost();
		return incinerate.doTheDamage(enemyHP);
	}

	public int attack3(int enemyHP) {
		/*
		 * Name:		Conflagrate
		 * Mana Cost:	70
		 * Effect:		60
		 * 
		 *
		DamageSpell conflagrate = DamageSpellsEnum.getDamageSkill(3, name);
		
		mana -= conflagrate.getManaCost();
		return conflagrate.doTheDamage(enemyHP);
	}

	public int attack4(int enemyHP) {
		/*
		 * Name:		Haunt
		 * Mana Cost:	25
		 * Effect:		30
		 * 
		 *
		DamageSpell haunt = DamageSpellsEnum.getDamageSkill(4, name);
		
		mana -= haunt.getManaCost();
		return haunt.doTheDamage(enemyHP);
	}
*/	
}
