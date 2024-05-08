package Study;
class Time{
    int hour;
    int minute;
    int second;
    public Time(int h, int m, int s){
        hour = h;
        minute = m;
        second = s;
    }
}
class AlarmClock1{
    private Time currentTime;
    private Time alarmTime;
    public AlarmClock1(Time c, Time a){
        currentTime = c;
        alarmTime = a;
    }
}
public class AlarmClockTest1 {
    public static void main(String[] args) {
        Time curr = new Time(12, 58, 30);
        Time alrm = new Time(5, 15, 0);
    }
}