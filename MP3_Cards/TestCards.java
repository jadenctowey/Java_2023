import java.util.LinkedList;
public class TestCards {
    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card(Card.KING, Card.CLUBS);
        Card card3 = new Card(card2);
        System.out.println("1: " + card1);
        System.out.println("2: " + card2);
        System.out.println("3: " + card3);
        System.out.println("2 equals 3? " + card2.equals(card3));
        card3.setValue(Card.QUEEN);
        System.out.println("3 changed: " + card3);
        System.out.println("2 = 3? " + card2.equals(card3));
        Deck deck1 = new Deck();
        System.out.println("1: " + deck1);
        System.out.println("1 size: " + deck1.size());
        Card dealtCard = deck1.deal();
        System.out.println("Dealt card: " + dealtCard);
        System.out.println("Deck1 after dealing: " + deck1);
        System.out.println("Deck1 size after dealing: " + deck1.size());
        Dealer dealer = new Dealer();
        System.out.println("Dealer's deck: " + dealer);
        System.out.println("Dealer's deck size: " + dealer.size());
        LinkedList<Card> dealtCards = dealer.deals(5);
        System.out.println("Dealt cards: " + dealtCards);
        System.out.println("Dealer's deck after dealing: " + dealer);
        System.out.println("Dealer's deck size after dealing: " + dealer.size());
    }
}