package KostiantynViunichenko.cards;

public class Deck {

    final static Card [] cards = new Card[36];

    public Deck () {
        int i=0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
             cards [i++] = new Card (rank,suit);
            }
        }
    }
    @Override
    public String toString() {
        String str = " ";
        for ( Card card : cards) {
            str += card.getRank().getTranslation() + " " + card.getSuit() + " ,\n";
        }
        return str;
    }
}
