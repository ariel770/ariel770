
public class Main {
    public static void main(String[] args) {
        Time1 time1 = new Time1();
        System.out.println("Initialize time in this parameters : ");
        System.out.println(time1.toString());
        System.out.println(time1.formatedDateTime());
        time1.setTime(11, 34, 34);
        System.out.println("After initializing time in this parameters : ");
        System.out.println(time1.toString());
        System.out.println(time1.formatedDateTime());
        try {
            time1.setTime(67, 67, 56);
        }catch (Exception e) {
              System.out.println(e.getMessage());
        }
        System.out.println("After initializing time in wrong parameters : ");
        System.out.println(time1.toString());
        System.out.println(time1.formatedDateTime());
        time1.setTime(15, 34, 22);
        System.out.println("After initializing time in this parameters : ");
        System.out.println(time1.toString());
        System.out.println(time1.formatedDateTime());


    }
}
