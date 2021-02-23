import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     String name ;
       //create an object and assign it to my account
        Account account =new Account();
        System.out.printf("Initial name is :  %s%n%n ",account.getName());
        System.out.println("Enter your name please !");
        name = scanner.nextLine();
        account.setName(name);
        System.out.printf("The name is :  %n%s%n ",account.getName());
    }
}
