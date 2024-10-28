package collection.compare.test1;

public class Card implements Comparable<Card> {
    private int rank;
    private Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card anotherCard) {
        if (this.rank != anotherCard.rank) {
            return Integer.compare(rank, anotherCard.rank);
        } else {
            return this.suit.compareTo(anotherCard.suit);
        }

    }

    @Override
    public String toString() {
        return getRank() + "(" + getSuit().getIcon() + ")";
    }
}
