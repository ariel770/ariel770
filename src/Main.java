import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {

        int[][] arr1 = {{12, 32, 43}, {5, 45, 65}, {56, 96, 76}, {67, 45, 23}};
        int[][] arr2 = {{12, 32, 43}, {56, 76}, {67, 45, 23}};
        displayArray(arr1);
        displayArray(arr2);

    }

    public static void displayArray(int[][] arr1) {
        for (int counter = 0; counter < arr1.length; counter++) {
            for (int value = 0; value < arr1[counter].length; value++) {
                System.out.print(arr1[counter][value] + " ");

            }
            System.out.println();

        }
    }

}