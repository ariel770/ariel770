public class Account {

    private String name ;//instance variable
//     contractor with parameters
    public Account(String name){
       this.name=name;

    }



    //method that set the name of  instance variable
    public void setName(String name){
        this.name=name;
    }
    //method that get the name from the instance variable
    public String getName(){
        
        return this.name;
    }

}
