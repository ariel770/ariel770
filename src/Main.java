import java.util.*;

public class Main {

    public static void main(String[] args) {
        String a[] = {"red", "blue", "green", "black","green"};
        List<String> stringList = new ArrayList<>(Arrays.asList(a));
        System.out.println(stringList);
        serachInSet(stringList);

    }

    private static void serachInSet(Collection<String> stringList) {
        Set<String> set = new HashSet<>(stringList);
        System.out.println(set);
    }
}

