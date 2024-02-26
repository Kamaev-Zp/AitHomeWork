package homeWork29;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList pokemonList = new DoublyLinkedList();


        Pokemon pikachu = new Pokemon("Пикачу", "Электрический");
        Pokemon charmander = new Pokemon("Чармандер", "Огненный");
        Pokemon bulbasaur = new Pokemon("Бульбазавр", "Травяной");

        pokemonList.addPokemon(pikachu);
        pokemonList.addPokemon(charmander);
        pokemonList.addPokemon(bulbasaur);
        pokemonList.displayPokemon();
    }
}
