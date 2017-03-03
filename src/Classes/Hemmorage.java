package Classes;

import Skills.Skills;
import skillTypes.DamageMethod;

public class Hemmorage extends Skills implements DamageMethod{

	private int energyCost;
	
	public Hemmorage(){
		energyCost = 35;
	}

	@Override
	public void doTheDamage() {
		// TODO Auto-generated method stub
		
	}
}
