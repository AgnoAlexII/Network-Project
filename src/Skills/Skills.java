package Skills;

public abstract class Skills {
	
	public static Skills getSkillOfClass(int chosenSkill, String name) {
		
		return SkillList.whatSkillIsIt(chosenSkill, name);
				
	}
	
	
	
}
