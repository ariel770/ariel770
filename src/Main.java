import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {

        int[][] gradesBook ={
                {12, 32, 43},
                {5, 45, 65},
                {56, 96, 76},
                {67, 45, 23}};
      GradeBook gradeBook = new GradeBook(gradesBook,"JAVA 2D Arrays");
      gradeBook.getResults();
    }

}