import java.util.Scanner;

public class Main extends Object {
    public static void main(String[] args) {
      try{
          method1();

      }catch(Exception e){

          System.out.println(e.getMessage());
          e.printStackTrace();
          StackTraceElement [] exception = e.getStackTrace();

          for(StackTraceElement ste :exception){
              System.out.println(ste);
          }


      }
    }
    public  static void method1() throws Exception {
        method2();
    }
    public  static void method2() throws Exception {
        method3();
    }
    public  static void method3() throws Exception {
        throw new Exception("Exeption in method 3");
    }

}

