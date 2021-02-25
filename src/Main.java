import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // break - continue statement

        int counter ;
        for (counter = 0 ;counter<= 10 ;counter++){
            if(counter==5)break;
            System.out.println(counter);

        }
        System.out.println("the iteration has stopped at number : " + counter);
        for (int counter1 = 0 ;counter1<=10 ;counter1++){
            if(counter1==5)continue;
            System.out.println(counter1);

        }
        System.out.println("the iteration has skiped the 5 number");


    }
}
