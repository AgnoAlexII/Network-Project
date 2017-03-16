package skillTypesClasses;

public abstract class Skill {

	protected int benefit;
	protected int manaCost;
	protected String name;
	protected String description;
	
	public Skill(int benefit, int manaCost, String name, String description) {
		this.benefit = benefit;
		this.manaCost = manaCost;
		this.name = name;
		this.description = description;
	}

	public int getBenefit() {
		return benefit;
	}

	public void setBenefit(int benefit) {
		this.benefit = benefit;
	}

	public int getManaCost() {
		return manaCost;
	}

	public void setManaCost(int manaCost) {
		this.manaCost = manaCost;
	}
	
	public abstract int doTheSkill(int targetHP);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
