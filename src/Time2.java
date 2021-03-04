public class Time2 {
    private int hour;
    private int minute;
    private int seconds;

    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int hour) {
        this(hour, 0, 0);
    }

    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time2(int hour, int minute, int seconds) {
        if (hour < 0 || hour > 24 || minute < 0 || minute > 59 || seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException(" The hour or minutes or seconds , are out of range !! ");
        }
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public Time2(Time2 t) {
        this(t.getMinute(), t.getHour(), t.getSeconds());
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d ", getHour(), getMinute(), getSeconds());

    }
}
