public class EmployeeDate {
    private int year;
    private int month;
    private int day;
    private final int[] dayInMonth = {0, 30, 29, 30, 31, 30, 30, 28, 30, 29, 30, 31, 30};

    public EmployeeDate(int day, int month, int year) {
        if (month <= 0 || month > 13) {
            throw new IllegalArgumentException(" Out of Range ");
        }
        if (day <= 0 || day > dayInMonth[month]) {
            throw new IllegalArgumentException(" Out of Range ");
        }
        this.day = day;
        this.month = month;
        this.year = year;
        System.out.printf("%n%s",this);
    }

    public String toString(){
    return  String.format("%n%s%n%s%n%s", day,month,year);
    }

}
