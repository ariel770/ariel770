import java.security.SecureRandom;
import java.util.Random;

public class Main {
    private enum Status {WON , LOSE ,CONTINUE } ;

   private static final SecureRandom sr = new SecureRandom();
     private static final int SNAKE_EYES = 2;
     private static final int TREY = 3;
     private static final int SEVEN =7;
     private static final int YO_LEVEN = 11;
     private static final int BOX_CARS = 12;

    public static void main(String[] args) {
         int myPoint = 0 ;
         Status newstatus ;
        int face  = rolldice();
        switch(face){
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
               newstatus =   Status.WON;
               break;
            case SEVEN:
                newstatus =Status.LOSE ;
                break;
            default:
                newstatus = Status.CONTINUE;
                myPoint = face ;
                System.out.println("my new point : "+ myPoint);
                break;
        }
        while (newstatus == Status.CONTINUE ){
            face = rolldice();
                if(face == myPoint){
                    newstatus =Status.WON;
                }
                else
                    if(face == SEVEN){
                     newstatus = Status.LOSE;
                    }
        }
        if(newstatus == Status.WON){
            System.out.println("the player won");
        }else{
            System.out.println("the player lose");
        }

    }
    public static int  rolldice() {
        int die1 = 1+sr.nextInt(6);
        int die2 = 1+sr.nextInt(6);
        int sum = die1+die2;

        System.out.print(die1 );
        System.out.print(" ");
        System.out.print(die2);
        System.out.print(" ");
        System.out.print(sum);
        System.out.println();

        return sum;
    }

    }

