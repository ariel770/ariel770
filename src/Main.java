import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
       DeckOfCards deckOfCards = new DeckOfCards();
       deckOfCards.shuffle();

       for(int count = 1 ;count <= 52 ;count++){
           System.out.println(deckOfCards.dealCard().toString());
       }

    }

}

