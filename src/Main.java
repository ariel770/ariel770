import java.util.*;

public class Main {

    public static void main(String[] args) {
        String a[] = {"red", "blue", "green", "black","green"};
        List<String> stringList = new ArrayList<>(Arrays.asList(a));
        serachIntTreeSet(stringList);

    }

    private static void serachIntTreeSet(Collection<String> stringList) {
        SortedSet<String> set = new TreeSet<>(stringList);

        System.out.println(set);
    }
}

