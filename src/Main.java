import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         int aCount = 0 ;
         int bCount = 0 ;
         int cCount = 0 ;
         int dCount = 0 ;
         int fCount = 0 ;
         int total = 0 ;
         int countOfGrades = 0 ;
         Scanner scanner = new Scanner(System.in);
System.out.println("Enter the grades : the result has divided by letters ");
        while(scanner.hasNext()){

           int grade = scanner.nextInt();
            total += grade;
            ++countOfGrades;

            switch (grade/10){

             case 10 :
             case 9 :
                 break;
             case 8 :
                 bCount++;
                 break;
             case 7 :
                 cCount++;
                 break;
             case 6 :
                 dCount++;
                 break;
             default:
                 fCount++;
                 break;

            }
        }
        System.out.println("A :" + aCount);
        System.out.println("=====");
        System.out.println("B :" + bCount);
        System.out.println("C :" + cCount);
        System.out.println("D :" + dCount);
    }
}
