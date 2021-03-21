import java.util.*;

public class Main {

    public static void main(String[] args) {
        String colors[] = {"RED", "YELLOW", "BLACK", "BLUE", "WHITE"};
       List <String> b = new LinkedList<>(Arrays.asList(colors));
       List <String> a = Arrays.asList(colors);
       Collections.sort(a);
       System.out.println(a);
       System.out.println(b);


    }
}

