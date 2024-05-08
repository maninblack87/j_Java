package Study;
class Time{
    private int time;
    private int minute;
    private int second;
    public Time(int t, int m, int s){
        time = t;
        minute = m;
        second = s;
    }
    public int getTime(){
        return time;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
}
class AlarmClock{
    private Time currentTime;
    private Time alarmTime;
    public AlarmClock(Time a, Time c){
        alarmTime = a;
        currentTime = c;
    }
    public String getCurrentTime(){
        return String.format("현재 시간은 %d시 %d분 %d초", currentTime.getTime(), currentTime.getMinute(), currentTime.getSecond());
    }
    public String getAlarmTime(){
        return String.format("알람 시간은 %d시 %d분 %d초", alarmTime.getTime(), alarmTime.getMinute(), alarmTime.getSecond());
    }
}
public class AlarmClockTest {
    public static void main(String[] args) {
        Time alarm = new Time(6, 0, 0);
        Time current = new Time(12, 56, 34);
        AlarmClock c = new AlarmClock(alarm, current);
        System.out.println(c.getCurrentTime());
        System.out.println(c.getAlarmTime());
    }
}
