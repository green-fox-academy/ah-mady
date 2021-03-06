import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import pokemon.Pokemon;

public class Main {
  public static void main(String[] args) {
    List<Pokemon> pokemonOfAsh = initializePokemons();

    // Every pokemon has a name and a type.
    // Certain types are effective against others, e.g. water is effective against fire.

    // Ash has a few pokemon.
    // A wild pokemon appeared!

    Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");


    System.out.println(wildPokemon.isEffectiveAgainst(wildPokemon));
    //not my solution

    // Which pokemon should Ash use?

    System.out.print("I choose you, ");


    for (int i = 0; i < pokemonOfAsh.size(); i++) {
      if (pokemonOfAsh.get(i).isEffectiveAgainst(wildPokemon)) {
        System.out.println(pokemonOfAsh.get(i).getName());
        break;
      }
    }

  }

  private static List<Pokemon> initializePokemons() {
    List<Pokemon> pokemon = new ArrayList<>();

    pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
    pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
    pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
    pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
    pokemon.add(new Pokemon("Kingler", "water", "fire"));

    return pokemon;
  }
}