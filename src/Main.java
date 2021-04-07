import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Number[] numbers = {2, 3.4, 5, 4.5, 3, 2.2};
        Integer[] integers = {2,  5, 3};
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<Number> numberArrayList = new ArrayList<>();
        for (Number number : numbers) {
            numberArrayList.add(number);
        }
        for (Integer integer : integers) {
            integerArrayList.add(integer);
        }


        sum(numberArrayList);
        sum(integerArrayList);

    }

    private static void sum(ArrayList<? extends Number > list) {
        double numbers = 0;
        for (Number number : list) {
            numbers += number.doubleValue();
        }
        System.out.printf("%n%s%n",numbers);
    }

}

