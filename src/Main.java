public class Main {
    public static void main(String[] args) {
        EmployeeDate eDate = new EmployeeDate(12, 12, 2010);
        EmployeeDate bDate = new EmployeeDate(11, 11, 2011);

        Employee em1 = new Employee("pinjas","rosemberg",eDate,bDate);
    }
}
