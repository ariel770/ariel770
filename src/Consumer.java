import java.security.SecureRandom;

public class Consumer implements Runnable {

    private static SecureRandom secureRandom = new SecureRandom();
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            int sum = 0;
            for (int count = 0; count <= 10; count++) {
                Thread.sleep(secureRandom.nextInt(5000));
                sum += buffer.consume();
                System.out.printf("%n the value was consume by consumer is %d %n%n", sum);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
