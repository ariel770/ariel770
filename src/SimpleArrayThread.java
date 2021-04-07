import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArrayThread {
    private static SecureRandom secureRandom = new SecureRandom();
    private final int[] array;
    private static int writeIndex = 0;

    public SimpleArrayThread(int size) {
        array = new int[size];
    }

    public synchronized    void add(int value) {
        int position = writeIndex;
        try {
            Thread.sleep(secureRandom.nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        array[position] = value;
        ++writeIndex;
        System.out.printf("%n %s add value %d to position %d %n the next position is %d%n ",
                Thread.currentThread().getName(), value, position, writeIndex);

    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
