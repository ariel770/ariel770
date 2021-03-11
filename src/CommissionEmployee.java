public class CommissionEmployee extends Employee {

    private double grossSalary;
    private double rate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSalary, double rate) {
        super(firstName, lastName, socialSecurityNumber);

        if (grossSalary <= 0) {
            throw new IllegalArgumentException("the gross salary must to be higher than 0 ");
        }
        if (rate <= 0.0 || rate > 1.0) {
            throw new IllegalArgumentException("the rate must to be higher than 0 ");
        }
        this.rate = rate;
        this.grossSalary = grossSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getRate() {
        return rate;
    }


    public void setRate(double rate) {
        if (rate <= 0.0 || rate > 1.0) {
            throw new IllegalArgumentException(" The rate must to be  >= 0.0");
        }
        this.rate = rate;

    }

    public void setGrossSalary(double grossSalary) {
        if (grossSalary <= 0.0) {
            throw new IllegalArgumentException(" The gross salary  must to be  >= 0.0");
        }
        this.grossSalary = grossSalary;
    }


    @Override
    public String toString() {
        return String.format("%n toString from employee interface :  %s%n  earning from commission salary employee :  %s%n  rate from commission salary employee :  %s%n  gross salary from commission salary employee :  %s", super.toString(), getPay(), getRate(), getGrossSalary());

    }

    @Override
    public double getPay() {
        return getGrossSalary() * getRate();
    }
}
