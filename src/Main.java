import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main extends Object {
    private static Formatter output;

    public static void main(String[] args) throws IOException {
        openFile();
        addRecords();
        closeFile();
    }

    public static void openFile() {
        try {
            output = new Formatter("./src/text.txt");
        } catch (SecurityException e) {
            System.out.println("Program is terminating " + e.getMessage());
            System.exit(1);
        } catch (FileNotFoundException e) {
            System.out.println("Program is terminating " + e.getMessage());
            System.exit(1);
        }

    }

    public static void addRecords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please number , firstname ,lastname ,deposit : ");
        while (scanner.hasNext()) {
            try {
                output.format("%d %s %s %.2f%n", scanner.nextInt(), scanner.next(),
                        scanner.next(), scanner.nextDouble());
            } catch (FormatterClosedException e) {
                System.out.println(e.getMessage());
                break;
            } catch (NoSuchElementException e) {
                System.out.println("NoSuchElementException , Please try again :");
                scanner.nextLine();
            }
            System.out.print("?");
        }

    }

    public static void closeFile() {
        if (output != null) {
            output.close();
        }


    }
}

