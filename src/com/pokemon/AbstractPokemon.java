package com.pokemon;


public abstract class AbstractPokemon implements PokemonInterface {
	
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon newPokemon = new Pokemon(name, health, type);
		return newPokemon;
		
	}
	public String pokemonInfo(Pokemon pokemon) {
		return "Name: " + pokemon.getName() + " Health: " + pokemon.getHealth() + " Type: " + pokemon.getType();
	}
}
