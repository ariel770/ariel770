import java.security.SecureRandom;

public class PrintTaskThread implements Runnable {

    private static final SecureRandom sr = new SecureRandom();
    private final int sleeping;
    private final String name;

    public PrintTaskThread(String name) {
        sleeping = sr.nextInt(5000);
        this.name = name;
    }


    @Override
    public void run() {
        try {
            System.out.printf("%s: task going to sleep for: %d milliseconds %n ", name, sleeping);
            Thread.sleep(sleeping);

        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        System.out.printf("%s: wek up %n", name);


    }
}
