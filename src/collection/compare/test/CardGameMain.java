package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGameMain {

    public static void main(String[] args) {
        List<Card> decks = new ArrayList<>();
        String[] trumps = {"\u2660", "\u2665", "\u2666", "\u2663"};

        for (int i = 1; i <= 13; i++) {
            for (String trump : trumps) {
                decks.add(new Card(i, trump));
            }
        }

        System.out.println(decks);
        Collections.shuffle(decks);

        List<Card> player1 = decks.subList(0, 5);
        player1.sort(new NumberComparator());
        int sumPlayer1 = sumCards(player1);
        List<Card> player2 = decks.subList(5, 10);
        player2.sort(new NumberComparator());
        int sumPlayer2 = sumCards(player2);


        System.out.println("플레이어1의 카드: " + player1 + ", " + "합계: " + sumPlayer1);
        System.out.println("플레이어2의 카드: " + player2 + ", " + "합계: " + sumPlayer2);

        if (sumPlayer1 > sumPlayer2) {
            System.out.println("플레이어 1 승리");
        } else if (sumPlayer1 < sumPlayer2) {
            System.out.println("플레이어 2 승리");
        } else {
            System.out.println("무승부");
        }




    }

    private static int sumCards(List<Card> cards) {
        int sum = 0 ;
        for (Card card : cards) {
            sum += card.getNumber();
        }
        return sum;
    }
}

