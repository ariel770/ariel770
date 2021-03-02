import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[7];
        SecureRandom sr = new SecureRandom();
        for (int count = 0; count <= 6000000; count++) {
            ++arr[1 + sr.nextInt(6)];
        }
        for (int count = 1; count < arr.length; count++) {
            System.out.println(arr[count]);
        }

    }

}

