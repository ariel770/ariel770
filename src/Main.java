import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main extends Object {
    private static Scanner input;

    public static void main(String[] args) throws IOException {
        openFile();
        readRecords();
        closeFile();
    }

    public static void openFile() {
        try {
            input = new Scanner(Paths.get("./src/text.txt"));
        } catch (IOException e) {
            System.out.println("Program is terminating " + e.getMessage());
            System.exit(1);
        }

    }

    public static void readRecords() {
        while (input.hasNext()) {
            try {
                System.out.printf("%d %s %s %.2f%n", input.nextInt(), input.next(),
                        input.next(), input.nextDouble());
            } catch (FormatterClosedException e) {
                System.out.println(e.getMessage());
                break;
            } catch (NoSuchElementException e) {
                System.out.println("NoSuchElementException , Please try again :");
                input.nextLine();
            }
        }

    }

    public static void closeFile() {
        if (input != null) {
            input.close();
        }


    }
}

