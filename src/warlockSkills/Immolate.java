package warlockSkills;

import Skills.Skills;
import skillTypes.DamageOverTime;

public class Immolate extends Skills implements DamageOverTime{

	private int manaCost;
	
	public Immolate(){
		manaCost = 35;
	}

	public void doTheDamage() {
		
	}
}
