
public class Employee {
    private String firstName;
    private String lastName;
    private EmployeeDate hireDate;
    private EmployeeDate birthDate;

    public Employee(String firstName, String lastName, EmployeeDate hireDate, EmployeeDate birthDate) {
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.lastName = lastName;
        this.firstName = firstName;
    }


}

