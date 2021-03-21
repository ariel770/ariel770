import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String colors[] = {"RED", "YELLOW", "BLACK", "BLUE", "WHITE"};
        List<String> listOne = new ArrayList<>();
        for (String color : colors) {
            listOne.add(color);
        }
        String colors1[] = {"BLACK", "BLUE", "WHITE"};
        List<String> removeList = new ArrayList<>();
        for (String color : colors1) {
            removeList.add(color);
        }
        for (int count = 0; count < listOne.size(); count++)
            System.out.print(listOne.get(count) + " - ");

        removeColors(listOne,removeList);
        System.out.println("after removing all the duplicates : ");

        for (int count = 0; count < listOne.size(); count++)
            System.out.print(listOne.get(count) + " - ");


    }

    private static void removeColors(Collection<String> listOne, Collection<String> removeList) {
        Iterator<String> iterator = listOne.iterator();
        while (iterator.hasNext()) {
            if (removeList.contains(iterator.next())) {
                iterator.remove();
            }
        }

    }
}

