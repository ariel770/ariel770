import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main extends Object {
    private static ObjectInputStream input;

    public static void main(String[] args) throws IOException {
        openFile();
        readFile();
        closeFile();

    }

    public static void openFile() {
        try {
            input = new ObjectInputStream(Files.newInputStream(Paths.get("./src/text.txt")));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error to create input stream");
        }

    }

    public static void readFile() {

        try {
            while (true) {

                AccountToSerializable records = (AccountToSerializable) input.readObject();
                System.out.printf("%s %s %s %s %n",records.getAccountNumber(), records.getFirstName(), records.getLastName(), records.getBalance());
            }
        } catch (EOFException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void closeFile() throws IOException {

        if (input != null) {
            input.close();
        }
    }
}

