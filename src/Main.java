import java.util.*;

public class Main {

    public static void main(String[] args) {
        String colors[] = {"RED", "YELLOW", "BLACK", "BLUE", "WHITE"};


            System.out.println(colors.getClass());
        List<String> listOne = new ArrayList<>(Arrays.asList(colors));
         System.out.println(listOne.getClass());
         colors = listOne.toArray(new String[listOne.size()]);
         System.out.println(colors.getClass());


    }
}

