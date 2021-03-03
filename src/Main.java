import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList();
        arrayList.add("yellow");
        arrayList.add(0,"red");
        displayArrayList(arrayList);


    }
    public static void displayArrayList(ArrayList arrayList){
        for(int counter =0 ;counter< arrayList.size();counter++){
            System.out.print(arrayList.get(counter) +" ");
        }
    }
}
