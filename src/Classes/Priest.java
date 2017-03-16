package Classes;

import abstractClasses.Entity;
import skillTypesEnum.DamageSpellsEnum;
import skillTypesEnum.HealingSpellsEnum;

public class Priest extends Entity{

	public Priest() {
		super("Priest");
		this.mana = 200;
		this.manaRegen = 20;
		this.atk = 15;
	}

	public void upkeep(){
		mana += manaRegen;
		if(mana > 200)
			mana = 200;
	}

	public void getSkillsFromEnum() {
		for (int i = 0; i < 2; i++){
			skills.add(DamageSpellsEnum.getDamageSkill(i + 1, name));
		}
		for (int i = 0; i < 4; i++){
			skills.add(HealingSpellsEnum.getHealingSkill(i + 1, name));
		}
	}
	/*
	public int attack1(int enemyHP) {		
		/*
		 * Name:		Devouring Plague
		 * Mana Cost:	80
		 * Effect:		90
		 *

		DamageSpell devouringPlague = DamageSpellsEnum.getDamageSkill(1, name);
		mana -= devouringPlague.getManaCost();
		return devouringPlague.doTheDamage(enemyHP);
	}

	public int attack2(int playerHP) {
		/*
		 * Name:		Heal
		 * Mana Cost:	45
		 * Effect:		Heal for 30
		 *
		HealingSpell heal = HealingSpellsEnum.getHealingSkill(1, name);
		
		mana -= heal.getManaCost();
		return heal.doTheHeal(playerHP);
	}

	public int attack3(int playerHP) {
		/*
		 * Name:		Lesser Heal
		 * Mana Cost:	25
		 * Effect:		Heal 15
		 *
		HealingSpell lesserHeal = HealingSpellsEnum.getHealingSkill(1, name);
		
		mana -= lesserHeal.getManaCost();
		
		return lesserHeal.doTheHeal(playerHP);
	}

	public int attack4(int enemyHP) {
		/*
		 * Name:		Mind Blast
		 * Mana Cost:	35
		 * Effect:		deals 30 damage
		 *
		DamageSpell mindBlast= DamageSpellsEnum.getDamageSkill(4, name);
		
		mana -= mindBlast.getManaCost();
		return mindBlast.doTheDamage(enemyHP);
	}
*/

}
