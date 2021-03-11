public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        if (wage <= 0.0) {
            throw new IllegalArgumentException(" The arguments must to be  >= 0.0");
        }
        if (hours >= 168.0 || hours <= 0.0) {
            throw new IllegalArgumentException(" The arguments must to be  >= 0.0 || < 168");
        }
        this.wage = wage;
        this.hours = hours;

    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours <= 0.0) {
            throw new IllegalArgumentException(" The hours must to be  >= 0.0");
        }
        this.hours = hours;
    }

    public void setWage(double wage) {
        if (wage <= 0.0) {
            throw new IllegalArgumentException(" The wage must to be  >= 0.0");
        }
        this.wage = wage;
    }


    @Override
    public String toString() {
        return String.format("%n toString from employee interface :  %s%n  earning from hourly employee :  " +
                "%s%n wage from hourly employee :  %s%n hours from hourly employee :  %s", super.toString(), getPay(),getWage(),getHours());
    }

    @Override
    public double getPay() {
         if (getHours() <= 40) {
            return getHours() * getWage();
        } else {
            return 40 * getWage() + (getHours() - 40) * getWage()*1.5;
        }
    }
}
