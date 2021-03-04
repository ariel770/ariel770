import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DateTime dt = new DateTime(03,23,3);
       System.out.println(dt.formatedDateTime());
    }
}
class DateTime{
    private int hour;
    private int minute;
    private int seconds;

    public DateTime(int hour, int minute, int seconds){
        this.hour=hour;
        this.minute=minute;
        this.seconds= seconds;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d ", hour, minute, seconds);
    }

    public String formatedDateTime() {
        return  "This is function that is calling in implicit : "+ toString()+" And this is function that is calling in explicit :  "+this.toString();
    }
}