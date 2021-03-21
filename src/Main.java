import java.util.*;
class Card {
    public static enum Face {A, B, C, D, E, F, G, L, M, N, J, K, V}

    public  static enum Suit {q, w, h, p}

    private final Face face;
    private final Suit suit;

    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    public Face getFace() {
        return face;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }

}
public class Main {

    private static List<Card> list;

    public Main() {
        Card[] card = new Card[52];
        int count = 0;

        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Face face : Card.Face.values()) {
                card[count] = new Card(face, suit);
              count++;
            }
        }
        list = Arrays.asList(card);
        Collections.shuffle(list);


    }

    public static void printCards() {
        for (int count = 0; count < list.size(); count++) {
            System.out.printf("%-19s %s", list.get(count), (((count + 1) % 4 == 0) ? "\n" : " "));
        }
    }


    public static void main(String[] args) {
        Main mm = new Main();
        mm.printCards();

    }
}

