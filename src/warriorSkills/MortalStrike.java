package warriorSkills;

import Skills.Skills;
import skillTypes.DamageMethod;

public class MortalStrike extends Skills implements DamageMethod{

	private int rageCost;
	private int rageRegen;
	
	public MortalStrike(){
		rageCost = 90;
		rageRegen = 0;
	}

	@Override
	public void doTheDamage() {
		// TODO Auto-generated method stub
		
	}
	
	
}
