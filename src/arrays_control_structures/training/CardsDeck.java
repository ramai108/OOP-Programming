package arrays_control_structures.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CardsDeck {
    private List<Card> deck;
    public CardsDeck (List<Card> deck) {
        this.deck = deck;
    }

    public void shuffleDeck () {
        Collections.shuffle(deck);
    }

    public List<Card> distributeDeck () {
        return deck.subList(0,10);
    }

    public List<String> showCards () {
        List<String> cards = new ArrayList<String>();
        for (Card item : distributeDeck()) {
            cards.add(item.getCard());
        }
        return cards;
    }

    public static void main(String[] args) {

        Card c1 = new Card(Symbol.SEED);
        Card c2 = new Card(Symbol.SEED);
        Card c3 = new Card(Symbol.VALUE);
        Card c4 = new Card(Symbol.SEED);
        Card c5 = new Card(Symbol.SEED);
        Card c6 = new Card(Symbol.VALUE);
        Card c7 = new Card(Symbol.SEED);
        Card c8 = new Card(Symbol.VALUE);
        Card c9 = new Card(Symbol.VALUE);
        Card c10 = new Card(Symbol.SEED);
        CardsDeck cd = new CardsDeck(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10));
        cd.shuffleDeck();
        cd.distributeDeck();
        System.out.println(cd.showCards());

    }
}
