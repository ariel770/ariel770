import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AutoPolicy autoPolicy1 = new AutoPolicy("Toyota Camery",2020);
        AutoPolicy autoPolicy2 = new AutoPolicy("Nissan  Altima",2010);
        getTheAutoPolicyOfCars(autoPolicy1);
        getTheAutoPolicyOfCars(autoPolicy2);
    }
    public static void getTheAutoPolicyOfCars(AutoPolicy autoPolicy ){
        System.out.println(autoPolicy.getCompanyName());
        System.out.println(autoPolicy.getModel());
        System.out.println(autoPolicy.getFullCover());

    }
}
