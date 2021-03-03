import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
      if(args.length != 3){
          System.out.println("YOU NEED ENTER THREE NUMBERS !!! ");
      }else{

          int arrLength=Integer.parseInt(args[0]);
          int iteration[] = new int[arrLength];

          int increment = Integer.parseInt(args[1]);
          int firstValue = Integer.parseInt(args[2]);

          for(int counter= 0 ;counter<iteration.length ; counter++){
              iteration[counter] =  firstValue+ increment*counter;
          }
          for(int counter= 0 ;counter<iteration.length ; counter++){
             System.out.println(iteration[counter]);
          }

      }
    }
}