import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //calculate average
        int total = 0 ;
        int students = 1 ;
        int grade = 0;

        System.out.println("Enter a result of test ! ");
        Scanner scanner = new Scanner(System.in);
        while(students <= 10){
            grade = scanner.nextInt();
            total += grade ;
            students ++;
            System.out.println("The student #"+students +" has a "+ grade);
        }
        int average = total/students;
        System.out.println("The sum is  : "+ total + " for "+students+" students ,  so the avg is :  "+ average );

    }
}
