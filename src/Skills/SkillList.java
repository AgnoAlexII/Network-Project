package Skills;
import mageSkills.ArcanePower;

public enum SkillList {
	ARCANEPOWER(1, "MAGE", new ArcanePower()),
	ARCANEMISSILE(2, "MAGE", new ArcaneMissile()),
	FIREBALL(3, "MAGE", new FireBall()),
	FROSTBITE(4, "MAGE", new FrostByte());
	
	
	
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
