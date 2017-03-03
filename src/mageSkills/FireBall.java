package mageSkills;

import Skills.Skills;
import skillTypes.DamageOverTime;

public class FireBall extends Skills implements DamageOverTime{

	protected int manaCost;
	
	public FireBall(){
		manaCost = 40;
	}

	public void doTheDamage() {
			
	}
}
