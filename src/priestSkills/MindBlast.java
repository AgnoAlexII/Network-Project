package priestSkills;

import Skills.Skills;
import skillTypes.DamageMethod;

public class MindBlast extends Skills implements DamageMethod{

	protected int manaCost;
	
	public MindBlast(){
		manaCost = 35;
	}

	@Override
	public void doTheDamage() {
		// TODO Auto-generated method stub
		
	}
}
