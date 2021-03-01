import java.security.SecureRandom;

public class Craps {
    private final int sr = new SecureRandom().nextInt();
    public int getRandom(){
        return sr;
    }


}
