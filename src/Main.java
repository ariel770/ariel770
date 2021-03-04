public class Main {
    public static void main(String[] args) {
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(3);
        Time2 t3 = new Time2(3, 4);
        Time2 t4 = new Time2(23, 1, 5);
        Time2 t5 = new Time2(t2);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println(t4.toString());
        System.out.println(t5.toString());

    }
}
