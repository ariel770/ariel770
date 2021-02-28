import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter double numbers to test which is the higher  (separate by Enter ) : ");
        Scanner scanner = new Scanner(System.in);
        double one = scanner.nextDouble();
        double tow = scanner.nextDouble();
        double three = scanner.nextDouble();
        double max =  maximum(one,tow,three);
        System.out.println("The high number is : "+ max);
    }
    public static double maximum(double one ,double tow ,double three ) {
        double maxValue = one;
        if(tow > maxValue){
            maxValue = tow;
        }if (three  > maxValue){
            maxValue = three;
        }
        return maxValue ;
    }
}
