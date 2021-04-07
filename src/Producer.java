import java.security.SecureRandom;

public class Producer implements Runnable {
    private static final SecureRandom sr = new SecureRandom();
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        try {
            int sum = 0;
            for (int count = 0; count <= 10; count++) {
                Thread.sleep(sr.nextInt(5000));
                buffer.produce(count);
                sum += count;
                System.out.printf("%n the value was produce by Producer is %d %n%n", sum);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();

        }
    }
}
