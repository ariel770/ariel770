
public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s %n The social security number :  %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    public abstract double earning();

}

