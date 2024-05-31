class Card {
    constructor(suit, rank) {
        this.suit = suit;
        this.rank = rank;
    }

    static SUIT_ORDER = ["Clubs", "Diamonds", "Hearts", "Spades"];
    static RANK_ORDER = ["2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"];

    static compare(a, b) {
        const suitComparison = Card.SUIT_ORDER.indexOf(a.suit) - Card.SUIT_ORDER.indexOf(b.suit);
        if (suitComparison !== 0) return suitComparison;
        return Card.RANK_ORDER.indexOf(a.rank) - Card.RANK_ORDER.indexOf(b.rank);
    }

    toString() {
        return `${this.rank} of ${this.suit}`;
    }
}

const sortCards = (cards) => {
    cards.sort(Card.compare);
}

// Example usage
const cards = [
    new Card("Hearts", "2"),
    new Card("Spades", "Ace"),
    new Card("Diamonds", "10"),
    new Card("Clubs", "King"),
    new Card("Hearts", "Jack")
];

sortCards(cards);

cards.forEach(card => console.log(card.toString()));