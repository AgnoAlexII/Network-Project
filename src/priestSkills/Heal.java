package priestSkills;

import Skills.Skills;
import skillTypes.HealMethod;

public class Heal extends Skills implements HealMethod{

	protected int manaCost;
	
	public Heal(){
		manaCost = 25;
	}

	public void heal() {
			
	}
	
	
}
