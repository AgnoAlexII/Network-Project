package player;

import abstractClasses.Entity;

public class Player {

	private String name;
	private Entity playerCharacter;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Entity getPlayerCharacter() {
		return playerCharacter;
	}
	
	public void setPlayerCharacter(Entity playerCharacter) {
		this.playerCharacter = playerCharacter;
	}
}
