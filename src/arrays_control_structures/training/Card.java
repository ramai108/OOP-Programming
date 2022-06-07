package arrays_control_structures.training;

public class Card {
    private Symbol symbol;
    public Card (Symbol symbol) {
        this.symbol = symbol;
    }
    public String getCard() {
        return symbol.toString();
    }
}
