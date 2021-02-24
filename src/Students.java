public class Students {
    private String name ;
    private double average ;

    public Students(String name , double average ){

        this.name =name ;
        if(average > 0.0 && average<100.0){
            this.average = average;
        }
    }

    public String getName (){
        return name ;
    }
    public void setName(String name ){
    this.name =name ;
    }
    public void setAverage(double average) {
        if(average > 0.0 && average<100.0){
            this.average = average;
        }
    }
    public String getLetterGrade  (){
       String letterGrade = "";
       if(average == 0){
           letterGrade = "A";
       }else if(average > 30 ){
           letterGrade = "B";
        }else if(average > 70){
            letterGrade = "C";
        }else if(average > 90 ) {
           letterGrade = "D";
       } else{
           letterGrade = "G";
       }
        return letterGrade;
    }
}
