import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;

    // Constructor: inicializa las 52 cartas
    public Deck() {
        cards = new ArrayList<>();
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] colores = {"Rojo", "Rojo", "Negro", "Negro"};
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (int i = 0; i < palos.length; i++) {
            for (String valor : valores) {
                cards.add(new Card(palos[i], colores[i], valor));
            }
        }
    }

    // a) Mezcla aleatoriamente el deck
    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    // b) Muestra la primera carta y la elimina
    public void head() {
        if (cards.isEmpty()) {
            System.out.println("Ya no hay cartas en el deck.");
            return;
        }
        Card primera = cards.remove(0);
        System.out.println(primera);
        System.out.println("Quedan " + cards.size() + " cartas en deck");
    }

    // c) Selecciona una carta al azar y la elimina
    public void pick() {
        if (cards.isEmpty()) {
            System.out.println("Ya no hay cartas en el deck.");
            return;
        }
        Random random = new Random();
        int index = random.nextInt(cards.size());
        Card seleccionada = cards.remove(index);
        System.out.println(seleccionada);
        System.out.println("Quedan " + cards.size() + " cartas en deck");
    }

    // d) Devuelve una mano de 5 cartas y las elimina del deck
    public void hand() {
        if (cards.size() < 5) {
            System.out.println("No hay suficientes cartas para repartir una mano.");
            return;
        }
        for (int i = 0; i < 5; i++) {
            Card carta = cards.remove(0);
            System.out.println(carta);
        }
        System.out.println("Quedan " + cards.size() + " cartas en deck");
    }
}
