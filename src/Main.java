import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Buffer buffer = new UnsyncronizeBuffer();
//        ExecutorService service = Executors.newCachedThreadPool();
//        service.execute(new Consumer(buffer));
//        service.execute(new Producer(buffer));
//        service.shutdown();
        SecureRandom se = new SecureRandom();
        int a[] = se.ints(15_000_000).toArray();
        int b[] = new int[a.length];
        System.arraycopy(a,0,b,0,a.length);
        Instant start =  Instant.now();
        Arrays.sort(a);
         Instant end = Instant.now();
       long sortDuration =  Duration.between(start ,end).toMillis();
       System.out.println(sortDuration);
       Instant start1 =  Instant.now();
     Arrays.parallelSort(b);
         Instant end1 = Instant.now();
       long sortDuration1 =  Duration.between(start1 ,end1).toMillis();
       System.out.println(sortDuration1);

       for(int count =0 ; count <b.length ;count++ ){
           System.out.println(b[count]);
       }



    }

}

