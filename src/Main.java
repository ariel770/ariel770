import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Main extends Object {

        private static MenuOption[] choices = MenuOption.values();

    public static void main(String[] args) {

 MenuOption accountType = getRequest();
        while (accountType != MenuOption.END) {
            switch (accountType) {
                case ZERO_BALANCE:
                    System.out.printf("%n Account with zero balance %n");
                    break;
                case DEBIT_BALANCE:
                    System.out.printf("%n Account with debit balance %n");
                    break;
                case CREDIT_BALANCE:
                    System.out.printf("%n Account with credit balance %n");
                    break;
            }
            readRecords(accountType);
            accountType = getRequest();
        }
    }

    public static MenuOption getRequest() {
        int request = 4;
        try {

            Scanner input = new Scanner(System.in);
            do {
                System.out.printf("%n ? ");
                request = input.nextInt();
            } while ((request < 0) || (request > 4));
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println("error");
        }
        return choices[request - 1];
    }

    private static void readRecords(MenuOption accountType) {
        try (Scanner scanner = new Scanner(Paths.get("./src/text.txt"))) {
            while (scanner.hasNext()) {
                int accountNumber = scanner.nextInt();
                String firstName = scanner.next();
                String lastName = scanner.next();
                int balance = scanner.nextInt();
                if (shuldDisplay(balance, accountType)) {
                    System.out.print(accountNumber +" ");
                    System.out.print(firstName+ " ");
                    System.out.print(lastName+" ");
                    System.out.print(balance +" ");
                } else {
                    scanner.nextLine();
                }

            }

        } catch (NoSuchElementException | IllegalStateException | IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

    }

    private static boolean shuldDisplay(double balance, MenuOption accountType) {
        if ((accountType == MenuOption.CREDIT_BALANCE) && (balance < 0)) {
            return true;
        } else if ((accountType == MenuOption.DEBIT_BALANCE) && (balance > 0)) {
            return true;
        } else if ((accountType == MenuOption.ZERO_BALANCE) && (balance == 0)) {
            return true;
        }
        return false;
    }

}

