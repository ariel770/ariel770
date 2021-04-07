import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Buffer buffer = new UnsyncronizeBuffer();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new Consumer(buffer));
        service.execute(new Producer(buffer));
        service.shutdown();

    }

}

