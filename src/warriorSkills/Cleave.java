package warriorSkills;

import Skills.Skills;
import skillTypes.DamageMethod;

public class Cleave extends Skills implements DamageMethod{

	private int rageCost;
	private int rageRegen;
	
	public Cleave(){
		rageCost = 0;
		rageRegen = 15;
	}

	@Override
	public void doTheDamage() {
		// TODO Auto-generated method stub
		
	}
}
