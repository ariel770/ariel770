import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
//        int[] values = {1, 4, 3, 6, 78, 3, 12, 2, 4, 6, 8};
//        //lesson #IntStream - lambdas -int consumer
//        IntStream.of(values).forEach(value -> System.out.printf("%d ", value));
//        System.out.println();
//        System.out.printf("Sum is : %d%n", IntStream.of(values).sum());
//        System.out.printf("Count is : %d%n", IntStream.of(values).count());
//        System.out.printf("Max is : %d%n", IntStream.of(values).max().getAsInt());
//        System.out.printf("Min is : %d%n", IntStream.of(values).min().getAsInt());
//        System.out.printf("Avg is : %.2f%n", IntStream.of(values).average().getAsDouble());
//        // lesson reduce() instead max(); min(); etc
//        System.out.printf("Sum is : %d%n", IntStream.of(values).reduce(0, ((x, y) -> x + y)));
//        // lesson #intermidate opertaions and terminal operations
//        IntStream.of(values).filter(value -> value % 2 == 0).sorted().forEach(value -> System.out.print(" " + value));
//        System.out.println();
//        // lesson #intermidate opertaions -map()
//        IntStream.of(values).filter(value -> value % 2 != 0).map(value -> value * 10).sorted().forEach(value -> System.out.print(" " + value));
//        // lesson #intermidate opertaions -range()
//        System.out.println();
//        IntStream.range(3, 12).forEach(value -> System.out.print(" " + value));
//        //lesson #Integer manipulations
//        Integer[] integers = {3, 2, 5, 7, 1, 8, 9, 4, 6, 10};
//        System.out.println();
//        System.out.println(Arrays.asList(integers));
//        System.out.println("=============");
//        Arrays.stream(integers).sorted().forEach(value -> System.out.print(" " + value));
//        System.out.printf("%s ", Arrays.stream(integers).sorted().collect(Collectors.toList()));
//        System.out.println("=============");
//        System.out.printf("%s%n",
//                Arrays.stream(integers).sorted().collect(Collectors.toList()));
//        List<Integer> integerList = Arrays.stream(integers).filter(vv -> vv > 4).sorted().collect(Collectors.toList());
//        System.out.println(integerList);
//
//        String[] strings = {"pinjas", "ariel", "Rosemberg", "shterna ", "Newman"};
//        System.out.println(Arrays.asList(strings));
//        System.out.printf("%s  ", Arrays.stream(strings).map(String::toUpperCase).sorted().collect(Collectors.toList()));
//        System.out.println();
//        System.out.printf("%s  ", Arrays.stream(strings).map(String::toUpperCase).filter(s -> s.compareToIgnoreCase("m") < 0).collect(Collectors.toList()));
//        System.out.println();
//        System.out.printf("%s  ", Arrays.stream(strings).map(String::toUpperCase).sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList()));
//
//        // lesson # employees manipulations
//        StreemEmployee[] streemEmployees = {new StreemEmployee("rosemberg", "ariel", 300, 1),
//                new StreemEmployee("levi", "daniel", 200, 2),
//                new StreemEmployee("rosemberg", "avraham ", 400, 1),
//                new StreemEmployee("levi", "yojay", 200, 2),
//                new StreemEmployee("levi", "daniel", 200, 2),
//                new StreemEmployee("cohen", "israel", 100, 3)};
//        List<StreemEmployee> sEL = Arrays.asList(streemEmployees);
//        System.out.println();
//
//        Predicate<StreemEmployee> towToThreeHundred = (streemEmployee -> streemEmployee.getSalary() < 400 && streemEmployee.getSalary() > 100);
//        System.out.printf("%n The result above 100 and beyond 400 :  %n ");
//        sEL.stream()
//                .filter(towToThreeHundred)
//                .sorted(Comparator.comparing(StreemEmployee::getSalary))
//                .forEach(System.out::println);
//        System.out.printf("%n The first result above 100 and beyond 400 :   %n%s   ",
//                sEL.stream()
//                        .filter(towToThreeHundred)
//                        .findFirst().get());
//
//
//        Function<StreemEmployee, String> getLastName = StreemEmployee::getLastName;
//        Function<StreemEmployee, String> getFirstName = StreemEmployee::getFirstName;
//        Comparator<StreemEmployee> lastAndFirst = Comparator.comparing(getLastName).thenComparing(getFirstName);
//
//        System.out.printf("%n%n%nThe result filtered and sorted by first name and then by last name :   %n%n%n");
//        sEL.stream()
//                .sorted(lastAndFirst)
//                .forEach(System.out::println);
//
//        System.out.printf("%n%n%nThe result map and distinct by last name  :   %n%n%n");
//        sEL.stream()
//                .sorted(lastAndFirst)
//                .map(StreemEmployee::getLastName)
//                .distinct()
//                .forEach(System.out::println);
//
//
//        Map<Integer, List<StreemEmployee>> listByDepartment =
//                sEL.stream().collect(Collectors.groupingBy(StreemEmployee::getDepartment));
//        listByDepartment.forEach((department, list) ->
//                {
//                    System.out.println(department);
//                    list.forEach(System.out::println);
//                }
//
//        );
//
//        Map<Integer, Long> countByDepartment =
//                sEL.stream().collect(Collectors.groupingBy(StreemEmployee::getDepartment, TreeMap::new, Collectors.counting()));
//        countByDepartment.forEach((department, list) ->
//                {
//                    System.out.printf("%n the department %d has :  %d %n ", department, list);
//                }
//
//        );
//
//        System.out.printf("%n%nThe sum via sum method %s ",
//                sEL.stream().mapToDouble(StreemEmployee::getSalary).sum());
//        System.out.printf("%n%nThe avg via average method %s ",
//                sEL.stream().mapToDouble(StreemEmployee::getSalary).average().getAsDouble());
//
//
//


        Pattern pattern = Pattern.compile("\\s+");
        Map<String, Long> stringLongMap = Files.lines(Paths.get("text.txt"))
                .map(lines -> lines.replaceAll("(?!')\\p{P}", ""))
                .flatMap(words -> pattern.splitAsStream(words))
                .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()));
        stringLongMap.entrySet().stream()
                .collect(Collectors.groupingBy(entry -> entry.getKey().charAt(0), TreeMap::new, Collectors.toList()))
                .forEach((letter, wordList) ->
                        {
                            System.out.printf("%n%C%n", letter);
                            wordList.stream()
                                    .forEach(word -> System.out.printf("%13s : %d%n", word.getKey(), word.getValue()));
                        }
                );
        SecureRandom sr = new SecureRandom();
        sr.ints(6_000_000,1,7)
                .boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((face, frequency)-> System.out.printf("%-6d%d%n",face,frequency) );


    }

}

