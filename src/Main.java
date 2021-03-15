import java.util.Scanner;

public class Main extends Object {
    public static void main(String[] args) {
        try {
            throwExeptions();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("throw for exeptions");
        }

    }

    public static void throwExeptions() throws Exception {

        try {
            throw new Exception();

        } catch (Exception e) {
            System.out.println("throw second exeptions");
            System.out.println(e.getMessage());
        } finally {
            throw new Exception();
        }
    }
}

