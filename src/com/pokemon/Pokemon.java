package com.pokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int count = 0;
	
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		Pokemon.count++;
	}
	

    public void attackPokemon(Pokemon pokemon){
        int health = pokemon.getHealth();
        pokemon.setHealth( health - 10 );
    }
    
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	public static int getCount() {
		return count;
	}

}
