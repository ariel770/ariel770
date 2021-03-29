import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] values = {1, 4, 3, 6, 78, 3, 12, 2, 4, 6, 8};
        //lesson #IntStream - lambdas -int consumer
        IntStream.of(values).forEach(value -> System.out.printf("%d ", value));
        System.out.println();
        System.out.printf("Sum is : %d%n", IntStream.of(values).sum());
        System.out.printf("Count is : %d%n", IntStream.of(values).count());
        System.out.printf("Max is : %d%n", IntStream.of(values).max().getAsInt());
        System.out.printf("Min is : %d%n", IntStream.of(values).min().getAsInt());
        System.out.printf("Avg is : %.2f%n", IntStream.of(values).average().getAsDouble());
        // lesson reduce() instead max(); min(); etc
        System.out.printf("Sum is : %d%n", IntStream.of(values).reduce(0, ((x, y) -> x + y)));
        // lesson #intermidate opertaions and terminal operations
        IntStream.of(values).filter(value -> value % 2 == 0).sorted().forEach(value -> System.out.print(" " + value));
        System.out.println();
        // lesson #intermidate opertaions -map()
        IntStream.of(values).filter(value -> value % 2 != 0).map(value -> value * 10).sorted().forEach(value -> System.out.print(" " + value));
        // lesson #intermidate opertaions -range()
        System.out.println();
        IntStream.range(3, 12).forEach(value -> System.out.print(" " + value));
        //lesson #Integer manipulations
        Integer[] integers = {3, 2, 5, 7, 1, 8, 9, 4, 6, 10};
        System.out.println();
        System.out.println(Arrays.asList(integers));
        System.out.println("=============");
        Arrays.stream(integers).sorted().forEach(value -> System.out.print(" " + value));
        System.out.printf("%s ", Arrays.stream(integers).sorted().collect(Collectors.toList()));
        System.out.println("=============");
        System.out.printf("%s%n",
                Arrays.stream(integers).sorted().collect(Collectors.toList()));
        List<Integer> integerList = Arrays.stream(integers).filter(vv -> vv > 4).sorted().collect(Collectors.toList());
        System.out.println(integerList);

        String[] strings = {"pinjas", "ariel", "Rosemberg", "shterna ", "Newman"};
        System.out.println(Arrays.asList(strings));
        System.out.printf("%s  ", Arrays.stream(strings).map(String::toUpperCase).sorted().collect(Collectors.toList()));
        System.out.println();
        System.out.printf("%s  ", Arrays.stream(strings).map(String::toUpperCase).filter(s -> s.compareToIgnoreCase("m") < 0).collect(Collectors.toList()));
        System.out.println();
        System.out.printf("%s  ", Arrays.stream(strings).map(String::toUpperCase).sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList()));
    }
}

