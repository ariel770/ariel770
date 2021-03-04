public class Time1 {
    private int hour;
    private int minute;
    private int seconds;

    public void setTime(int hour, int minute, int seconds) {
        if (hour < 0 || hour > 24 || minute <= 0 || minute > 59 || seconds <= 0 || seconds > 59) {
            throw new IllegalArgumentException(" The hour or minutes or seconds , are out of range !! ");
        }
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d ", hour, minute, seconds);
    }

    public String formatedDateTime() {
        return String.format("%d:%02d:%02d %s", ((hour == 12 || hour == 0) ? 12 : hour % 12), minute, seconds, (hour < 12) ? "AM" : "PM");
    }

}
