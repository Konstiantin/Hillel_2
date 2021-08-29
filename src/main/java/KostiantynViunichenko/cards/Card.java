package KostiantynViunichenko.cards;

public class Card {

   private final Rank rank ;
   private final Suit suit;

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + "Off " + suit;
    }
}
