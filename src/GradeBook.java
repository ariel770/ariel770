import java.math.BigDecimal;
import java.text.NumberFormat;

public class GradeBook {
    private int[][] grades;
    private String nameOfClass;

    public GradeBook(int[][] grades, String nameOfClass) {
        this.grades = grades;
        this.nameOfClass = nameOfClass;
    }

    public void getResults() {
        System.out.println("The maximum grade is : " + getMaximum());
        for(int a = 0 ;a<grades.length; a++){
                double averageForEach = setAverage(grades[a]);
                System.out.println("============");
                System.out.println(averageForEach);
        }

    }

    //    public  void outputBarChart (){
//        int frequency [] = new int[10];
//        for(int count =0 ;count < grades.length;count++) {
//            ++frequency[grades[count] / 10];
//
//        }
//            for(int first = 0 ; first<frequency.length;first++){
//                for(int second =0 ;second < frequency[first];second++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//
//
//    }
/*    public void outputGrades (){
        for(int count =0 ;count < grades.length;count++){
            System.out.println("Student : "+ grades[count]);
        }
    }*/

    public int getMaximum() {
        int initialize = grades[0][0];
        for (int first = 0; first < grades.length; first++) {
            for (int count = 0; count < grades[first].length; count++) {
                if (grades[first][count] > initialize) {
                    initialize = grades[first][count];
                }
            }

        }
        return initialize;
    }

    public double setAverage(int[] setOfGrades) {
        int initialize = 0;

        for (int count = 0; count < setOfGrades.length; count++) {
            initialize += setOfGrades[count];
        }
        return (double) initialize/setOfGrades.length  ;


    }
}
