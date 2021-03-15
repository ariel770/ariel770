import java.util.Scanner;

public class Main extends Object {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    assert (number >= 0 && number <= 10 ) : " bad number : " + number ;
    System.out.println(number);
    }
}

