import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        PrintTaskThread task1 = new PrintTaskThread("task1");
        PrintTaskThread task2 = new PrintTaskThread("task2");
        PrintTaskThread task3 = new PrintTaskThread("task3");
        System.out.println(" Starting Executors : ");
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);
        executorService.shutdown();
        System.out.println("The Main thread was terminated ");
    }

}

