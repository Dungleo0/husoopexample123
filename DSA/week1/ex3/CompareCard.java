package DSA.week1.ex3;

import java.util.Comparator;

public class CompareCard implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
        // so sanh rank cua 2 quan bai
        int rankComparison = card1.getRank().compareTo(card2.getRank());

        // Neu rank khac nhau tra ve ket qua so sanh rank
        if (rankComparison != 0) {
            return rankComparison;
        }
        String s1 = card1.getSuit();
        String s2 = card2.getSuit();

        if(s1.equalsIgnoreCase("Co")){
            return -1;
        }else if(s1.equalsIgnoreCase("Ro")){
            return 0;
        }else {
            return 1;
        }
        // neu rank giong nhau tiep tuc so sanh suit

    }
}
