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
       IntStream.of(values).filter(value -> value%2 == 0 ).sorted().forEach(value -> System.out.print(" "+value));
    }
}

