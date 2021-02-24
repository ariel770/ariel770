import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Students student1 =new Students("ariel rosemberg", 23.0);
        Students student2 =new Students("ariel rosemberg", 75.0);
        System.out.println(student1.getName() +"  "+student1.getLetterGrade());
        System.out.println(student2.getName() +"  "+student2.getLetterGrade());
    }
}
