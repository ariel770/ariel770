import java.security.SecureRandom;

public class Main {

    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();
        int[] frequency = new int[7];
        for (int roll = 0; roll <= 6000000; roll++) {
            ++frequency[sr.nextInt(6)+1];
        }
        for (int show = 1;show<frequency.length;show++){
           System.out.println(frequency[show]);
        }
    }
}

