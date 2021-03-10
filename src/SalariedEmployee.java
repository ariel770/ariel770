public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        if (weeklySalary <= 0.0) {
            throw new IllegalArgumentException("weekly salary must to be <= 0.0 ");
        }
        this.weeklySalary = weeklySalary;
   }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary <= 0.0) {
            throw new IllegalArgumentException("weekly salary must to be <= 0.0 ");
        }
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earning() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("%n toString from employee interface :  %s%n  earning from saleried employee :  %s", super.toString(),getWeeklySalary());
    }
}
