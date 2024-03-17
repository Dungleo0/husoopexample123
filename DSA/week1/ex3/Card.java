package DSA.week1.ex3;

public class Card implements Comparable<Card> {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " " + suit;
    }

    @Override
    public int compareTo(Card other) {
        // so sanh rank cua 2 quan bai
        int rankComparison = this.rank.compareTo(other.rank);

        // Neu rank khac nhau tra ve ket qua so sanh rank
        if (rankComparison != 0) {
            return rankComparison;
        }

        // neu rank giong nhau tiep tuc so sanh suit
        return this.suit.compareTo(other.suit);
    }
}