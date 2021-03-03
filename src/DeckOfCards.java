import java.security.SecureRandom;

public class DeckOfCards {
    private static final int numberOfDeck = 52;
    public static final SecureRandom sr = new SecureRandom();
    Cards[] deck;
    private int currentDeck;

    public DeckOfCards() {
        String[] suit = {"A", "B", "C", "D", "E", "F", "G", "L", "M", "F", "O", "M", "N"};
        String[] face = {"1", "2", "3", "4"};
        deck = new Cards[numberOfDeck];
        currentDeck = 0;
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Cards(face[count / 13], suit[count % 13]);
        }
    }

    public void shuffle() {
        currentDeck = 0;
        for (int first = 0; first < deck.length; first++) {
            int second =sr.nextInt(numberOfDeck);
            Cards temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;

        }

    }

    public Cards dealCard() {

        if (currentDeck < deck.length) {
            return deck[currentDeck++];
        } else {
            return null;
        }


    }
}
