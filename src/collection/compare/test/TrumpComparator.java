package collection.compare.test;

import java.util.Comparator;

public class TrumpComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        return o1.getTrump().compareTo(o2.getTrump());
    }
}
