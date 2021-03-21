import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main extends Object {
private static  ObjectOutputStream output ;
    public static void main(String[] args) throws IOException {
     openFile();
     writeFile();
     closeFile();

    }

    public static void  openFile(){
        try {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("./src/text.txt")));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error to create output stream");
        }

    }

    public static void writeFile() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

            AccountToSerializable records  = new AccountToSerializable(scanner.nextInt(),
                    scanner.next(),scanner.next(),scanner.nextInt());
            try {
                output.writeObject(records);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void closeFile() throws IOException {

    if(output != null){
        output.close();
    }
    }
}

