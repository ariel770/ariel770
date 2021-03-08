public class Main extends Object {
    public static void main(String[] args) {
        CommissionEmployee ec = new CommissionEmployee("pir", "rosemberg",
                "33-333-33", 2.2, 0.1);
        System.out.printf("%s  ",ec);
        System.out.println(ec.earnings());
        BasePlusCommissionEmployee ec1 = new BasePlusCommissionEmployee("pir", "rosemberg",
                "33-333-33", 2.2, 0.1,5000);
        System.out.printf("%s  ",ec1);
        System.out.println(ec1.earnings());

    }
}
