import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Dictionary;
import java.util.Scanner;

public class Main extends Object {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter Path  :");
        Scanner input = new Scanner(System.in);

        Path path = Paths.get(input.nextLine());
        System.out.println("File System p: "+ path.getFileSystem());
        System.out.println("File Name  p: "+ path.getFileName());
        System.out.println("File get Root p: "+ path.getRoot());
        System.out.println("File directory f: "+ Files.isDirectory(path));
        System.out.println("File lastModify f: "+ Files.getLastModifiedTime(path));
        if(Files.isDirectory(path)){
            DirectoryStream<Path> ds = Files.newDirectoryStream(path);
            for(Path p :ds){
                System.out.println(p);

            }
        }
    }
}

