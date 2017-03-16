package Classes;

import abstractClasses.Entity;
import skillTypesEnum.DamageSpellsEnum;

public class Mage extends Entity{
	
	public Mage() {
		super("Mage");
		this.mana = 200;
		this.manaRegen = 10;
		this.atk = 15;
	}
	
	public void upkeep(){
		mana += manaRegen;
		if(mana > 200)
			mana = 200;
	}

	public void getSkillsFromEnum(){
		for (int i = 0; i < 4; i++){
			skills.add(DamageSpellsEnum.getDamageSkill(i + 1, name));
		}
	}

	/*
	public int attack1(int enemyHP) {
		/*
		 * Name:		Arcane Barrage
		 * Mana cost: 	65
		 * Effect:		70
		 *
		DamageSpell arcaneBarrage = DamageSpellsEnum.getDamageSkill(1, name);
		
		return arcaneBarrage.doTheDamage(enemyHP);
	}

	public int attack2(int enemyHP) {
		/*
		 * Name:		Arcane Missile
		 * Mana cost:	35
		 * Effect:		Deal 30 damage
		 * 
		 *
		DamageSpell arcaneMissile = DamageSpellsEnum.getDamageSkill(2, name);
		
		mana -= arcaneMissile.getManaCost();
		return arcaneMissile.doTheDamage(enemyHP);
	}

	public int attack3(int enemyHP) {
		/*
		 * Name:		Fireball
		 * Mana cost:	40
		 * Effect:		Deal 25 damage
		 * 
		 *
		DamageSpell fireBall = DamageSpellsEnum.getDamageSkill(3, name);
		mana -= fireBall.getManaCost();
		
		return fireBall.doTheDamage(enemyHP);
	}

	public int attack4(int enemyHP) {
		/*
		 * Name:		Blizzard
		 * Mana cost:	80
		 * Effect:		80
		 * 
		 *
		DamageSpell blizzard = DamageSpellsEnum.getDamageSkill(4, name);
		
		mana -= blizzard.getManaCost();
		return blizzard.doTheDamage(enemyHP);
	}
*/ 

}