public class Cards {
    private final String suit;
    private final String face;

    public Cards(String suit, String face) {
        this.suit = suit;
        this.face = face;
    }
    public String toString() {
        return suit +" of "+face ;
    }
}
