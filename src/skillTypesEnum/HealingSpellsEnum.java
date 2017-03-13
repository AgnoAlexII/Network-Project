package skillTypesEnum;

import priestSkills.Heal;
import priestSkills.LesserHeal;
import skillTypesClasses.HealingSpell;

public enum HealingSpellsEnum {
	
	HEAL(2, "PRIEST", new Heal()),
	LESSERHEAL(3, "PRIEST", new LesserHeal());
	
	private int skillNumber;
	private String className;
	private HealingSpell healingSpell;
	
	HealingSpellsEnum(int skillNumber, String className, HealingSpell healingSpell){
		this.skillNumber = skillNumber;
		this.className = className;
		this.healingSpell = healingSpell;
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

	public HealingSpell getHealingSpell() {
		return healingSpell;
	}

	public void setHealingSpell(HealingSpell healingSpell) {
		this.healingSpell = healingSpell;
	}
	
}
