import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {

        int [] arr = {12,32,43,5,45,65,656,766,76,67,45,23};
        int total =0;
       for(int count : arr){
          total+= count;
       }

        System.out.println(total);
    }

}

