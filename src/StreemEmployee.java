public class StreemEmployee {
    private String lastName;
    private String firstName;
    private double salary;
    private int department;

    public StreemEmployee(String lastName, String firstName, double salary, int department) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
        this.department = department;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return getFirstName() + " " + getLastName();
    }

    @Override
    public String toString() {
        return getFirstName() + " , " + getLastName() + " , " + getSalary() + " , " + getDepartment();
    }
}
