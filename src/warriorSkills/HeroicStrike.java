package warriorSkills;

import Skills.Skills;
import skillTypes.DamageMethod;

public class HeroicStrike extends Skills implements DamageMethod{

	private int rageCost;
	private int rageRegen;
	
	public HeroicStrike(){
		rageCost = 0;
		rageRegen = 25;
	}
	
	public void doTheDamage() {
		// TODO Auto-generated method stub
		
	}

}
