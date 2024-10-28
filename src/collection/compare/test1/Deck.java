package collection.compare.test1;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
        shuffle();
    }

    private void initCard() {
        for (int i = 1; i < 14; i++) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(i, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.removeFirst();
    }

}
