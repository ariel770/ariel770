import java.util.*;

public class Main {

    public static void main(String[] args) {
        String colors[] = {"RED", "YELLOW", "BLACK", "BLUE", "WHITE"};
       List <Time2> b = new ArrayList<>();
         b.add(new Time2(6,6,6));
         b.add(new Time2(12,13,13));
         b.add(new Time2(18,5,50));
         b.add(new Time2(6,6,6));
         b.add(new Time2(12,13,13));
         b.add(new Time2(18,5,50));
        System.out.println(b);

        Collections.sort(b,new TimeComparator());
       System.out.println(b);


    }
}

