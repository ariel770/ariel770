public class Account {
    //instance variable
    private String name ;
    private double balance ;
    //contractor with parameters
    public Account(String name, double balance){
        this.name=name;
        if(balance > 0.0) {
            this.balance=balance ;
        }
    }


  public void deposit (double deposit){
        if(deposit > 0.0){
        this.balance = this.balance+deposit ;
        }
  }
  public double getBalance (){
        return balance ;
  }
    //method that set the name of  instance variable
    public void setName(String name){
        this.name=name;
    }

    int counter =1;
    //method that get the name from the instance variable
    public String getName(){

        System.out.println(counter++);
        return this.name;
    }

}
