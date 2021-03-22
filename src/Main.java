import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> stringMap = new HashMap<String, Integer>();
        createMap(stringMap);
        displayMap(stringMap);
    }

    private static void createMap(Map<String, Integer> stringMap) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter words : ");
        String line = input.nextLine();
        String[] words = line.split(" ");

        for (String word : words) {
            String newWord = word.toLowerCase();
            if (stringMap.containsKey(newWord)) {
                int count = stringMap.get(newWord);
                stringMap.put(newWord, count + 1);
            } else {
                stringMap.put(newWord, 1);
            }
        }
    }

    private static void displayMap(Map<String, Integer> stringMap) {
        Set <String> keys = stringMap.keySet();
        TreeSet <String> treeSet = new TreeSet<>(keys);
       for (String tree : treeSet)
        System.out.printf("%s %s %n",tree ,stringMap.get(tree) );
      }
}

