package priestSkills;

import Skills.Skills;
import skillTypes.HealMethod;

public class LesserHeal extends Skills implements HealMethod{

	protected int manaCost;
	
	public LesserHeal(){
		manaCost = 15;
	}
	
	@Override
	public void heal() {
		// TODO Auto-generated method stub
		
	}

	
}
