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
        return (getGrossSalary() * getRate()) + baseSalary;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", socialSecurityNumber='" +getSocialSecurityNumber() + '\'' +
                ", grossSalary=" + getGrossSalary() +
                ", rate=" + getRate()+ " ,earning is : + "+earnings()+
                '}' ;
    }
}
