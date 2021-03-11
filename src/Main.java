import java.util.Scanner;

public class Main extends Object {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
       boolean conitnueLoop = true;
        do {
            try {
            System.out.print("Enter numerator : ");
            int a = scanner.nextInt();

            System.out.print("Enter denomirator : ");
            int b = scanner.nextInt();
            int result = sum(a, b);
            conitnueLoop = false;
            System.out.println(result);
            } catch (Exception e){
                scanner.nextLine();
                System.out.println(e.getMessage());
            }
        } while (conitnueLoop);


    }

    public static int sum(int numerator, int denominator) {

        return numerator / denominator;
    }
}

