import java.security.SecureRandom;

public class Main {
   static int  x =1 ;

    public static void main(String[] args) {
    getInt();
    getStaticInt();
    getInt();
    getStaticInt();
    }
    public static  void getInt(){
        int x = 10;
        x += 10 ;
        System.out.println(x);
    }
    public static  void getStaticInt(){

        System.out.println(x);
        x= x*10;
        System.out.println(x);
    }

    }

