import java.security.SecureRandom;

public class GradeBook {
     private int [] grades ;
     private String nameOfClass ;

    public GradeBook(int[] grades , String nameOfClass){
       this.grades =grades ;
       this.nameOfClass=nameOfClass;
    }
    public void getResults (){
        outputGrades();
        System.out.println("The maximum grade is : "+ getMaximum());
        System.out.println("The minimum grade is : "+ getMinimum());
        System.out.println("The averages of  grades is : "+ getAverage());
        outputBarChart();

    }
    public  void outputBarChart (){
        int frequency [] = new int[10];
        for(int count =0 ;count < grades.length;count++) {
            ++frequency[grades[count] / 10];

        }
            for(int first = 0 ; first<frequency.length;first++){
                for(int second =0 ;second < frequency[first];second++){
                    System.out.print("*");
                }
                System.out.println();
            }


    }
    public void outputGrades (){
        for(int count =0 ;count < grades.length;count++){
            System.out.println("Student : "+ grades[count]);
        }
    }
    public int getMaximum(){
        int initialize = grades[0];
        for(int count =0 ; count<grades.length ;count++){
            if(grades[count] > initialize){
                initialize = grades[count];
            }
        }
        return initialize ;
    }
    public int getMinimum(){
        int initialize = grades[0];
        for(int count =0 ; count<grades.length ;count++){
            if(grades[count] < initialize){
                initialize = grades[count];
            }
        }
        return initialize ;
    }
    public int getAverage(){
        int initialize = 0;

        for(int count =0 ; count<grades.length ;count++){
           initialize += grades[count];
        }
        return initialize / grades.length ;
    }

}
