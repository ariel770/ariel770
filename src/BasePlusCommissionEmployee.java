public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String lastName, String firstName, String socialSecurityNumber,
                                      double grossSalary, double rate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSalary, rate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPay() {
        return getGrossSalary() * getRate() +getBaseSalary();
    }

    @Override
    public String toString() {
        return String.format("%n toString from employee interface : " +
                        " %s%n  the new  earning from  basePlusCommissionEmployee : " +
                        "%s the  base salary is : "
                      ,  super.toString(),getPay(),getBaseSalary());
    }
}
