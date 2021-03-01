public class Main {

    public static void main(String[] args) {
        int ARRAY_LENGTH = 10;
        int arr [] ={0,0,0,0,1,2,3,4,3,2,1,0 };

        for(int counter =0 ; counter <arr.length ; counter++){
            System.out.println(arr[counter]);
            for(int est = 0 ;est < arr[counter];est++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}

