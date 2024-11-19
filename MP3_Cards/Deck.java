import java.util.LinkedList;
import java.util.Random;

public class Deck {
    private LinkedList<Card> newCards;
    public Deck() {
        newCards = new LinkedList<>();
        for (int suit = Card.HEARTS; suit <= Card.DIAMONDS; suit++) {
            for (int value = 2; value <= Card.ACE; value++) {
                newCards.add(new Card(value, suit));
            }
        }
    }
    public Deck(Deck other) {
        newCards = new LinkedList<>();
        for (Card card : other.newCards) {
            newCards.add(new Card(card));
        }
    }
    public int size() {
        return newCards.size();
    }
    public Card deal() {
        if (newCards.isEmpty()) {
            return null;
        }
        int index = new Random().nextInt(newCards.size());
        return newCards.remove(index);
    }
    @Override
    public String toString() {
        return newCards.toString();
    }
}