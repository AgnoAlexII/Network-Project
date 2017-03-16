package skillTypesEnum;

import mageSkills.ArcaneBarrage;
import mageSkills.ArcaneMissile;
import mageSkills.Blizzard;
import mageSkills.FireBall;
import priestSkills.DevouringPlague;
import priestSkills.MindBlast;
import rogueSkills.Backstab;
import rogueSkills.KidneyShot;
import rogueSkills.Mutilate;
import rogueSkills.Rupture;
import skillTypesClasses.DamageSpell;
import warlockSkills.ChaosBolt;
import warlockSkills.Conflagrate;
import warlockSkills.Haunt;
import warlockSkills.Incinerate;
import warriorSkills.Bladestorm;
import warriorSkills.Cleave;
import warriorSkills.HeroicStrike;
import warriorSkills.MortalStrike;

public enum DamageSpellsEnum {
	
	ARCANEBARRAGE(1, "MAGE", new ArcaneBarrage()),
	ARCANEMISSILE(2, "MAGE", new ArcaneMissile()),
	FIREBALL(3, "MAGE", new FireBall()),
	BLIZZARD(4, "MAGE", new Blizzard()),
	DEVOURINGPLAGUE(1, "PRIEST", new DevouringPlague()),
	MINDBLAST(2, "PRIEST", new MindBlast()),
	MUTILATE(1, "ROGUE", new Mutilate()),
	BACKSTAB(2, "ROGUE", new Backstab()),
	RUPTURE(3, "ROGUE", new Rupture()),
	KIDNEYSHOT(4, "ROGUE", new KidneyShot()),
	CLEAVE(1, "WARRIOR", new Cleave()),
	BLADESTORM(2, "WARRIOR", new Bladestorm()),
	HEROICSTRIKE(3, "WARRIOR", new HeroicStrike()),
	MORTALSTRIKE(4, "WARRIOR", new MortalStrike()),
	CHAOSBOLT(1, "WARLOCK", new ChaosBolt()),
	CONFLAGRATE(2, "WARLOCK", new Conflagrate()),
	HAUNT(3, "WARLOCK", new Haunt()),
	INCINERATE(4, "WARLOCK", new Incinerate());
	
	private int skillNumber;
	private String className;
	private DamageSpell damageSpell;
	
	DamageSpellsEnum(int skillNumber, String className, DamageSpell damageSpell){
		this.skillNumber = skillNumber;
		this.className = className;
		this.damageSpell = damageSpell;
	}

	public int getSkillNumber() {
		return skillNumber;
	}

	public void setSkillNumber(int skillNumber) {
		this.skillNumber = skillNumber;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public DamageSpell getDamageSpell() {
		return damageSpell;
	}

	public void setDamageSpell(DamageSpell damageSpell) {
		this.damageSpell = damageSpell;
	}	
	
	public static DamageSpell getDamageSkill(int chosenSkill, String className) {
		for(DamageSpellsEnum dmgSpell : DamageSpellsEnum.values()) {
			if(dmgSpell.getClassName().equalsIgnoreCase(className) &&
			   dmgSpell.getSkillNumber() == chosenSkill) {
				return dmgSpell.getDamageSpell();
			}
		}	
		return null;
	}

}