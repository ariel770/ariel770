import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            //create an object and assign it to my account

        Account account =new Account("ariel rosemberg" , 10.3);
        Account account1 =new Account("pinjas rosemberg",-54.3);


        System.out.printf("%s balance: $%.2f%n",account.getName(),account.getBalance());

        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());


        Scanner scanner = new Scanner(System.in);

        double deposit ;
        System.out.println("Enter deposit for "+account1.getName() + " please !");
        deposit = scanner.nextDouble() ;
        System.out.printf("%n adding : $%.2f%n   account ",deposit);
        account1.deposit(deposit);
        System.out.printf("%s balance : $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance : $%.2f%n",account.getName(),account.getBalance());


        System.out.println("Enter deposit for "+account.getName() + " please !");
        deposit = scanner.nextDouble() ;
        System.out.printf("%n adding : $%.2f%n  to account ",deposit);
        account.deposit(deposit);
        System.out.printf("%s balance : $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance : $%.2f%n",account.getName(),account.getBalance());






    }
}
