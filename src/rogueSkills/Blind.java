package rogueSkills;

import Skills.Skills;
import skillTypes.CrowdControl;

public class Blind extends Skills implements CrowdControl{

	private int energyCost;
	
	public Blind(){
		energyCost = 45;
	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		
	}
	
	
}
