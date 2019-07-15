package com.pokemon;

public class PokeTest {

	public static void main(String[] args) {
		
		Pokedex x = new Pokedex();
		
		Pokemon poke1 = x.createPokemon("Pikachu", 100, "Electric");
		Pokemon poke2 = x.createPokemon("Squirtle", 50, "Grass");
		Pokemon poke3 = x.createPokemon("Charmander", 50, "Fire");
		
		
		System.out.println(x.pokemonInfo(poke1));
		
		x.addPokemon(poke1);
		x.addPokemon(poke2);
		x.addPokemon(poke3);
		x.addPokemon(new Pokemon("Lucario", 200, "Steel"));
		x.listPokemon();
		
		poke2.attackPokemon(poke1);
		System.out.println(poke1.getHealth());
		
		System.out.println(Pokemon.getCount());
	}

}



