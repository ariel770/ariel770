import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //calculate average
        int total = 0 ;
        int students = 0 ;
        int grade = 0;

        System.out.println("Enter a results of test ! ");
        Scanner scanner = new Scanner(System.in);
        grade = scanner.nextInt();
        while(grade != -1){
            total += grade ;
            students ++;
            System.out.println("The student #"+students +" has a "+ grade);
            System.out.println(" If you want to exit press -1  !");
            grade = scanner.nextInt();
        }
        if(total != 0 ){

            double  average = (double)total/students;
            System.out.println("The sum is  : "+ total + " for "+students+" students ,  so the avg is :  "+ average );
        }

    }
}
