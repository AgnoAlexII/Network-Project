package skillTypesClasses;

public abstract class HealingSpell extends Skill{

	public HealingSpell(int healing, int manaCost, String name, String description){
		super(healing, manaCost, name, description);
	}

	public int doTheSkill(int targetHP){
		return targetHP + benefit;
	}
	
}
