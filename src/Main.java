import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            //create an object and assign it to my account

        Account account =new Account("ariel rosemberg");
        Account account1 =new Account("pinjas rosemberg");


        System.out.printf("The first name  :  %n%s%n ",account.getName());

        System.out.printf("The second name is :  %n%s%n ",account1.getName());
    }
}
