import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double arr[] = {2.2, 3.2, 56.6, 7.3};
        displayarray(arr);
        Arrays.sort(arr);
        displayarray(arr);
        Arrays.fill(arr , 10);
        displayarray(arr);

    }
    public static void displayarray(double [] arr){
        for(int count = 0 ; count<arr.length ;count++)
        {
            System.out.print(arr[count] +"  ");
        }
        System.out.println();
    }
}
