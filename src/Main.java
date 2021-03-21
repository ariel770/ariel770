import java.util.*;

public class Main {

    public static void main(String[] args) {
        String colors[] = {"RED", "YELLOW", "BLACK", "BLUE", "WHITE"};
        List<String> listOne = new ArrayList<>();
        for (String color : colors) {
            listOne.add(color);
        }

        printList(listOne);
        System.out.println();
        transfromInUc(listOne);
        printList(listOne);
        System.out.println();
        removeList(listOne, 1, 3);
        printList(listOne);
        System.out.println();
        printReverse(listOne);

    }

    private static void printReverse(List<String> listOne) {
        ListIterator listIterator = listOne.listIterator(listOne.size());
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }
    }

    private static void transfromInUc(List<String> listOne) {
      ListIterator<String> iterator = listOne.listIterator();
        while (iterator.hasNext()) {

            String color = iterator.next();
            iterator.set(color.toLowerCase());

        }

    }

    private static void removeList(List<String> listOne, int from, int to) {
         listOne.subList(from,to).clear();
    }

    private static void printList(List<String> listOne) {

        for (String colors : listOne) {
            System.out.print(colors + " ");
        }
    }
}

