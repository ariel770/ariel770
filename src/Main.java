import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
     double a =10 ;
     double b =20;
     double c =30;
     double d =40;
     double e =50;
     addDoubles(a,b,e);

    }
    public static double addDoubles(double... doubles){
         double s = 0 ;
        for(int count =0 ; count < doubles.length;count++  ){
            s += doubles[count];
        }
       System.out.println(s);
        return s;
    }
}