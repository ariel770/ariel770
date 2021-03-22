import java.util.*;

public class Main {

    public static void main(String[] args) {
        String a[] = {"red", "blue", "green", "black"};
        List<String> stringList = new ArrayList<>(Arrays.asList(a));
        Collections.sort(stringList);
        for (int count = 0; count < stringList.size(); count++) {
            System.out.println(stringList.get(count));
        }
        searchIndex(stringList, "red");
        searchIndex(stringList, "green");
        searchIndex(stringList, "yellow");

    }

    public static void searchIndex(List<String> list, String key) {

        int result = 0;
        result = Collections.binarySearch(list, key);
        if (result >= 0) {
            System.out.println(key + " : " + result);
        } else {
            System.out.println(" not found " + key + "  : " + result);
        }
    }
}

