import java.util.EmptyStackException;
//import java.util.Stack ;
public class Main {

    public static void main(String[] args) {
        Double[] arrayDoubles = {1.1, 2.2, 3.3, 4.4};
        Integer[] arrayInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Stack <Double> doubleStack = new Stack<>();
        Stack <Integer> integerStack = new Stack<>();
        pushDoubleToStack(doubleStack, arrayDoubles);
        pushIntegerToStack(integerStack, arrayInteger);
        getIntegerFromStack(integerStack);
        getDoubleFromStack(doubleStack);


    }

    private static void getIntegerFromStack(Stack<Integer> integerStack) {
        try {
            System.out.printf("%n Getting elements from integerStack %n ");
            Integer integerValue;
            while (true) {
                integerValue = integerStack.pop();
                System.out.printf("%d ", integerValue);

            }
        } catch (EmptyStackException e) {

            System.out.println();
            e.printStackTrace();

        }

    }

    private static void getDoubleFromStack(Stack<Double> doubleStack) {
        try {
            System.out.printf("%n Getting elements from doubleStack %n ");
            Double doubleValue;
            while (true) {
                doubleValue = doubleStack.pop();
                System.out.printf("%.1f ", doubleValue);
            }
        } catch (EmptyStackException e) {

            System.out.println();
            e.printStackTrace();

        }
    }


    private static void pushDoubleToStack(Stack<Double> doubleStack, Double[] arrayDoubles) {
        System.out.printf("%n Pushing elements onto stack %n ");
        for (Double number : arrayDoubles) {
            System.out.printf("%.1f ", number);
            doubleStack.push(number);
        }

    }

    private static void pushIntegerToStack(Stack<Integer> integerStack, Integer[] arrayInteger) {
        System.out.printf("%n Pushing elements onto stack %n ");
        for (Integer number : arrayInteger) {
            System.out.printf("%d ", number);
            integerStack.push(number);
        }

    }

}

