public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String lastName, String firstName, String socialSecurityNumber,
                                      double grossSalary, double rate , double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSalary, rate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    public double earnings() {
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s%n%s%n%s%n%s%n%s",getFirstName(),getLastName(),getSocialSecurityNumber(),getGrossSalary(),getRate(),getBaseSalary(),earnings());
    }
}
