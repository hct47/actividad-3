public class Card {
    private String palo;
    private String color;
    private String valor;

    // Constructor
    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    // Método para mostrar la carta en formato solicitado
    @Override
    public String toString() {
        return palo + "," + color + "," + valor;
    }
}
