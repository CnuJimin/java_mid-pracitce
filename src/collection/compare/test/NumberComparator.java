package collection.compare.test;

import java.util.Comparator;

public class NumberComparator implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        return o1.getNumber() > o2.getNumber() ? 1 : o1.getNumber() < o2.getNumber() ? -1 : o1.getNumber() == o2.getNumber() ? o1.getTrump().compareTo(o2.getTrump()) : 0;
    }
}
