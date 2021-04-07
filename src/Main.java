import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        SimpleArrayThread simpleArrayThread = new SimpleArrayThread(6);
        ArrayWriter aw1 = new ArrayWriter(1, simpleArrayThread);
        ArrayWriter aw2 = new ArrayWriter(11, simpleArrayThread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(aw1);
        executorService.execute(aw2);
        executorService.shutdown();
        try {
            boolean taskEnd = executorService.awaitTermination(1, TimeUnit.MINUTES);
            if (taskEnd) {
                System.out.printf("%nThe simple array is  %n%s%n", simpleArrayThread.toString());
            } else {
                System.out.println("Time out");

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

