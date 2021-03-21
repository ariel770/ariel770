import java.util.Comparator;

public class TimeComparator implements Comparator<Time2> {
    @Override
    public int compare(Time2 o1, Time2 o2) {
       int hoursDiference = o1.getHour()-o2.getHour();
       if(hoursDiference != 0){
           return hoursDiference;
       }
       int minutesDiference = o1.getMinute()-o2.getMinute();
       if(minutesDiference != 0){
           return minutesDiference;
       }
       int secondsDiference = o1.getSeconds()-o2.getSeconds();
       if(secondsDiference != 0){
           return secondsDiference;
       }

        return 0;
    }
}
