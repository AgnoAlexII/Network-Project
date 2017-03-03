package warriorSkills;

import Skills.Skills;
import skillTypes.CrowdControl;

public class Slam extends Skills implements CrowdControl{

	private int rageCost;
	private int rageRegen;
	
	public Slam(){
		rageCost = 60;
		rageRegen = 0;
	}

	public void disable() {
		
	}
}
