public class Main extends Object {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee  = new SalariedEmployee("salaried ","employee","11-111-11",200.9);
        System.out.println("salaried employee" + salariedEmployee);
         HourlyEmployee hourlyEmployee  = new HourlyEmployee("hourly ","employee","11-222-11",200,150);
        System.out.println("hourly employee" +hourlyEmployee);
        CommissionEmployee commissionEmployee  = new CommissionEmployee("commission ","employee","11-333-11",30,0.6);
        System.out.println("commission employee" +commissionEmployee);
      BasePlusCommissionEmployee basePlusCommissionEmployee  = new BasePlusCommissionEmployee("commission ","employee","11-333-11",30,0.6,3000);
        System.out.println("basePlusCommissionEmployee employee" +basePlusCommissionEmployee);


        Employee  employees [] = new Employee[4];
        employees[0] = salariedEmployee ;
        employees[1] = hourlyEmployee ;
        employees[2] = commissionEmployee ;
        employees[3] = basePlusCommissionEmployee ;
        System.out.println();
        System.out.println();
        for(Employee employee : employees){
            if(employee instanceof HourlyEmployee){
                HourlyEmployee he = (HourlyEmployee) employee ;
                he.setHours(168);

            }
            System.out.printf(" THE TO STRING FROM EMPLOYEE INTERFACE  :  %s  ",employee.toString());
            System.out.println();
            System.out.println();

        }

    }
}
