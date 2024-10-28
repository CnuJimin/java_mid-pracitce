package collection.compare.test;

import java.util.List;

public class Card implements Comparable<Card> {
    private String trump;
    private int number;

    @Override
    public int compareTo(Card o) {
        return this.trump.compareTo(o.trump);
    }

    public Card(int number, String trump) {
        this.trump = trump;
        this.number = number;
    }

    public String getTrump() {
        return trump;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[" + this.number + "(" + this.trump + ")]";
    }
}
