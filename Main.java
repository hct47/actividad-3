public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        // Pruebas de funcionamiento
        deck.shuffle();  // Mezclar baraja
        deck.head();     // Mostrar primera carta
        deck.pick();     // Mostrar carta aleatoria
        deck.hand();     // Mostrar mano de 5 cartas
    }
}
