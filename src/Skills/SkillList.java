package Skills;
import Classes.Backstab;
import Classes.Hemmorage;
import Classes.Rupture;
import mageSkills.ArcaneMissile;
import mageSkills.ArcanePower;
import mageSkills.FireBall;
import mageSkills.FrostByte;
import priestSkills.DevouringPlague;
import priestSkills.Heal;
import priestSkills.LesserHeal;
import priestSkills.MindBlast;
import rogueSkills.Blind;
import warlockSkills.Corruption;
import warlockSkills.Fear;
import warlockSkills.Immolate;
import warlockSkills.UnstableAffliction;
import warriorSkills.Cleave;
import warriorSkills.HeroicStrike;
import warriorSkills.MortalStrike;
import warriorSkills.Slam;

public enum SkillList {
	ARCANEPOWER(1, "MAGE", new ArcanePower()),
	ARCANEMISSILE(2, "MAGE", new ArcaneMissile()),
	FIREBALL(3, "MAGE", new FireBall()),
	FROSTBITE(4, "MAGE", new FrostByte()),
	FEAR(1, "WARLOCK", new Fear()),
	CORRUPTION(2, "WARLOCK", new Corruption()),
	UNSTABLEAFFLICTION(3, "WARLOCK", new UnstableAffliction()),
	IMMOLATE(4, "WARLOCK", new Immolate()),
	DEVOURINGPLAGUE(1, "PRIEST", new DevouringPlague()),
	HEAL(2, "PRIEST", new Heal()),
	LESSERHEAL(3, "PRIEST", new LesserHeal()),
	MINDBLAST(4, "PRIEST", new MindBlast()),
	CLEAVE(1, "WARRIOR", new Cleave()),
	SLAM(2, "WARRIOR", new Slam()),
	HEROICSTRIKE(3, "WARRIOR", new HeroicStrike()),
	MORTALSTRIKE(4, "WARRIOR", new MortalStrike()),
	BLIND(1, "ROGUE", new Blind()),
	BACKSTAB(2, "ROGUE", new Backstab()),
	RUPTURE(3, "ROGUE", new Rupture()),
	HEMMORAGE(4, "ROGUE", new Hemmorage());
	
	
	
	
	
	private int chosenSkill;
	private String name;
	private Skills skill;
	
	SkillList(int cosenSkill, String name,Skills skill){
		this.chosenSkill = chosenSkill;
		this.skill = skill;
	}

	public int getChosenSkill() {
		return chosenSkill;
	}

	public void setChosenSkill(int chosenSkill) {
		this.chosenSkill = chosenSkill;
	}

	public Skills getSkill() {
		return skill;
	}

	public void setSkill(Skills skill) {
		this.skill = skill;
	}
	
	
	public static Skills whatSkillIsIt(int chosenSkill, String name) {
		
		for(SkillList theSkill : SkillList.values()) {
			if(theSkill.getName().equalsIgnoreCase(name) && 
		       theSkill.getChosenSkill() == chosenSkill) {
				return theSkill.getSkill();
			}
		}
		
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
