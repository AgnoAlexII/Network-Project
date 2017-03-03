package priestSkills;

import Skills.Skills;
import skillTypes.DamageMethod;

public class DevouringPlague extends Skills implements DamageMethod{

	protected int manaCost;
	
	public DevouringPlague(){
		manaCost = 50;
	}

	@Override
	public void doTheDamage() {
		// TODO Auto-generated method stub
		
	}
}
