
public abstract class Employee implements Payable{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

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

}

