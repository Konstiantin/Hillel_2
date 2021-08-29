package KostiantynViunichenko.cards;

public class View {
    public static void main(String[] args) {
        Rank rank = Rank.ACE;

        System.out.print(rank.getTranslation()+" ");

        Suit suit = Suit.DIAMONDS;

        System.out.println(suit.getNumber());

        Rank king1 = Rank.KING;

        System.out.println(king1.ordinal());

        Deck deck = new Deck();
        System.out.println(deck);

    }
}
