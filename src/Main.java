import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.printf("%n maximum in integers %n %s",
        maximum(1, 2, 3));
        System.out.printf("%n maximum in doubles %n %s",
                maximum(1.1, 2.2, 3.3));
        System.out.printf("%n maximum in characters %n %s",
                maximum('a', 'b', 'c'));

    }


//    //overloaded methods
//    public static void printArray(Integer[] array) {
//        for (Integer ints : array)
//            System.out.printf("%s ", ints);
//        System.out.println();
//    }
//
//    public static void printArray(Double[] array) {
//        for (Double doubles : array)
//            System.out.printf("%s ", doubles);
//        System.out.println();
//    }
//
//    public static void printArray(Character[] array) {
//        for (int a = 0; a < array.length; a++) {
//            System.out.print(array[a] + " ");
//        }
//    }

    //generic methods
//    public static <T> void printArray(T [] array) {
//        for(T arr :  array)
//            System.out.printf("%s ",arr);
//
//        System.out.println();
//
//    }
    public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        return max;
    }


}

