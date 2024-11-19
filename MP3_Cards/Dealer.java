import java.util.LinkedList;

public class Dealer {
    private Deck newDeck;
    public Dealer() {
        newDeck = new Deck();
    }
    public LinkedList<Card> deals(int n) {
        LinkedList<Card> dealtCards = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Card card = newDeck.deal();
            if (card != null) {
                dealtCards.add(card);
            } else {
                break;
            }
        }
        return dealtCards;
    }
    public int size() {
        return newDeck.size();
    }

    @Override
    public String toString() {
        return newDeck.toString();
    }
}