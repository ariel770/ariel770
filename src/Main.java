import java.security.SecureRandom;


public class Main {

    public static void main(String[] args) {
      int frequently1 = 0 ;
      int frequently2 = 0 ;
      int frequently3 = 0 ;
      int frequently4 = 0 ;
      int frequently5 = 0 ;
      int frequently6 = 0 ;
     SecureRandom sr = new SecureRandom();
     for(int rolls =0 ; rolls <= 6000000 ; rolls++ ){
          int face = sr.nextInt(6)+1;
          switch(face){
              case 6 :
                  frequently6++;
                  break;
              case 5 :
                  frequently5++;
                  break;
              case 4 :
                  frequently4++;
                  break;
              case 3 :
                  frequently3++;
                  break;
              case 2 :
                  frequently2++;
                  break;
              case 1 :
                  frequently1++;
                  break;
          }
     }
    System.out.println(frequently1);
    System.out.println(frequently2);
    System.out.println(frequently3);
    System.out.println(frequently4);
    System.out.println(frequently5);
    System.out.println(frequently6);

    }

}
