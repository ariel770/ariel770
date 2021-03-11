public class Main extends Object {
    public static void main(String[] args) {
     Payable [] payables =new Payable[4];
     payables[0]= new Invoice("car","33-22-33",120.000,1);
     payables[1]= new Invoice("bus","11-22-11",100.000,1);
     payables[2]= new SalariedEmployee("pinjas","yaakov","11-11-11",23.3);
     payables[3]= new CommissionEmployee("ari","blum","456789",4.0,0.6);
     for(Payable payable : payables){
         System.out.println(payable);
         System.out.println();
         System.out.println();
     }
    }
}
