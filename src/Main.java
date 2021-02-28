import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SecureRandom sr = new SecureRandom();
        for(int counter =1 ; counter<= 20 ;counter++){
            System.out.print(" "+sr.nextInt(6));
            if(counter % 5 == 0 ){
                System.out.println();

            }


        }
     }

}
