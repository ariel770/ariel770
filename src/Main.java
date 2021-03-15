import java.util.Scanner;

public class Main extends Object {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String lastname = input.nextLine();
    if(!ValidateInput.lastName(lastname)){
        System.out.println("is invalid !");
    }
    }
}

