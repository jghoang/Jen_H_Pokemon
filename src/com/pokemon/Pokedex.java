package com.pokemon;
import java.util.*;

public class Pokedex extends AbstractPokemon {
	private ArrayList<Pokemon> myPokemons;
	
	public Pokedex(){
		myPokemons = new ArrayList<Pokemon>();
	}


	public void addPokemon(Pokemon pokemon) {
		myPokemons.add(pokemon);
	}
	
	@Override
	public void listPokemon() {
		System.out.println("Pokemons in Pokedex:");
		for (Pokemon x:myPokemons) {
			System.out.print(x.getName() + " ");
		}
		System.out.println("");
	}

}