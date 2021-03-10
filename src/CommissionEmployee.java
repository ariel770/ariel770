public class CommissionEmployee {
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    protected double grossSalary;
    protected double rate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSalary, double rate) {
        if (grossSalary <= 0) {
            throw new IllegalArgumentException("the gross salary must to be higher than 0 ");
        }
        if (rate <= 0.0 || rate > 1.0) {
            throw new IllegalArgumentException("the gross salary must to be higher than 0 ");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.rate = rate;
        this.grossSalary = grossSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getRate() {
        return rate;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setRate(double rate) {
        if (rate <= 0.0 || rate > 1.0) {
            this.rate = rate;
        }
    }

    public void setGrossSalary(double grossSalary) {
        if (grossSalary <= 0.0) {

            this.grossSalary = grossSalary;
        }
    }

    public double earnings() {
        return rate * grossSalary;
    }

    @Override
    public String toString() {
        return  String.format("%s%n%s%n%s%n%s%n%s%n%s%n",getFirstName(),getLastName(),getSocialSecurityNumber(),getGrossSalary(),getRate(),earnings());

    }
}
