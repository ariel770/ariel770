public class Main extends Object {
    public static void main(String[] args) {
        CommissionEmployee ec = new CommissionEmployee("pir", "rosemberg",
                "33-333-33", 2.2, 0.1);
        System.out.println(ec);
        BasePlusCommissionEmployee ec1 = new BasePlusCommissionEmployee("pir", "rosemberg",
                "33-333-33", 2.2, 0.1, 5000);
        System.out.println(ec1);
        CommissionEmployee ec2 = ec1;
        System.out.println(" Polymorphic system ");
        System.out.println(ec2);
    }
}
