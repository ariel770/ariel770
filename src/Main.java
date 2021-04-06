import java.util.EmptyStackException;

//import java.util.Stack ;
public class Main {

    public static void main(String[] args) {
        Double[] arrayDoubles = {1.1, 2.2, 3.3, 4.4};
        Integer[] arrayInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Stack<Double> doubleStack = new Stack<>();
        Stack<Integer> integerStack = new Stack<>();
        pushToStack("push double ", doubleStack, arrayDoubles);
        pushToStack("push integer", integerStack, arrayInteger);
        getFromStack("get integer ", integerStack);
        getFromStack("get double  ", doubleStack);


    }

    private static <T> void getFromStack(String name, Stack<T> value) {
        try {
            System.out.printf("%n Getting elements from %s %n ",name);
            T tValue;
            while (true) {
                tValue = value.pop();
                System.out.printf("%s ", tValue);

            }
        } catch (EmptyStackException e) {

            System.out.println();
            e.printStackTrace();

        }

    }


    private static <T> void pushToStack(String name ,Stack<T> integerStack, T[] tArray) {
        System.out.printf("%n Pushing elements onto stack %s%n ",name);
        for (T number : tArray) {
            System.out.printf("%s ", number);
            integerStack.push(number);
        }

    }

}

