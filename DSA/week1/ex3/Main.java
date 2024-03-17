package DSA.week1.ex3;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Card[] deck = new Card[52];
        String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"Co", "Ro", "Tep", "Bich"};

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = new Card(rank, suit);
            }
        }
        shuffle(deck);

        System.out.println("*****************Bộ bài chưa sắp xếp:***********************");
        for (Card card : deck) {
            System.out.println(card);
        }

        Arrays.sort(deck, new CompareCard());

        System.out.println("\n\n\nBộ bài sau khi sắp xếp:");
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    private static void shuffle(Card[] deck) {
        for (int i = deck.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            Card temp = deck[index];
            deck[index] = deck[i];
            deck[i] = temp;
        }
    }
}
