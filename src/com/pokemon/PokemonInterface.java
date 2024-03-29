package com.pokemon;

public interface PokemonInterface {
	//This method creates and returns Pokemon
	Pokemon createPokemon(String name, int health, String type);
	// This method returns a String with the name, health, and type of the Pokemon
	String pokemonInfo(Pokemon pokemon);
	// List all the pokemon names in your pokedex
	void listPokemon();
	
}
