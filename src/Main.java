import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        int responses[] = {1, 3, 4, 5, 2, 1, 3, 4, 5, 4, 4, 13};
        int frequency[] = new int[6];
        for (int count = 0; count < responses.length; count++) {
            try {
                ++frequency[responses[count]];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

        }
        for (int count = 1; count < frequency.length; count++) {
            System.out.println(frequency[count]);
        }


    }

}

