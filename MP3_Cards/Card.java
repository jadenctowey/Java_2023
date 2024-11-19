public class Card {
    public static final int HEARTS = 0;
    public static final int SPADES = 1;
    public static final int CLUBS = 2;
    public static final int DIAMONDS = 3;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;
    private int value;
    private int suit;

    public Card() {
        this.value = ACE;
        this.suit = SPADES;
    }
    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }
    public Card(Card other) {
        this.value = other.value;
        this.suit = other.suit;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public int getSuit() {
        return suit;
    }
    public void setSuit(int suit) {
        this.suit = suit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Card) {
            Card other = (Card) obj;
            return this.value == other.value;
        }
        return false;
    }
    @Override
    public String toString() {
        String valueStr;
        String suitStr;

        switch (value) {
            case JACK:
                valueStr = "Jack";
                break;
            case QUEEN:
                valueStr = "Queen";
                break;
            case KING:
                valueStr = "King";
                break;
            case ACE:
                valueStr = "Ace";
                break;
            default:
                valueStr = Integer.toString(value);
        }
        switch (suit) {
            case HEARTS:
                suitStr = "Hearts";
                break;
            case SPADES:
                suitStr = "Spades";
                break;
            case CLUBS:
                suitStr = "Clubs";
                break;
            case DIAMONDS:
                suitStr = "Diamonds";
                break;
            default:
                suitStr = "Unknown";
        }
        return valueStr + " of " + suitStr;
    }
}