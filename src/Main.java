import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {

        int  [] arr = {12,32,43,5,45,65,656,766,76,67,45,23};
        int total = 5;

        System.out.println(total);
        System.out.println(arr[0]);
        changeValue(arr);
        changeValueInt(total);

        System.out.println(total);
        System.out.println(arr[0]);

    }
    public static void changeValue( int [] arr){
       arr[0]=9;
    }
    public static void changeValueInt( int total){
        total=7;
    }


}

