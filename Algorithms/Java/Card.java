import java.util.*;

class Card {
    private String suit;
    private String rank;

    private static final List<String> SUIT_ORDER = Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades");
    private static final List<String> RANK_ORDER = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    public static void main(String[] args) {
        List<Card> cards = Arrays.asList(
            new Card("Hearts", "2"),
            new Card("Spades", "Ace"),
            new Card("Diamonds", "10"),
            new Card("Clubs", "King"),
            new Card("Hearts", "Jack")
        );

        cards.sort(Comparator.comparing((Card card) -> SUIT_ORDER.indexOf(card.getSuit()))
                             .thenComparing(card -> RANK_ORDER.indexOf(card.getRank())));

        cards.forEach(System.out::println);
    }
}
