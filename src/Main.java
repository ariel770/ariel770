import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Main extends Object {

        private static MenuOption[] choices = MenuOption.values();
    private static Scanner input;

    public static void main(String[] args) {
        openFile();
        readFile();
        closeFile();

    }

//    public static void openFile() {
//        try {
//            output = new Formatter("./src/text.txt");
//        } catch (FileNotFoundException e) {
//            e.getMessage();
//            System.exit(1);
//
//        }catch(SecurityException e) {
//            e.getMessage();
//            System.exit(1);
//        }
//
//    }
//
//    public static void addRecords() {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//
//            try {
//                output.format("%d %s %s %d%n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt());
//
//            } catch (FormatterClosedException formatterClosedException){
//                System.out.println("ERROR 1");
//                break;
//            }catch (NoSuchElementException noSuchElementException){
//                System.out.println("ERROR 2");
//                break;
//            }
//            System.out.print("? ");
//
//        }
//
//    }
//
//    public static void closeFile() {
//        if (output != null) {
//            output.close();
//        }

//    }

    public static void openFile() {
        try {
            input = new Scanner(Paths.get("./src/text.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readFile() {
        while (input.hasNext()) {
            System.out.printf("%d %s %s %d%n", input.nextInt(),
                    input.next(), input.next(), input.nextInt());

        }

    }

    public static void closeFile() {
        if (input != null) {
            input.close();

        }

    }
}

