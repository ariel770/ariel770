import java.security.SecureRandom;
import java.util.Random;

public class Main {
    private enum Status {WON , LOSE ,CONTINUE } ;
    /*int myPoint = 0 ;

     private static final int TRY_AGAIN = 3;
     private static final int TREY = 3;
     private static final int TRY_AGAIN = 3;
     private static final int TRY_AGAIN = 3;
*/
    public static void main(String[] args) {
        Craps cr = new Craps();
        Craps cr1 = new Craps();
        System.out.println(cr.getRandom());
        System.out.println(cr1.getRandom());

    }

}
