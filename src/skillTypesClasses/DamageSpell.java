package skillTypesClasses;

public abstract class DamageSpell extends Skill{
	
	public DamageSpell(int damage, int manaCost, String name, String description){
		super(damage, manaCost, name, description);
	}

	public int doTheSkill(int targetHP){		
		return targetHP - benefit;
	}

}
